// 1 Imports for Kotlin to interop with Objective-C and some of the Cocoa Touch frameworks.
import kotlinx.cinterop.ExportObjCClass
import kotlinx.cinterop.ObjCObjectBase.OverrideInit
import kotlinx.cinterop.ObjCOutlet
import platform.CoreLocation.CLLocationCoordinate2DMake
import platform.Foundation.*
import platform.UIKit.*
import platform.MapKit.*

// 2 The class inherits from UIVIewController and conforms to MKMapViewDelegateProtocol. The @ExportObjCClass annotation helps Kotlin create a class that is visible for lookup at runtime.
@ExportObjCClass
class MeteoriteMapViewController : UIViewController, MKMapViewDelegateProtocol {

    // 3 Overrides the UIViewController initializer with a Kotlin constructor.
    @OverrideInit
    constructor(coder: NSCoder) : super(coder)

    @ObjCOutlet
    lateinit var mapView: MKMapView

    // 4 Overrides the viewDidLoad() method.
    override fun viewDidLoad() {
        super.viewDidLoad()

        val center = CLLocationCoordinate2DMake(38.8935754, -77.0847873)
        val span = MKCoordinateSpanMake(0.7, 0.7)
        val region = MKCoordinateRegionMake(center, span)

        with(mapView){
            delegate = this@MeteoriteMapViewController
            setRegion(region, true)
        }

        createAnnotation()
    }

    override fun mapViewDidFailLoadingMap(mapView: MKMapView, withError: NSError) {
        NSLog("Error loading map: $withError")
    }

    private fun createAnnotation(){
        val annotation = MKPointAnnotation().apply {
            setCoordinate(CLLocationCoordinate2DMake(38.8935754, -77.0847873))
            setTitle("My mock meteorite")
            setSubtitle("I'm falling........")
        }

        mapView.addAnnotation(annotation)
    }
}
