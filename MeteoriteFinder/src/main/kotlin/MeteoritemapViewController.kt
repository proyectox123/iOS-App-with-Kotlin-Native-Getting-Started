// 1 Imports for Kotlin to interop with Objective-C and some of the Cocoa Touch frameworks.
import kotlinx.cinterop.ExportObjCClass
import kotlinx.cinterop.ObjCObjectBase.OverrideInit
import kotlinx.cinterop.ObjCOutlet
import platform.Foundation.*
import platform.UIKit.*
import platform.MapKit.*

// 2 The class inherits from UIVIewController and conforms to MKMapViewDelegateProtocol. The @ExportObjCClass annotation helps Kotlin create a class that is visible for lookup at runtime.
@ExportObjCClass
class MeteoriteMapViewController : UIViewController, MKMapViewDelegateProtocol {

    // 3 Overrides the UIViewController initializer with a Kotlin constructor.
    @OverrideInit
    constructor(coder: NSCoder) : super(coder)

    // 4 Overrides the viewDidLoad() method.
    override fun viewDidLoad() {
        super.viewDidLoad()
    }
}
