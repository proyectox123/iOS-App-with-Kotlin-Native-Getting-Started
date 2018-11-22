import kotlinx.cinterop.ExportObjCClass
import kotlinx.cinterop.ObjCObjectBase.OverrideInit
import kotlinx.cinterop.ObjCOutlet
import platform.CoreLocation.CLLocationCoordinate2DMake
import platform.Foundation.*
import platform.UIKit.*
import platform.MapKit.*
import com.afnetworking.*

@ExportObjCClass
class MeteoriteMapViewController : UIViewController, MKMapViewDelegateProtocol {

    @OverrideInit
    constructor(coder: NSCoder) : super(coder)

    @ObjCOutlet
    lateinit var mapView: MKMapView
    var meteoriteList = listOf<Meteorite>()
    val meteoriteAnnotations = mutableListOf<MKPointAnnotation>()

    override fun viewDidLoad() {
        super.viewDidLoad()

        val center = CLLocationCoordinate2DMake(38.8935754, -77.0847873)
        val span = MKCoordinateSpanMake(0.9, 0.9)
        val region = MKCoordinateRegionMake(center, span)

        with(mapView){
            delegate = this@MeteoriteMapViewController
            setRegion(region, true)
        }

        loadData()
    }

    private fun createAnnotation(meteorite:Meteorite) = MKPointAnnotation().apply{
        val latitude = meteorite.reclat.toDouble()
        val longitude = meteorite.reclong.toDouble()

        setCoordinate(CLLocationCoordinate2DMake(latitude, longitude))
        setTitle(meteorite.name)
        setSubtitle("Fell in ${meteorite.year.substringBefore("-")}" +
                " with a mass of ${meteorite.mass} grams")
    }

    override fun mapViewDidFailLoadingMap(mapView: MKMapView, withError: NSError) {
        NSLog("Error loading map: $withError")
    }

    private fun loadData(){
        val userLatitude = 38.8935754
        val userLongitude = -77.0847873

        val baseURL = "https://data.nasa.gov/"
        val path = "resource/y77d-th95.json"
        val params = "?\$where=within_circle(GeoLocation,$userLatitude,$userLongitude,500000)"
        val url = NSURL.URLWithString("$baseURL$path$params")
        val manager = AFHTTPSessionManager.manager()
        manager.responseSerializer = AFJSONResponseSerializer.serializer()
        manager.GET(url?.absoluteString!!, null, null, {
            _:NSURLSessionDataTask?, responseObject:Any? ->
            val listOfObjects = responseObject as? List<HashMap<String, Any>>
            listOfObjects?.let {
                meteoriteList = Meteorite.fromJsonList(it)
                for (meteorite in meteoriteList){
                    meteoriteAnnotations.add(createAnnotation(meteorite))
                }
                mapView.addAnnotations(meteoriteAnnotations)
            }
        }, { _:NSURLSessionDataTask?, error:NSError? ->
            NSLog("Got a error ${error}")
        })
    }
}