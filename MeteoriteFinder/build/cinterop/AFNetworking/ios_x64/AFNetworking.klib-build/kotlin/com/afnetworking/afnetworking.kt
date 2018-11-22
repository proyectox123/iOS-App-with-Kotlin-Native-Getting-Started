@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "CONFLICTING_OVERLOADS", "RETURN_TYPE_MISMATCH_ON_INHERITANCE", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "WRONG_MODIFIER_CONTAINING_DECLARATION", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UNUSED_PARAMETER", "MANY_IMPL_MEMBER_NOT_IMPLEMENTED", "MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED", "EXTENSION_SHADOWED_BY_MEMBER", "REDUNDANT_NULLABLE", "DEPRECATION")
package com.afnetworking

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs._NSZone
import cnames.structs.__CFArray
import cnames.structs.__CFDictionary
import cnames.structs.__CFString
import cnames.structs.__CFURL
import cnames.structs.__SCNetworkReachability
import cnames.structs.__SecTrust
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import objcnames.classes.Protocol
import platform.CoreFoundation.CFArrayRef
import platform.CoreFoundation.CFDictionaryRef
import platform.CoreFoundation.CFStringRef
import platform.CoreFoundation.CFURLRef
import platform.CoreGraphics.CGFloat
import platform.Foundation.NSBundle
import platform.Foundation.NSCachedURLResponse
import platform.Foundation.NSCoder
import platform.Foundation.NSCodingProtocol
import platform.Foundation.NSCodingProtocolMeta
import platform.Foundation.NSCopyingProtocol
import platform.Foundation.NSCopyingProtocolMeta
import platform.Foundation.NSData
import platform.Foundation.NSError
import platform.Foundation.NSHTTPURLResponse
import platform.Foundation.NSIndexSet
import platform.Foundation.NSInputStream
import platform.Foundation.NSJSONReadingOptions
import platform.Foundation.NSJSONWritingOptions
import platform.Foundation.NSMutableURLRequest
import platform.Foundation.NSOperationQueue
import platform.Foundation.NSProgress
import platform.Foundation.NSPropertyListFormat
import platform.Foundation.NSPropertyListReadOptions
import platform.Foundation.NSPropertyListWriteOptions
import platform.Foundation.NSSecureCodingProtocol
import platform.Foundation.NSSecureCodingProtocolMeta
import platform.Foundation.NSStringEncoding
import platform.Foundation.NSTimeInterval
import platform.Foundation.NSURL
import platform.Foundation.NSURLAuthenticationChallenge
import platform.Foundation.NSURLCredential
import platform.Foundation.NSURLRequest
import platform.Foundation.NSURLRequestCachePolicy
import platform.Foundation.NSURLRequestNetworkServiceType
import platform.Foundation.NSURLResponse
import platform.Foundation.NSURLSession
import platform.Foundation.NSURLSessionAuthChallengeDisposition
import platform.Foundation.NSURLSessionConfiguration
import platform.Foundation.NSURLSessionDataDelegateProtocol
import platform.Foundation.NSURLSessionDataDelegateProtocolMeta
import platform.Foundation.NSURLSessionDataTask
import platform.Foundation.NSURLSessionDelayedRequestDisposition
import platform.Foundation.NSURLSessionDelegateProtocol
import platform.Foundation.NSURLSessionDelegateProtocolMeta
import platform.Foundation.NSURLSessionDownloadDelegateProtocol
import platform.Foundation.NSURLSessionDownloadDelegateProtocolMeta
import platform.Foundation.NSURLSessionDownloadTask
import platform.Foundation.NSURLSessionResponseDisposition
import platform.Foundation.NSURLSessionTask
import platform.Foundation.NSURLSessionTaskDelegateProtocol
import platform.Foundation.NSURLSessionTaskDelegateProtocolMeta
import platform.Foundation.NSURLSessionTaskMetrics
import platform.Foundation.NSURLSessionUploadTask
import platform.Foundation.NSZone
import platform.Security.SecTrustRef
import platform.SystemConfiguration.SCNetworkReachabilityRef
import platform.UIKit.UIActivityViewController
import platform.UIKit.UIImage
import platform.UIKit.UIView
import platform.UIKit.UIViewController
import platform.UIKit.UIViewControllerAnimatedTransitioningProtocol
import platform.UIKit.UIViewControllerAnimatedTransitioningProtocolMeta
import platform.UIKit.UIViewControllerContextTransitioningProtocol
import platform.UIKit.UIViewControllerMeta
import platform.darwin.NSInteger
import platform.darwin.NSIntegerVar
import platform.darwin.NSObject
import platform.darwin.NSObjectMeta
import platform.darwin.NSObjectProtocol
import platform.darwin.NSObjectProtocolMeta
import platform.darwin.NSUInteger
import platform.darwin.NSUIntegerVar
import platform.darwin.dispatch_group_t
import platform.darwin.dispatch_queue_t
import platform.posix.int64_t

// NOTE THIS FILE IS AUTO-GENERATED

fun AFPercentEscapedStringFromString(string: String): String {
    return interpretObjCPointerOrNull<String>(kniBridge0(string.objcPtr()))!!
}

fun AFQueryStringFromParameters(parameters: Map<Any?, *>): String {
    return interpretObjCPointerOrNull<String>(kniBridge1(parameters.objcPtr()))!!
}

fun AFStringFromNetworkReachabilityStatus(status: AFNetworkReachabilityStatus): String {
    return interpretObjCPointerOrNull<String>(kniBridge2(status))!!
}

fun UTTypeCreatePreferredIdentifierForTag(inTagClass: CFStringRef?, inTag: CFStringRef?, inConformingToUTI: CFStringRef?): CFStringRef? {
    return interpretCPointer<__CFString>(kniBridge3(inTagClass.rawValue, inTag.rawValue, inConformingToUTI.rawValue))
}

fun UTTypeCreateAllIdentifiersForTag(inTagClass: CFStringRef?, inTag: CFStringRef?, inConformingToUTI: CFStringRef?): CFArrayRef? {
    return interpretCPointer<__CFArray>(kniBridge4(inTagClass.rawValue, inTag.rawValue, inConformingToUTI.rawValue))
}

fun UTTypeCopyPreferredTagWithClass(inUTI: CFStringRef?, inTagClass: CFStringRef?): CFStringRef? {
    return interpretCPointer<__CFString>(kniBridge5(inUTI.rawValue, inTagClass.rawValue))
}

fun UTTypeCopyAllTagsWithClass(inUTI: CFStringRef?, inTagClass: CFStringRef?): CFArrayRef? {
    return interpretCPointer<__CFArray>(kniBridge6(inUTI.rawValue, inTagClass.rawValue))
}

fun UTTypeEqual(inUTI1: CFStringRef?, inUTI2: CFStringRef?): Boolean {
    return kniBridge7(inUTI1.rawValue, inUTI2.rawValue).toBoolean()
}

fun UTTypeConformsTo(inUTI: CFStringRef?, inConformsToUTI: CFStringRef?): Boolean {
    return kniBridge8(inUTI.rawValue, inConformsToUTI.rawValue).toBoolean()
}

fun UTTypeCopyDescription(inUTI: CFStringRef?): CFStringRef? {
    return interpretCPointer<__CFString>(kniBridge9(inUTI.rawValue))
}

fun UTTypeIsDeclared(inUTI: CFStringRef?): Boolean {
    return kniBridge10(inUTI.rawValue).toBoolean()
}

fun UTTypeIsDynamic(inUTI: CFStringRef?): Boolean {
    return kniBridge11(inUTI.rawValue).toBoolean()
}

fun UTTypeCopyDeclaration(inUTI: CFStringRef?): CFDictionaryRef? {
    return interpretCPointer<__CFDictionary>(kniBridge12(inUTI.rawValue))
}

fun UTTypeCopyDeclaringBundleURL(inUTI: CFStringRef?): CFURLRef? {
    return interpretCPointer<__CFURL>(kniBridge13(inUTI.rawValue))
}

@ExternalObjCClass("kniprot_com_afnetworking0") interface AFURLResponseSerializationProtocolMeta : NSObjectProtocolMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
}

@ExternalObjCClass("kniprot_com_afnetworking0") interface AFURLResponseSerializationProtocol : NSObjectProtocol, NSSecureCodingProtocol, NSCopyingProtocol {
    
    @ObjCMethod("responseObjectForResponse:data:error:", "objcKniBridge2")
    fun responseObjectForResponse(response: NSURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Any?
    
    @ObjCMethod("initWithCoder:", "objcKniBridge4")
    override fun initWithCoder(aDecoder: NSCoder): AFURLResponseSerializationProtocol?
}

@ExternalObjCClass("kniprot_com_afnetworking5") interface UIDocumentBrowserViewControllerDelegateProtocolMeta : NSObjectProtocolMeta {
}

@ExternalObjCClass("kniprot_com_afnetworking5") interface UIDocumentBrowserViewControllerDelegateProtocol : NSObjectProtocol {
    
    @ObjCMethod("documentBrowser:didPickDocumentURLs:", "objcKniBridge7")
    fun documentBrowser(controller: UIDocumentBrowserViewController, didPickDocumentURLs: List<*>): Unit = optional()
    
    @ObjCMethod("documentBrowser:didRequestDocumentCreationWithHandler:", "objcKniBridge9")
    fun documentBrowser(controller: UIDocumentBrowserViewController, didRequestDocumentCreationWithHandler: (NSURL?, UIDocumentBrowserImportMode) -> Unit): Unit = optional()
    
    @ObjCMethod("documentBrowser:didImportDocumentAtURL:toDestinationURL:", "objcKniBridge11")
    fun documentBrowser(controller: UIDocumentBrowserViewController, didImportDocumentAtURL: NSURL, toDestinationURL: NSURL): Unit = optional()
    
    @ObjCMethod("documentBrowser:failedToImportDocumentAtURL:error:", "objcKniBridge13")
    fun documentBrowser(controller: UIDocumentBrowserViewController, failedToImportDocumentAtURL: NSURL, error: NSError?): Unit = optional()
    
    @ObjCMethod("documentBrowser:applicationActivitiesForDocumentURLs:", "objcKniBridge15")
    fun documentBrowser(controller: UIDocumentBrowserViewController, applicationActivitiesForDocumentURLs: List<*>): List<*> = optional()
    
    @ObjCMethod("documentBrowser:willPresentActivityViewController:", "objcKniBridge17")
    fun documentBrowser(controller: UIDocumentBrowserViewController, willPresentActivityViewController: UIActivityViewController): Unit = optional()
}

@ExternalObjCClass("kniprot_com_afnetworking18") interface AFURLRequestSerializationProtocolMeta : NSObjectProtocolMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
}

@ExternalObjCClass("kniprot_com_afnetworking18") interface AFURLRequestSerializationProtocol : NSObjectProtocol, NSSecureCodingProtocol, NSCopyingProtocol {
    
    @ObjCMethod("requestBySerializingRequest:withParameters:error:", "objcKniBridge20")
    fun requestBySerializingRequest(request: NSURLRequest, withParameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSURLRequest?
    
    @ObjCMethod("initWithCoder:", "objcKniBridge22")
    override fun initWithCoder(aDecoder: NSCoder): AFURLRequestSerializationProtocol?
}

@ExternalObjCClass("kniprot_com_afnetworking23") interface AFMultipartFormDataProtocolMeta : ObjCObjectMeta {
}

@ExternalObjCClass("kniprot_com_afnetworking23") interface AFMultipartFormDataProtocol : ObjCObject {
    
    @ObjCMethod("appendPartWithFileURL:name:error:", "objcKniBridge25")
    fun appendPartWithFileURL(fileURL: NSURL, name: String, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean
    
    @ObjCMethod("appendPartWithFileURL:name:fileName:mimeType:error:", "objcKniBridge27")
    fun appendPartWithFileURL(fileURL: NSURL, name: String, fileName: String, mimeType: String, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean
    
    @ObjCMethod("appendPartWithInputStream:name:fileName:length:mimeType:", "objcKniBridge29")
    fun appendPartWithInputStream(inputStream: NSInputStream?, name: String, fileName: String, length: int64_t, mimeType: String): Unit
    
    @ObjCMethod("appendPartWithFileData:name:fileName:mimeType:", "objcKniBridge31")
    fun appendPartWithFileData(data: NSData, name: String, fileName: String, mimeType: String): Unit
    
    @ObjCMethod("appendPartWithFormData:name:", "objcKniBridge33")
    fun appendPartWithFormData(data: NSData, name: String): Unit
    
    @ObjCMethod("appendPartWithHeaders:body:", "objcKniBridge35")
    fun appendPartWithHeaders(headers: Map<Any?, *>?, body: NSData): Unit
    
    @ObjCMethod("throttleBandwidthWithPacketSize:delay:", "objcKniBridge37")
    fun throttleBandwidthWithPacketSize(numberOfBytes: NSUInteger, delay: NSTimeInterval): Unit
}

@ExternalObjCClass open class AFHTTPResponseSerializerMeta : NSObjectMeta, AFURLResponseSerializationProtocolMeta {
    
    @ObjCMethod("serializer", "objcKniBridge39")
    external open fun serializer(): AFHTTPResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge41")
    external override fun new(): AFHTTPResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge43")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFHTTPResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge45")
    external override fun alloc(): AFHTTPResponseSerializer?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge47")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFHTTPResponseSerializer : NSObject, AFURLResponseSerializationProtocol {
    companion object : AFHTTPResponseSerializerMeta(), ObjCClassOf<AFHTTPResponseSerializer> {}
    
    var stringEncoding: NSStringEncoding
        get() = objcKniBridge53(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge55(nativeNullPtr, this.objcPtr(), value)
    
    var acceptableStatusCodes: NSIndexSet?
        get() = objcKniBridge57(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge59(nativeNullPtr, this.objcPtr(), value)
    
    var acceptableContentTypes: Set<*>?
        get() = objcKniBridge61(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge63(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("init", "objcKniBridge49")
    external override fun init(): AFHTTPResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("validateResponse:data:error:", "objcKniBridge51")
    external open fun validateResponse(response: NSHTTPURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean
    
    @ObjCMethod("stringEncoding", "objcKniBridge53")
    external open fun stringEncoding(): NSStringEncoding
    
    @ObjCMethod("setStringEncoding:", "objcKniBridge55")
    external open fun setStringEncoding(stringEncoding: NSStringEncoding): Unit
    
    @ObjCMethod("acceptableStatusCodes", "objcKniBridge57")
    external open fun acceptableStatusCodes(): NSIndexSet?
    
    @ObjCMethod("setAcceptableStatusCodes:", "objcKniBridge59")
    external open fun setAcceptableStatusCodes(acceptableStatusCodes: NSIndexSet?): Unit
    
    @ObjCMethod("acceptableContentTypes", "objcKniBridge61")
    external open fun acceptableContentTypes(): Set<*>?
    
    @ObjCMethod("setAcceptableContentTypes:", "objcKniBridge63")
    external open fun setAcceptableContentTypes(acceptableContentTypes: Set<*>?): Unit
    
    @ObjCMethod("initWithCoder:", "objcKniBridge65")
    external override fun initWithCoder(aDecoder: NSCoder): AFHTTPResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("responseObjectForResponse:data:error:", "objcKniBridge67")
    external override fun responseObjectForResponse(response: NSURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Any?
    
    @ObjCMethod("isEqual:", "objcKniBridge69")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge71")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge73")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge75")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge77")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge79")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge81")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge83")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge85")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge87")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge89")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge91")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge93")
    external override fun description(): String?
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge95")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge97")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
    
    @ObjCMethod("debugDescription", "objcKniBridge99")
    external override fun debugDescription(): String?
}

@ExternalObjCClass open class AFJSONResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("serializerWithReadingOptions:", "objcKniBridge101")
    external open fun serializerWithReadingOptions(readingOptions: NSJSONReadingOptions): AFJSONResponseSerializer
    
    @ObjCMethod("serializer", "objcKniBridge103")
    external override fun serializer(): AFJSONResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge105")
    external override fun new(): AFJSONResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge107")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFJSONResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge109")
    external override fun alloc(): AFJSONResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFJSONResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFJSONResponseSerializerMeta(), ObjCClassOf<AFJSONResponseSerializer> {}
    
    var readingOptions: NSJSONReadingOptions
        get() = objcKniBridge111(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge113(nativeNullPtr, this.objcPtr(), value)
    
    var removesKeysWithNullValues: Boolean
        get() = objcKniBridge115(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge117(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("readingOptions", "objcKniBridge111")
    external open fun readingOptions(): NSJSONReadingOptions
    
    @ObjCMethod("setReadingOptions:", "objcKniBridge113")
    external open fun setReadingOptions(readingOptions: NSJSONReadingOptions): Unit
    
    @ObjCMethod("removesKeysWithNullValues", "objcKniBridge115")
    external open fun removesKeysWithNullValues(): Boolean
    
    @ObjCMethod("setRemovesKeysWithNullValues:", "objcKniBridge117")
    external open fun setRemovesKeysWithNullValues(removesKeysWithNullValues: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge119")
    external override fun init(): AFJSONResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge121")
    external override fun initWithCoder(aDecoder: NSCoder): AFJSONResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFXMLParserResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("serializer", "objcKniBridge123")
    external override fun serializer(): AFXMLParserResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge125")
    external override fun new(): AFXMLParserResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge127")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFXMLParserResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge129")
    external override fun alloc(): AFXMLParserResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFXMLParserResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFXMLParserResponseSerializerMeta(), ObjCClassOf<AFXMLParserResponseSerializer> {}
    
    @ObjCMethod("init", "objcKniBridge131")
    external override fun init(): AFXMLParserResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge133")
    external override fun initWithCoder(aDecoder: NSCoder): AFXMLParserResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFPropertyListResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("serializerWithFormat:readOptions:", "objcKniBridge135")
    external open fun serializerWithFormat(format: NSPropertyListFormat, readOptions: NSPropertyListReadOptions): AFPropertyListResponseSerializer
    
    @ObjCMethod("serializer", "objcKniBridge137")
    external override fun serializer(): AFPropertyListResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge139")
    external override fun new(): AFPropertyListResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge141")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFPropertyListResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge143")
    external override fun alloc(): AFPropertyListResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFPropertyListResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFPropertyListResponseSerializerMeta(), ObjCClassOf<AFPropertyListResponseSerializer> {}
    
    var format: NSPropertyListFormat
        get() = objcKniBridge145(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge147(nativeNullPtr, this.objcPtr(), value)
    
    var readOptions: NSPropertyListReadOptions
        get() = objcKniBridge149(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge151(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("format", "objcKniBridge145")
    external open fun format(): NSPropertyListFormat
    
    @ObjCMethod("setFormat:", "objcKniBridge147")
    external open fun setFormat(format: NSPropertyListFormat): Unit
    
    @ObjCMethod("readOptions", "objcKniBridge149")
    external open fun readOptions(): NSPropertyListReadOptions
    
    @ObjCMethod("setReadOptions:", "objcKniBridge151")
    external open fun setReadOptions(readOptions: NSPropertyListReadOptions): Unit
    
    @ObjCMethod("init", "objcKniBridge153")
    external override fun init(): AFPropertyListResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge155")
    external override fun initWithCoder(aDecoder: NSCoder): AFPropertyListResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFImageResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("serializer", "objcKniBridge157")
    external override fun serializer(): AFImageResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge159")
    external override fun new(): AFImageResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge161")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFImageResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge163")
    external override fun alloc(): AFImageResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFImageResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFImageResponseSerializerMeta(), ObjCClassOf<AFImageResponseSerializer> {}
    
    var imageScale: CGFloat
        get() = objcKniBridge165(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge167(nativeNullPtr, this.objcPtr(), value)
    
    var automaticallyInflatesResponseImage: Boolean
        get() = objcKniBridge169(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge171(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("imageScale", "objcKniBridge165")
    external open fun imageScale(): CGFloat
    
    @ObjCMethod("setImageScale:", "objcKniBridge167")
    external open fun setImageScale(imageScale: CGFloat): Unit
    
    @ObjCMethod("automaticallyInflatesResponseImage", "objcKniBridge169")
    external open fun automaticallyInflatesResponseImage(): Boolean
    
    @ObjCMethod("setAutomaticallyInflatesResponseImage:", "objcKniBridge171")
    external open fun setAutomaticallyInflatesResponseImage(automaticallyInflatesResponseImage: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge173")
    external override fun init(): AFImageResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge175")
    external override fun initWithCoder(aDecoder: NSCoder): AFImageResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFCompoundResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("compoundSerializerWithResponseSerializers:", "objcKniBridge177")
    external open fun compoundSerializerWithResponseSerializers(responseSerializers: List<*>): AFCompoundResponseSerializer
    
    @ObjCMethod("serializer", "objcKniBridge179")
    external override fun serializer(): AFCompoundResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge181")
    external override fun new(): AFCompoundResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge183")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFCompoundResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge185")
    external override fun alloc(): AFCompoundResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFCompoundResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFCompoundResponseSerializerMeta(), ObjCClassOf<AFCompoundResponseSerializer> {}
    
    val responseSerializers: List<*>
        get() = objcKniBridge187(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("responseSerializers", "objcKniBridge187")
    external open fun responseSerializers(): List<*>
    
    @ObjCMethod("init", "objcKniBridge189")
    external override fun init(): AFCompoundResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge191")
    external override fun initWithCoder(aDecoder: NSCoder): AFCompoundResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class UIDocumentBrowserViewControllerMeta : UIViewControllerMeta, NSCodingProtocolMeta {
    
    @ObjCMethod("new", "objcKniBridge193")
    external override fun new(): UIDocumentBrowserViewController?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge195")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): UIDocumentBrowserViewController?
    
    @ObjCMethod("alloc", "objcKniBridge197")
    external override fun alloc(): UIDocumentBrowserViewController?
    
    protected constructor() {}
}

@ExternalObjCClass open class UIDocumentBrowserViewController : UIViewController, NSCodingProtocol {
    companion object : UIDocumentBrowserViewControllerMeta(), ObjCClassOf<UIDocumentBrowserViewController> {}
    
    var delegate: UIDocumentBrowserViewControllerDelegateProtocol?
        get() = objcKniBridge207(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge209(nativeNullPtr, this.objcPtr(), value)
    
    var allowsDocumentCreation: Boolean
        get() = objcKniBridge211(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge213(nativeNullPtr, this.objcPtr(), value)
    
    var allowsPickingMultipleItems: Boolean
        get() = objcKniBridge215(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge217(nativeNullPtr, this.objcPtr(), value)
    
    val allowedContentTypes: List<*>
        get() = objcKniBridge219(nativeNullPtr, this.objcPtr())
    
    var additionalLeadingNavigationBarButtonItems: List<*>
        get() = objcKniBridge221(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge223(nativeNullPtr, this.objcPtr(), value)
    
    var additionalTrailingNavigationBarButtonItems: List<*>
        get() = objcKniBridge225(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge227(nativeNullPtr, this.objcPtr(), value)
    
    var customActions: List<*>
        get() = objcKniBridge229(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge231(nativeNullPtr, this.objcPtr(), value)
    
    var browserUserInterfaceStyle: UIDocumentBrowserUserInterfaceStyle
        get() = objcKniBridge233(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge235(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("initForOpeningFilesWithContentTypes:", "objcKniBridge199")
    external open fun initForOpeningFilesWithContentTypes(allowedContentTypes: List<*>?): UIDocumentBrowserViewController
    
    @ObjCConstructor("initForOpeningFilesWithContentTypes:", true)
    constructor(forOpeningFilesWithContentTypes: List<*>?) {}
    
    @ObjCMethod("revealDocumentAtURL:importIfNeeded:completion:", "objcKniBridge201")
    external open fun revealDocumentAtURL(url: NSURL, importIfNeeded: Boolean, completion: ((NSURL?, NSError?) -> Unit)?): Unit
    
    @ObjCMethod("importDocumentAtURL:nextToDocumentAtURL:mode:completionHandler:", "objcKniBridge203")
    external open fun importDocumentAtURL(documentURL: NSURL, nextToDocumentAtURL: NSURL, mode: UIDocumentBrowserImportMode, completionHandler: (NSURL?, NSError?) -> Unit): Unit
    
    @ObjCMethod("transitionControllerForDocumentURL:", "objcKniBridge205")
    external open fun transitionControllerForDocumentURL(documentURL: NSURL): UIDocumentBrowserTransitionController
    
    @ObjCMethod("delegate", "objcKniBridge207")
    external open fun delegate(): UIDocumentBrowserViewControllerDelegateProtocol?
    
    @ObjCMethod("setDelegate:", "objcKniBridge209")
    external open fun setDelegate(delegate: UIDocumentBrowserViewControllerDelegateProtocol?): Unit
    
    @ObjCMethod("allowsDocumentCreation", "objcKniBridge211")
    external open fun allowsDocumentCreation(): Boolean
    
    @ObjCMethod("setAllowsDocumentCreation:", "objcKniBridge213")
    external open fun setAllowsDocumentCreation(allowsDocumentCreation: Boolean): Unit
    
    @ObjCMethod("allowsPickingMultipleItems", "objcKniBridge215")
    external open fun allowsPickingMultipleItems(): Boolean
    
    @ObjCMethod("setAllowsPickingMultipleItems:", "objcKniBridge217")
    external open fun setAllowsPickingMultipleItems(allowsPickingMultipleItems: Boolean): Unit
    
    @ObjCMethod("allowedContentTypes", "objcKniBridge219")
    external open fun allowedContentTypes(): List<*>
    
    @ObjCMethod("additionalLeadingNavigationBarButtonItems", "objcKniBridge221")
    external open fun additionalLeadingNavigationBarButtonItems(): List<*>
    
    @ObjCMethod("setAdditionalLeadingNavigationBarButtonItems:", "objcKniBridge223")
    external open fun setAdditionalLeadingNavigationBarButtonItems(additionalLeadingNavigationBarButtonItems: List<*>): Unit
    
    @ObjCMethod("additionalTrailingNavigationBarButtonItems", "objcKniBridge225")
    external open fun additionalTrailingNavigationBarButtonItems(): List<*>
    
    @ObjCMethod("setAdditionalTrailingNavigationBarButtonItems:", "objcKniBridge227")
    external open fun setAdditionalTrailingNavigationBarButtonItems(additionalTrailingNavigationBarButtonItems: List<*>): Unit
    
    @ObjCMethod("customActions", "objcKniBridge229")
    external open fun customActions(): List<*>
    
    @ObjCMethod("setCustomActions:", "objcKniBridge231")
    external open fun setCustomActions(customActions: List<*>): Unit
    
    @ObjCMethod("browserUserInterfaceStyle", "objcKniBridge233")
    external open fun browserUserInterfaceStyle(): UIDocumentBrowserUserInterfaceStyle
    
    @ObjCMethod("setBrowserUserInterfaceStyle:", "objcKniBridge235")
    external open fun setBrowserUserInterfaceStyle(browserUserInterfaceStyle: UIDocumentBrowserUserInterfaceStyle): Unit
    
    @ObjCMethod("initWithNibName:bundle:", "objcKniBridge237")
    external override fun initWithNibName(nibNameOrNil: String?, bundle: NSBundle?): UIDocumentBrowserViewController
    
    @ObjCConstructor("initWithNibName:bundle:", false)
    constructor(nibName: String?, bundle: NSBundle?) {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge239")
    external override fun initWithCoder(aDecoder: NSCoder): UIDocumentBrowserViewController?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("init", "objcKniBridge241")
    external override fun init(): UIDocumentBrowserViewController?
    
    @ObjCConstructor("init", false)
    constructor() {}
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge243")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
}

@ExternalObjCClass open class UIDocumentBrowserTransitionControllerMeta : NSObjectMeta, UIViewControllerAnimatedTransitioningProtocolMeta {
    
    @ObjCMethod("new", "objcKniBridge245")
    external override fun new(): UIDocumentBrowserTransitionController?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge247")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): UIDocumentBrowserTransitionController?
    
    @ObjCMethod("alloc", "objcKniBridge249")
    external override fun alloc(): UIDocumentBrowserTransitionController?
    
    protected constructor() {}
}

@ExternalObjCClass open class UIDocumentBrowserTransitionController : NSObject, UIViewControllerAnimatedTransitioningProtocol {
    companion object : UIDocumentBrowserTransitionControllerMeta(), ObjCClassOf<UIDocumentBrowserTransitionController> {}
    
    var loadingProgress: NSProgress?
        get() = objcKniBridge251(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge253(nativeNullPtr, this.objcPtr(), value)
    
    var targetView: UIView?
        get() = objcKniBridge255(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge257(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("loadingProgress", "objcKniBridge251")
    external open fun loadingProgress(): NSProgress?
    
    @ObjCMethod("setLoadingProgress:", "objcKniBridge253")
    external open fun setLoadingProgress(loadingProgress: NSProgress?): Unit
    
    @ObjCMethod("targetView", "objcKniBridge255")
    external open fun targetView(): UIView?
    
    @ObjCMethod("setTargetView:", "objcKniBridge257")
    external open fun setTargetView(targetView: UIView?): Unit
    
    @ObjCMethod("init", "objcKniBridge259")
    external override fun init(): UIDocumentBrowserTransitionController?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("transitionDuration:", "objcKniBridge261")
    external override fun transitionDuration(transitionContext: UIViewControllerContextTransitioningProtocol?): NSTimeInterval
    
    @ObjCMethod("animateTransition:", "objcKniBridge263")
    external override fun animateTransition(transitionContext: UIViewControllerContextTransitioningProtocol): Unit
    
    @ObjCMethod("isEqual:", "objcKniBridge265")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge267")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge269")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge271")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge273")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge275")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge277")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge279")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge281")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge283")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge285")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge287")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge289")
    external override fun description(): String?
    
    @ObjCMethod("debugDescription", "objcKniBridge291")
    external override fun debugDescription(): String?
}

@ExternalObjCClass open class UIDocumentBrowserActionMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge293")
    external override fun new(): UIDocumentBrowserAction?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge295")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): UIDocumentBrowserAction?
    
    @ObjCMethod("alloc", "objcKniBridge297")
    external override fun alloc(): UIDocumentBrowserAction?
    
    protected constructor() {}
}

@ExternalObjCClass open class UIDocumentBrowserAction : NSObject {
    companion object : UIDocumentBrowserActionMeta(), ObjCClassOf<UIDocumentBrowserAction> {}
    
    val identifier: String
        get() = objcKniBridge301(nativeNullPtr, this.objcPtr())
    
    val localizedTitle: String
        get() = objcKniBridge303(nativeNullPtr, this.objcPtr())
    
    val availability: UIDocumentBrowserActionAvailability
        get() = objcKniBridge305(nativeNullPtr, this.objcPtr())
    
    var image: UIImage?
        get() = objcKniBridge307(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge309(nativeNullPtr, this.objcPtr(), value)
    
    var supportedContentTypes: List<*>
        get() = objcKniBridge311(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge313(nativeNullPtr, this.objcPtr(), value)
    
    var supportsMultipleItems: Boolean
        get() = objcKniBridge315(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge317(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("initWithIdentifier:localizedTitle:availability:handler:", "objcKniBridge299")
    external open fun initWithIdentifier(identifier: String, localizedTitle: String, availability: UIDocumentBrowserActionAvailability, handler: (List<*>?) -> Unit): UIDocumentBrowserAction
    
    @ObjCConstructor("initWithIdentifier:localizedTitle:availability:handler:", true)
    constructor(identifier: String, localizedTitle: String, availability: UIDocumentBrowserActionAvailability, handler: (List<*>?) -> Unit) {}
    
    @ObjCMethod("identifier", "objcKniBridge301")
    external open fun identifier(): String
    
    @ObjCMethod("localizedTitle", "objcKniBridge303")
    external open fun localizedTitle(): String
    
    @ObjCMethod("availability", "objcKniBridge305")
    external open fun availability(): UIDocumentBrowserActionAvailability
    
    @ObjCMethod("image", "objcKniBridge307")
    external open fun image(): UIImage?
    
    @ObjCMethod("setImage:", "objcKniBridge309")
    external open fun setImage(image: UIImage?): Unit
    
    @ObjCMethod("supportedContentTypes", "objcKniBridge311")
    external open fun supportedContentTypes(): List<*>
    
    @ObjCMethod("setSupportedContentTypes:", "objcKniBridge313")
    external open fun setSupportedContentTypes(supportedContentTypes: List<*>): Unit
    
    @ObjCMethod("supportsMultipleItems", "objcKniBridge315")
    external open fun supportsMultipleItems(): Boolean
    
    @ObjCMethod("setSupportsMultipleItems:", "objcKniBridge317")
    external open fun setSupportsMultipleItems(supportsMultipleItems: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge319")
    external override fun init(): UIDocumentBrowserAction?
    
    @ObjCConstructor("init", false)
    constructor() {}
}

@ExternalObjCClass open class AFHTTPRequestSerializerMeta : NSObjectMeta, AFURLRequestSerializationProtocolMeta {
    
    @ObjCMethod("serializer", "objcKniBridge321")
    external open fun serializer(): AFHTTPRequestSerializer
    
    @ObjCMethod("new", "objcKniBridge323")
    external override fun new(): AFHTTPRequestSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge325")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFHTTPRequestSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge327")
    external override fun alloc(): AFHTTPRequestSerializer?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge329")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFHTTPRequestSerializer : NSObject, AFURLRequestSerializationProtocol {
    companion object : AFHTTPRequestSerializerMeta(), ObjCClassOf<AFHTTPRequestSerializer> {}
    
    var stringEncoding: NSStringEncoding
        get() = objcKniBridge349(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge351(nativeNullPtr, this.objcPtr(), value)
    
    var allowsCellularAccess: Boolean
        get() = objcKniBridge353(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge355(nativeNullPtr, this.objcPtr(), value)
    
    var cachePolicy: NSURLRequestCachePolicy
        get() = objcKniBridge357(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge359(nativeNullPtr, this.objcPtr(), value)
    
    var HTTPShouldHandleCookies: Boolean
        get() = objcKniBridge361(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge363(nativeNullPtr, this.objcPtr(), value)
    
    var HTTPShouldUsePipelining: Boolean
        get() = objcKniBridge365(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge367(nativeNullPtr, this.objcPtr(), value)
    
    var networkServiceType: NSURLRequestNetworkServiceType
        get() = objcKniBridge369(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge371(nativeNullPtr, this.objcPtr(), value)
    
    var timeoutInterval: NSTimeInterval
        get() = objcKniBridge373(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge375(nativeNullPtr, this.objcPtr(), value)
    
    val HTTPRequestHeaders: Map<Any?, *>
        get() = objcKniBridge377(nativeNullPtr, this.objcPtr())
    
    var HTTPMethodsEncodingParametersInURI: Set<*>
        get() = objcKniBridge379(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge381(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("setValue:forHTTPHeaderField:", "objcKniBridge331")
    external open fun setValue(value: String?, forHTTPHeaderField: String): Unit
    
    @ObjCMethod("valueForHTTPHeaderField:", "objcKniBridge333")
    external open fun valueForHTTPHeaderField(field: String): String?
    
    @ObjCMethod("setAuthorizationHeaderFieldWithUsername:password:", "objcKniBridge335")
    external open fun setAuthorizationHeaderFieldWithUsername(username: String, password: String): Unit
    
    @ObjCMethod("clearAuthorizationHeader", "objcKniBridge337")
    external open fun clearAuthorizationHeader(): Unit
    
    @ObjCMethod("setQueryStringSerializationWithStyle:", "objcKniBridge339")
    external open fun setQueryStringSerializationWithStyle(style: AFHTTPRequestQueryStringSerializationStyle): Unit
    
    @ObjCMethod("setQueryStringSerializationWithBlock:", "objcKniBridge341")
    external open fun setQueryStringSerializationWithBlock(block: ((NSURLRequest?, Any?, CPointer<ObjCObjectVar<NSError?>>?) -> String?)?): Unit
    
    @ObjCMethod("requestWithMethod:URLString:parameters:error:", "objcKniBridge343")
    external open fun requestWithMethod(method: String, URLString: String, parameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSMutableURLRequest
    
    @ObjCMethod("multipartFormRequestWithMethod:URLString:parameters:constructingBodyWithBlock:error:", "objcKniBridge345")
    external open fun multipartFormRequestWithMethod(method: String, URLString: String, parameters: Map<Any?, *>?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, error: CPointer<ObjCObjectVar<NSError?>>?): NSMutableURLRequest
    
    @ObjCMethod("requestWithMultipartFormRequest:writingStreamContentsToFile:completionHandler:", "objcKniBridge347")
    external open fun requestWithMultipartFormRequest(request: NSURLRequest, writingStreamContentsToFile: NSURL, completionHandler: ((NSError?) -> Unit)?): NSMutableURLRequest
    
    @ObjCMethod("stringEncoding", "objcKniBridge349")
    external open fun stringEncoding(): NSStringEncoding
    
    @ObjCMethod("setStringEncoding:", "objcKniBridge351")
    external open fun setStringEncoding(stringEncoding: NSStringEncoding): Unit
    
    @ObjCMethod("allowsCellularAccess", "objcKniBridge353")
    external open fun allowsCellularAccess(): Boolean
    
    @ObjCMethod("setAllowsCellularAccess:", "objcKniBridge355")
    external open fun setAllowsCellularAccess(allowsCellularAccess: Boolean): Unit
    
    @ObjCMethod("cachePolicy", "objcKniBridge357")
    external open fun cachePolicy(): NSURLRequestCachePolicy
    
    @ObjCMethod("setCachePolicy:", "objcKniBridge359")
    external open fun setCachePolicy(cachePolicy: NSURLRequestCachePolicy): Unit
    
    @ObjCMethod("HTTPShouldHandleCookies", "objcKniBridge361")
    external open fun HTTPShouldHandleCookies(): Boolean
    
    @ObjCMethod("setHTTPShouldHandleCookies:", "objcKniBridge363")
    external open fun setHTTPShouldHandleCookies(HTTPShouldHandleCookies: Boolean): Unit
    
    @ObjCMethod("HTTPShouldUsePipelining", "objcKniBridge365")
    external open fun HTTPShouldUsePipelining(): Boolean
    
    @ObjCMethod("setHTTPShouldUsePipelining:", "objcKniBridge367")
    external open fun setHTTPShouldUsePipelining(HTTPShouldUsePipelining: Boolean): Unit
    
    @ObjCMethod("networkServiceType", "objcKniBridge369")
    external open fun networkServiceType(): NSURLRequestNetworkServiceType
    
    @ObjCMethod("setNetworkServiceType:", "objcKniBridge371")
    external open fun setNetworkServiceType(networkServiceType: NSURLRequestNetworkServiceType): Unit
    
    @ObjCMethod("timeoutInterval", "objcKniBridge373")
    external open fun timeoutInterval(): NSTimeInterval
    
    @ObjCMethod("setTimeoutInterval:", "objcKniBridge375")
    external open fun setTimeoutInterval(timeoutInterval: NSTimeInterval): Unit
    
    @ObjCMethod("HTTPRequestHeaders", "objcKniBridge377")
    external open fun HTTPRequestHeaders(): Map<Any?, *>
    
    @ObjCMethod("HTTPMethodsEncodingParametersInURI", "objcKniBridge379")
    external open fun HTTPMethodsEncodingParametersInURI(): Set<*>
    
    @ObjCMethod("setHTTPMethodsEncodingParametersInURI:", "objcKniBridge381")
    external open fun setHTTPMethodsEncodingParametersInURI(HTTPMethodsEncodingParametersInURI: Set<*>): Unit
    
    @ObjCMethod("init", "objcKniBridge383")
    external override fun init(): AFHTTPRequestSerializer?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge385")
    external override fun initWithCoder(aDecoder: NSCoder): AFHTTPRequestSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("requestBySerializingRequest:withParameters:error:", "objcKniBridge387")
    external override fun requestBySerializingRequest(request: NSURLRequest, withParameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSURLRequest?
    
    @ObjCMethod("isEqual:", "objcKniBridge389")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge391")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge393")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge395")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge397")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge399")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge401")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge403")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge405")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge407")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge409")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge411")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge413")
    external override fun description(): String?
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge415")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge417")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
    
    @ObjCMethod("debugDescription", "objcKniBridge419")
    external override fun debugDescription(): String?
}

@ExternalObjCClass open class AFJSONRequestSerializerMeta : AFHTTPRequestSerializerMeta {
    
    @ObjCMethod("serializerWithWritingOptions:", "objcKniBridge421")
    external open fun serializerWithWritingOptions(writingOptions: NSJSONWritingOptions): AFJSONRequestSerializer
    
    @ObjCMethod("serializer", "objcKniBridge423")
    external override fun serializer(): AFJSONRequestSerializer
    
    @ObjCMethod("new", "objcKniBridge425")
    external override fun new(): AFJSONRequestSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge427")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFJSONRequestSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge429")
    external override fun alloc(): AFJSONRequestSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFJSONRequestSerializer : AFHTTPRequestSerializer {
    companion object : AFJSONRequestSerializerMeta(), ObjCClassOf<AFJSONRequestSerializer> {}
    
    var writingOptions: NSJSONWritingOptions
        get() = objcKniBridge431(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge433(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("writingOptions", "objcKniBridge431")
    external open fun writingOptions(): NSJSONWritingOptions
    
    @ObjCMethod("setWritingOptions:", "objcKniBridge433")
    external open fun setWritingOptions(writingOptions: NSJSONWritingOptions): Unit
    
    @ObjCMethod("init", "objcKniBridge435")
    external override fun init(): AFJSONRequestSerializer?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge437")
    external override fun initWithCoder(aDecoder: NSCoder): AFJSONRequestSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFPropertyListRequestSerializerMeta : AFHTTPRequestSerializerMeta {
    
    @ObjCMethod("serializerWithFormat:writeOptions:", "objcKniBridge439")
    external open fun serializerWithFormat(format: NSPropertyListFormat, writeOptions: NSPropertyListWriteOptions): AFPropertyListRequestSerializer
    
    @ObjCMethod("serializer", "objcKniBridge441")
    external override fun serializer(): AFPropertyListRequestSerializer
    
    @ObjCMethod("new", "objcKniBridge443")
    external override fun new(): AFPropertyListRequestSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge445")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFPropertyListRequestSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge447")
    external override fun alloc(): AFPropertyListRequestSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFPropertyListRequestSerializer : AFHTTPRequestSerializer {
    companion object : AFPropertyListRequestSerializerMeta(), ObjCClassOf<AFPropertyListRequestSerializer> {}
    
    var format: NSPropertyListFormat
        get() = objcKniBridge449(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge451(nativeNullPtr, this.objcPtr(), value)
    
    var writeOptions: NSPropertyListWriteOptions
        get() = objcKniBridge453(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge455(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("format", "objcKniBridge449")
    external open fun format(): NSPropertyListFormat
    
    @ObjCMethod("setFormat:", "objcKniBridge451")
    external open fun setFormat(format: NSPropertyListFormat): Unit
    
    @ObjCMethod("writeOptions", "objcKniBridge453")
    external open fun writeOptions(): NSPropertyListWriteOptions
    
    @ObjCMethod("setWriteOptions:", "objcKniBridge455")
    external open fun setWriteOptions(writeOptions: NSPropertyListWriteOptions): Unit
    
    @ObjCMethod("init", "objcKniBridge457")
    external override fun init(): AFPropertyListRequestSerializer?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge459")
    external override fun initWithCoder(aDecoder: NSCoder): AFPropertyListRequestSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFSecurityPolicyMeta : NSObjectMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("certificatesInBundle:", "objcKniBridge461")
    external open fun certificatesInBundle(bundle: NSBundle): Set<*>
    
    @ObjCMethod("defaultPolicy", "objcKniBridge463")
    external open fun defaultPolicy(): AFSecurityPolicy
    
    @ObjCMethod("policyWithPinningMode:", "objcKniBridge465")
    external open fun policyWithPinningMode(pinningMode: AFSSLPinningMode): AFSecurityPolicy
    
    @ObjCMethod("policyWithPinningMode:withPinnedCertificates:", "objcKniBridge467")
    external open fun policyWithPinningMode(pinningMode: AFSSLPinningMode, withPinnedCertificates: Set<*>): AFSecurityPolicy
    
    @ObjCMethod("new", "objcKniBridge469")
    external override fun new(): AFSecurityPolicy?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge471")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFSecurityPolicy?
    
    @ObjCMethod("alloc", "objcKniBridge473")
    external override fun alloc(): AFSecurityPolicy?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge475")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFSecurityPolicy : NSObject, NSSecureCodingProtocol, NSCopyingProtocol {
    companion object : AFSecurityPolicyMeta(), ObjCClassOf<AFSecurityPolicy> {}
    
    val SSLPinningMode: AFSSLPinningMode
        get() = objcKniBridge479(nativeNullPtr, this.objcPtr())
    
    var pinnedCertificates: Set<*>?
        get() = objcKniBridge481(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge483(nativeNullPtr, this.objcPtr(), value)
    
    var allowInvalidCertificates: Boolean
        get() = objcKniBridge485(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge487(nativeNullPtr, this.objcPtr(), value)
    
    var validatesDomainName: Boolean
        get() = objcKniBridge489(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge491(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("evaluateServerTrust:forDomain:", "objcKniBridge477")
    external open fun evaluateServerTrust(serverTrust: SecTrustRef?, forDomain: String?): Boolean
    
    @ObjCMethod("SSLPinningMode", "objcKniBridge479")
    external open fun SSLPinningMode(): AFSSLPinningMode
    
    @ObjCMethod("pinnedCertificates", "objcKniBridge481")
    external open fun pinnedCertificates(): Set<*>?
    
    @ObjCMethod("setPinnedCertificates:", "objcKniBridge483")
    external open fun setPinnedCertificates(pinnedCertificates: Set<*>?): Unit
    
    @ObjCMethod("allowInvalidCertificates", "objcKniBridge485")
    external open fun allowInvalidCertificates(): Boolean
    
    @ObjCMethod("setAllowInvalidCertificates:", "objcKniBridge487")
    external open fun setAllowInvalidCertificates(allowInvalidCertificates: Boolean): Unit
    
    @ObjCMethod("validatesDomainName", "objcKniBridge489")
    external open fun validatesDomainName(): Boolean
    
    @ObjCMethod("setValidatesDomainName:", "objcKniBridge491")
    external open fun setValidatesDomainName(validatesDomainName: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge493")
    external override fun init(): AFSecurityPolicy?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge495")
    external override fun initWithCoder(aDecoder: NSCoder): AFSecurityPolicy?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge497")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge499")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
}

@ExternalObjCClass open class AFNetworkReachabilityManagerMeta : NSObjectMeta {
    
    @ObjCMethod("sharedManager", "objcKniBridge501")
    external open fun sharedManager(): AFNetworkReachabilityManager
    
    @ObjCMethod("manager", "objcKniBridge503")
    external open fun manager(): AFNetworkReachabilityManager
    
    @ObjCMethod("managerForDomain:", "objcKniBridge505")
    external open fun managerForDomain(domain: String): AFNetworkReachabilityManager
    
    @ObjCMethod("managerForAddress:", "objcKniBridge507")
    external open fun managerForAddress(address: COpaquePointer?): AFNetworkReachabilityManager
    
    @ObjCMethod("new", "objcKniBridge509")
    external override fun new(): AFNetworkReachabilityManager?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge511")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFNetworkReachabilityManager?
    
    @ObjCMethod("alloc", "objcKniBridge513")
    external override fun alloc(): AFNetworkReachabilityManager?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFNetworkReachabilityManager : NSObject {
    companion object : AFNetworkReachabilityManagerMeta(), ObjCClassOf<AFNetworkReachabilityManager> {}
    
    val networkReachabilityStatus: AFNetworkReachabilityStatus
        get() = objcKniBridge525(nativeNullPtr, this.objcPtr())
    
    val reachable: Boolean
        get() = objcKniBridge527(nativeNullPtr, this.objcPtr())
    
    val reachableViaWWAN: Boolean
        get() = objcKniBridge529(nativeNullPtr, this.objcPtr())
    
    val reachableViaWiFi: Boolean
        get() = objcKniBridge531(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("initWithReachability:", "objcKniBridge515")
    external open fun initWithReachability(reachability: SCNetworkReachabilityRef?): AFNetworkReachabilityManager
    
    @ObjCConstructor("initWithReachability:", true)
    constructor(reachability: SCNetworkReachabilityRef?) {}
    
    @ObjCMethod("startMonitoring", "objcKniBridge517")
    external open fun startMonitoring(): Unit
    
    @ObjCMethod("stopMonitoring", "objcKniBridge519")
    external open fun stopMonitoring(): Unit
    
    @ObjCMethod("localizedNetworkReachabilityStatusString", "objcKniBridge521")
    external open fun localizedNetworkReachabilityStatusString(): String
    
    @ObjCMethod("setReachabilityStatusChangeBlock:", "objcKniBridge523")
    external open fun setReachabilityStatusChangeBlock(block: ((AFNetworkReachabilityStatus) -> Unit)?): Unit
    
    @ObjCMethod("networkReachabilityStatus", "objcKniBridge525")
    external open fun networkReachabilityStatus(): AFNetworkReachabilityStatus
    
    @ObjCMethod("isReachable", "objcKniBridge527")
    external open fun isReachable(): Boolean
    
    @ObjCMethod("isReachableViaWWAN", "objcKniBridge529")
    external open fun isReachableViaWWAN(): Boolean
    
    @ObjCMethod("isReachableViaWiFi", "objcKniBridge531")
    external open fun isReachableViaWiFi(): Boolean
    
    @ObjCMethod("init", "objcKniBridge533")
    external override fun init(): AFNetworkReachabilityManager?
    
    @ObjCConstructor("init", false)
    constructor() {}
}

@ExternalObjCClass open class AFURLSessionManagerMeta : NSObjectMeta, NSURLSessionDelegateProtocolMeta, NSURLSessionTaskDelegateProtocolMeta, NSURLSessionDataDelegateProtocolMeta, NSURLSessionDownloadDelegateProtocolMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("new", "objcKniBridge535")
    external override fun new(): AFURLSessionManager?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge537")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFURLSessionManager?
    
    @ObjCMethod("alloc", "objcKniBridge539")
    external override fun alloc(): AFURLSessionManager?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge541")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFURLSessionManager : NSObject, NSURLSessionDelegateProtocol, NSURLSessionTaskDelegateProtocol, NSURLSessionDataDelegateProtocol, NSURLSessionDownloadDelegateProtocol, NSSecureCodingProtocol, NSCopyingProtocol {
    companion object : AFURLSessionManagerMeta(), ObjCClassOf<AFURLSessionManager> {}
    
    val session: NSURLSession
        get() = objcKniBridge595(nativeNullPtr, this.objcPtr())
    
    val operationQueue: NSOperationQueue
        get() = objcKniBridge597(nativeNullPtr, this.objcPtr())
    
    var responseSerializer: AFURLResponseSerializationProtocol
        get() = objcKniBridge599(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge601(nativeNullPtr, this.objcPtr(), value)
    
    var securityPolicy: AFSecurityPolicy
        get() = objcKniBridge603(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge605(nativeNullPtr, this.objcPtr(), value)
    
    var reachabilityManager: AFNetworkReachabilityManager
        get() = objcKniBridge607(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge609(nativeNullPtr, this.objcPtr(), value)
    
    val tasks: List<*>
        get() = objcKniBridge611(nativeNullPtr, this.objcPtr())
    
    val dataTasks: List<*>
        get() = objcKniBridge613(nativeNullPtr, this.objcPtr())
    
    val uploadTasks: List<*>
        get() = objcKniBridge615(nativeNullPtr, this.objcPtr())
    
    val downloadTasks: List<*>
        get() = objcKniBridge617(nativeNullPtr, this.objcPtr())
    
    var completionQueue: dispatch_queue_t?
        get() = objcKniBridge619(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge621(nativeNullPtr, this.objcPtr(), value)
    
    var completionGroup: dispatch_group_t?
        get() = objcKniBridge623(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge625(nativeNullPtr, this.objcPtr(), value)
    
    var attemptsToRecreateUploadTasksForBackgroundSessions: Boolean
        get() = objcKniBridge627(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge629(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("initWithSessionConfiguration:", "objcKniBridge543")
    external open fun initWithSessionConfiguration(configuration: NSURLSessionConfiguration?): AFURLSessionManager
    
    @ObjCConstructor("initWithSessionConfiguration:", true)
    constructor(sessionConfiguration: NSURLSessionConfiguration?) {}
    
    @ObjCMethod("invalidateSessionCancelingTasks:", "objcKniBridge545")
    external open fun invalidateSessionCancelingTasks(cancelPendingTasks: Boolean): Unit
    
    @ObjCMethod("dataTaskWithRequest:completionHandler:", "objcKniBridge547")
    external open fun dataTaskWithRequest(request: NSURLRequest, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionDataTask
    
    @ObjCMethod("dataTaskWithRequest:uploadProgress:downloadProgress:completionHandler:", "objcKniBridge549")
    external open fun dataTaskWithRequest(request: NSURLRequest, uploadProgress: ((NSProgress?) -> Unit)?, downloadProgress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionDataTask
    
    @ObjCMethod("uploadTaskWithRequest:fromFile:progress:completionHandler:", "objcKniBridge551")
    external open fun uploadTaskWithRequest(request: NSURLRequest, fromFile: NSURL, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask
    
    @ObjCMethod("uploadTaskWithRequest:fromData:progress:completionHandler:", "objcKniBridge553")
    external open fun uploadTaskWithRequest(request: NSURLRequest, fromData: NSData?, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask
    
    @ObjCMethod("uploadTaskWithStreamedRequest:progress:completionHandler:", "objcKniBridge555")
    external open fun uploadTaskWithStreamedRequest(request: NSURLRequest, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask
    
    @ObjCMethod("downloadTaskWithRequest:progress:destination:completionHandler:", "objcKniBridge557")
    external open fun downloadTaskWithRequest(request: NSURLRequest, progress: ((NSProgress?) -> Unit)?, destination: ((NSURL?, NSURLResponse?) -> NSURL?)?, completionHandler: ((NSURLResponse?, NSURL?, NSError?) -> Unit)?): NSURLSessionDownloadTask
    
    @ObjCMethod("downloadTaskWithResumeData:progress:destination:completionHandler:", "objcKniBridge559")
    external open fun downloadTaskWithResumeData(resumeData: NSData, progress: ((NSProgress?) -> Unit)?, destination: ((NSURL?, NSURLResponse?) -> NSURL?)?, completionHandler: ((NSURLResponse?, NSURL?, NSError?) -> Unit)?): NSURLSessionDownloadTask
    
    @ObjCMethod("uploadProgressForTask:", "objcKniBridge561")
    external open fun uploadProgressForTask(task: NSURLSessionTask): NSProgress?
    
    @ObjCMethod("downloadProgressForTask:", "objcKniBridge563")
    external open fun downloadProgressForTask(task: NSURLSessionTask): NSProgress?
    
    @ObjCMethod("setSessionDidBecomeInvalidBlock:", "objcKniBridge565")
    external open fun setSessionDidBecomeInvalidBlock(block: ((NSURLSession?, NSError?) -> Unit)?): Unit
    
    @ObjCMethod("setSessionDidReceiveAuthenticationChallengeBlock:", "objcKniBridge567")
    external open fun setSessionDidReceiveAuthenticationChallengeBlock(block: ((NSURLSession?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition)?): Unit
    
    @ObjCMethod("setTaskNeedNewBodyStreamBlock:", "objcKniBridge569")
    external open fun setTaskNeedNewBodyStreamBlock(block: ((NSURLSession?, NSURLSessionTask?) -> NSInputStream?)?): Unit
    
    @ObjCMethod("setTaskWillPerformHTTPRedirectionBlock:", "objcKniBridge571")
    external open fun setTaskWillPerformHTTPRedirectionBlock(block: ((NSURLSession?, NSURLSessionTask?, NSURLResponse?, NSURLRequest?) -> NSURLRequest?)?): Unit
    
    @ObjCMethod("setTaskDidReceiveAuthenticationChallengeBlock:", "objcKniBridge573")
    external open fun setTaskDidReceiveAuthenticationChallengeBlock(block: ((NSURLSession?, NSURLSessionTask?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition)?): Unit
    
    @ObjCMethod("setTaskDidSendBodyDataBlock:", "objcKniBridge575")
    external open fun setTaskDidSendBodyDataBlock(block: ((NSURLSession?, NSURLSessionTask?, int64_t, int64_t, int64_t) -> Unit)?): Unit
    
    @ObjCMethod("setTaskDidCompleteBlock:", "objcKniBridge577")
    external open fun setTaskDidCompleteBlock(block: ((NSURLSession?, NSURLSessionTask?, NSError?) -> Unit)?): Unit
    
    @ObjCMethod("setDataTaskDidReceiveResponseBlock:", "objcKniBridge579")
    external open fun setDataTaskDidReceiveResponseBlock(block: ((NSURLSession?, NSURLSessionDataTask?, NSURLResponse?) -> NSURLSessionResponseDisposition)?): Unit
    
    @ObjCMethod("setDataTaskDidBecomeDownloadTaskBlock:", "objcKniBridge581")
    external open fun setDataTaskDidBecomeDownloadTaskBlock(block: ((NSURLSession?, NSURLSessionDataTask?, NSURLSessionDownloadTask?) -> Unit)?): Unit
    
    @ObjCMethod("setDataTaskDidReceiveDataBlock:", "objcKniBridge583")
    external open fun setDataTaskDidReceiveDataBlock(block: ((NSURLSession?, NSURLSessionDataTask?, NSData?) -> Unit)?): Unit
    
    @ObjCMethod("setDataTaskWillCacheResponseBlock:", "objcKniBridge585")
    external open fun setDataTaskWillCacheResponseBlock(block: ((NSURLSession?, NSURLSessionDataTask?, NSCachedURLResponse?) -> NSCachedURLResponse?)?): Unit
    
    @ObjCMethod("setDidFinishEventsForBackgroundURLSessionBlock:", "objcKniBridge587")
    external open fun setDidFinishEventsForBackgroundURLSessionBlock(block: ((NSURLSession?) -> Unit)?): Unit
    
    @ObjCMethod("setDownloadTaskDidFinishDownloadingBlock:", "objcKniBridge589")
    external open fun setDownloadTaskDidFinishDownloadingBlock(block: ((NSURLSession?, NSURLSessionDownloadTask?, NSURL?) -> NSURL?)?): Unit
    
    @ObjCMethod("setDownloadTaskDidWriteDataBlock:", "objcKniBridge591")
    external open fun setDownloadTaskDidWriteDataBlock(block: ((NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t, int64_t) -> Unit)?): Unit
    
    @ObjCMethod("setDownloadTaskDidResumeBlock:", "objcKniBridge593")
    external open fun setDownloadTaskDidResumeBlock(block: ((NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t) -> Unit)?): Unit
    
    @ObjCMethod("session", "objcKniBridge595")
    external open fun session(): NSURLSession
    
    @ObjCMethod("operationQueue", "objcKniBridge597")
    external open fun operationQueue(): NSOperationQueue
    
    @ObjCMethod("responseSerializer", "objcKniBridge599")
    external open fun responseSerializer(): AFURLResponseSerializationProtocol
    
    @ObjCMethod("setResponseSerializer:", "objcKniBridge601")
    external open fun setResponseSerializer(responseSerializer: AFURLResponseSerializationProtocol): Unit
    
    @ObjCMethod("securityPolicy", "objcKniBridge603")
    external open fun securityPolicy(): AFSecurityPolicy
    
    @ObjCMethod("setSecurityPolicy:", "objcKniBridge605")
    external open fun setSecurityPolicy(securityPolicy: AFSecurityPolicy): Unit
    
    @ObjCMethod("reachabilityManager", "objcKniBridge607")
    external open fun reachabilityManager(): AFNetworkReachabilityManager
    
    @ObjCMethod("setReachabilityManager:", "objcKniBridge609")
    external open fun setReachabilityManager(reachabilityManager: AFNetworkReachabilityManager): Unit
    
    @ObjCMethod("tasks", "objcKniBridge611")
    external open fun tasks(): List<*>
    
    @ObjCMethod("dataTasks", "objcKniBridge613")
    external open fun dataTasks(): List<*>
    
    @ObjCMethod("uploadTasks", "objcKniBridge615")
    external open fun uploadTasks(): List<*>
    
    @ObjCMethod("downloadTasks", "objcKniBridge617")
    external open fun downloadTasks(): List<*>
    
    @ObjCMethod("completionQueue", "objcKniBridge619")
    external open fun completionQueue(): dispatch_queue_t?
    
    @ObjCMethod("setCompletionQueue:", "objcKniBridge621")
    external open fun setCompletionQueue(completionQueue: dispatch_queue_t?): Unit
    
    @ObjCMethod("completionGroup", "objcKniBridge623")
    external open fun completionGroup(): dispatch_group_t?
    
    @ObjCMethod("setCompletionGroup:", "objcKniBridge625")
    external open fun setCompletionGroup(completionGroup: dispatch_group_t?): Unit
    
    @ObjCMethod("attemptsToRecreateUploadTasksForBackgroundSessions", "objcKniBridge627")
    external open fun attemptsToRecreateUploadTasksForBackgroundSessions(): Boolean
    
    @ObjCMethod("setAttemptsToRecreateUploadTasksForBackgroundSessions:", "objcKniBridge629")
    external open fun setAttemptsToRecreateUploadTasksForBackgroundSessions(attemptsToRecreateUploadTasksForBackgroundSessions: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge631")
    external override fun init(): AFURLSessionManager?
    
    @ObjCConstructor("init", false)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge633")
    external override fun initWithCoder(aDecoder: NSCoder): AFURLSessionManager?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("isEqual:", "objcKniBridge635")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge637")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge639")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge641")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge643")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge645")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge647")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge649")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge651")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge653")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge655")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge657")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge659")
    external override fun description(): String?
    
    @ObjCMethod("URLSession:downloadTask:didFinishDownloadingToURL:", "objcKniBridge661")
    external override fun URLSession(session: NSURLSession, downloadTask: NSURLSessionDownloadTask, didFinishDownloadingToURL: NSURL): Unit
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge663")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge665")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
    
    @ObjCMethod("debugDescription", "objcKniBridge667")
    external override fun debugDescription(): String?
    
    @ObjCMethod("URLSession:didBecomeInvalidWithError:", "objcKniBridge669")
    external override fun URLSession(session: NSURLSession, didBecomeInvalidWithError: NSError?): Unit
    
    @ObjCMethod("URLSession:didReceiveChallenge:completionHandler:", "objcKniBridge671")
    external override fun URLSession(session: NSURLSession, didReceiveChallenge: NSURLAuthenticationChallenge, completionHandler: (NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit): Unit
    
    @ObjCMethod("URLSessionDidFinishEventsForBackgroundURLSession:", "objcKniBridge673")
    external override fun URLSessionDidFinishEventsForBackgroundURLSession(session: NSURLSession): Unit
    
    @ObjCMethod("URLSession:task:willBeginDelayedRequest:completionHandler:", "objcKniBridge675")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, willBeginDelayedRequest: NSURLRequest, completionHandler: (NSURLSessionDelayedRequestDisposition, NSURLRequest?) -> Unit): Unit
    
    @ObjCMethod("URLSession:taskIsWaitingForConnectivity:", "objcKniBridge677")
    external override fun URLSession(session: NSURLSession, taskIsWaitingForConnectivity: NSURLSessionTask): Unit
    
    @ObjCMethod("URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:", "objcKniBridge679")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, willPerformHTTPRedirection: NSHTTPURLResponse, newRequest: NSURLRequest, completionHandler: (NSURLRequest?) -> Unit): Unit
    
    @ObjCMethod("URLSession:task:didReceiveChallenge:completionHandler:", "objcKniBridge681")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, didReceiveChallenge: NSURLAuthenticationChallenge, completionHandler: (NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit): Unit
    
    @ObjCMethod("URLSession:task:needNewBodyStream:", "objcKniBridge683")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, needNewBodyStream: (NSInputStream?) -> Unit): Unit
    
    @ObjCMethod("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:", "objcKniBridge685")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, didSendBodyData: int64_t, totalBytesSent: int64_t, totalBytesExpectedToSend: int64_t): Unit
    
    @ObjCMethod("URLSession:task:didFinishCollectingMetrics:", "objcKniBridge687")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, didFinishCollectingMetrics: NSURLSessionTaskMetrics): Unit
    
    @ObjCMethod("URLSession:task:didCompleteWithError:", "objcKniBridge689")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, didCompleteWithError: NSError?): Unit
}

@ExternalObjCClass open class AFHTTPSessionManagerMeta : AFURLSessionManagerMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("manager", "objcKniBridge691")
    external open fun manager(): AFHTTPSessionManager
    
    @ObjCMethod("new", "objcKniBridge693")
    external override fun new(): AFHTTPSessionManager?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge695")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFHTTPSessionManager?
    
    @ObjCMethod("alloc", "objcKniBridge697")
    external override fun alloc(): AFHTTPSessionManager?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge699")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFHTTPSessionManager : AFURLSessionManager, NSSecureCodingProtocol, NSCopyingProtocol {
    companion object : AFHTTPSessionManagerMeta(), ObjCClassOf<AFHTTPSessionManager> {}
    
    val baseURL: NSURL?
        get() = objcKniBridge725(nativeNullPtr, this.objcPtr())
    
    var requestSerializer: AFHTTPRequestSerializer
        get() = objcKniBridge727(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge729(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("initWithBaseURL:", "objcKniBridge701")
    external open fun initWithBaseURL(url: NSURL?): AFHTTPSessionManager
    
    @ObjCConstructor("initWithBaseURL:", false)
    constructor(baseURL: NSURL?) {}
    
    @ObjCMethod("initWithBaseURL:sessionConfiguration:", "objcKniBridge703")
    external open fun initWithBaseURL(url: NSURL?, sessionConfiguration: NSURLSessionConfiguration?): AFHTTPSessionManager
    
    @ObjCConstructor("initWithBaseURL:sessionConfiguration:", true)
    constructor(baseURL: NSURL?, sessionConfiguration: NSURLSessionConfiguration?) {}
    
    @ObjCMethod("GET:parameters:success:failure:", "objcKniBridge705")
    external open fun GET(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("GET:parameters:progress:success:failure:", "objcKniBridge707")
    external open fun GET(URLString: String, parameters: Any?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("HEAD:parameters:success:failure:", "objcKniBridge709")
    external open fun HEAD(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("POST:parameters:success:failure:", "objcKniBridge711")
    external open fun POST(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("POST:parameters:progress:success:failure:", "objcKniBridge713")
    external open fun POST(URLString: String, parameters: Any?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("POST:parameters:constructingBodyWithBlock:success:failure:", "objcKniBridge715")
    external open fun POST(URLString: String, parameters: Any?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("POST:parameters:constructingBodyWithBlock:progress:success:failure:", "objcKniBridge717")
    external open fun POST(URLString: String, parameters: Any?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("PUT:parameters:success:failure:", "objcKniBridge719")
    external open fun PUT(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("PATCH:parameters:success:failure:", "objcKniBridge721")
    external open fun PATCH(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("DELETE:parameters:success:failure:", "objcKniBridge723")
    external open fun DELETE(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("baseURL", "objcKniBridge725")
    external open fun baseURL(): NSURL?
    
    @ObjCMethod("requestSerializer", "objcKniBridge727")
    external open fun requestSerializer(): AFHTTPRequestSerializer
    
    @ObjCMethod("setRequestSerializer:", "objcKniBridge729")
    external open fun setRequestSerializer(requestSerializer: AFHTTPRequestSerializer): Unit
    
    @ObjCMethod("responseSerializer", "objcKniBridge731")
    external override fun responseSerializer(): AFHTTPResponseSerializer
    
    @ObjCMethod("setResponseSerializer:", "objcKniBridge733")
    external override fun setResponseSerializer(responseSerializer: AFHTTPResponseSerializer): Unit
    
    @ObjCMethod("initWithSessionConfiguration:", "objcKniBridge735")
    external override fun initWithSessionConfiguration(configuration: NSURLSessionConfiguration?): AFHTTPSessionManager
    
    @ObjCConstructor("initWithSessionConfiguration:", false)
    constructor(sessionConfiguration: NSURLSessionConfiguration?) {}
    
    @ObjCMethod("init", "objcKniBridge737")
    external override fun init(): AFHTTPSessionManager?
    
    @ObjCConstructor("init", false)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge739")
    external override fun initWithCoder(aDecoder: NSCoder): AFHTTPSessionManager?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge741")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge743")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
}

const val AF_CAN_USE_AT_AVAILABLE: Int = 1

val AFURLResponseSerializationErrorDomain: String
    get() = interpretObjCPointerOrNull<String>(kniBridge892())!!

val AFNetworkingOperationFailingURLResponseErrorKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge893())!!

val AFNetworkingOperationFailingURLResponseDataErrorKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge894())!!

val UIDocumentBrowserErrorDomain: String
    get() = interpretObjCPointerOrNull<String>(kniBridge895())!!

val AFURLRequestSerializationErrorDomain: String
    get() = interpretObjCPointerOrNull<String>(kniBridge896())!!

val AFNetworkingOperationFailingURLRequestErrorKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge897())!!

val kAFUploadStream3GSuggestedPacketSize: NSUInteger
    get() = kniBridge898()

val kAFUploadStream3GSuggestedDelay: NSTimeInterval
    get() = kniBridge899()

val AFNetworkingReachabilityDidChangeNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge900())!!

val AFNetworkingReachabilityNotificationStatusItem: String
    get() = interpretObjCPointerOrNull<String>(kniBridge901())!!

val AFNetworkingTaskDidResumeNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge902())!!

val AFNetworkingTaskDidCompleteNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge903())!!

val AFNetworkingTaskDidSuspendNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge904())!!

val AFURLSessionDidInvalidateNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge905())!!

val AFURLSessionDownloadTaskDidFailToMoveFileNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge906())!!

val AFNetworkingTaskDidCompleteResponseDataKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge907())!!

val AFNetworkingTaskDidCompleteSerializedResponseKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge908())!!

val AFNetworkingTaskDidCompleteResponseSerializerKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge909())!!

val AFNetworkingTaskDidCompleteAssetPathKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge910())!!

val AFNetworkingTaskDidCompleteErrorKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge911())!!

val kUTTypeItem: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge912())

val kUTTypeContent: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge913())

val kUTTypeCompositeContent: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge914())

val kUTTypeMessage: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge915())

val kUTTypeContact: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge916())

val kUTTypeArchive: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge917())

val kUTTypeDiskImage: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge918())

val kUTTypeData: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge919())

val kUTTypeDirectory: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge920())

val kUTTypeResolvable: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge921())

val kUTTypeSymLink: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge922())

val kUTTypeExecutable: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge923())

val kUTTypeMountPoint: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge924())

val kUTTypeAliasFile: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge925())

val kUTTypeAliasRecord: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge926())

val kUTTypeURLBookmarkData: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge927())

val kUTTypeURL: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge928())

val kUTTypeFileURL: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge929())

val kUTTypeText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge930())

val kUTTypePlainText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge931())

val kUTTypeUTF8PlainText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge932())

val kUTTypeUTF16ExternalPlainText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge933())

val kUTTypeUTF16PlainText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge934())

val kUTTypeDelimitedText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge935())

val kUTTypeCommaSeparatedText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge936())

val kUTTypeTabSeparatedText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge937())

val kUTTypeUTF8TabSeparatedText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge938())

val kUTTypeRTF: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge939())

val kUTTypeHTML: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge940())

val kUTTypeXML: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge941())

val kUTTypeSourceCode: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge942())

val kUTTypeAssemblyLanguageSource: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge943())

val kUTTypeCSource: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge944())

val kUTTypeObjectiveCSource: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge945())

val kUTTypeSwiftSource: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge946())

val kUTTypeCPlusPlusSource: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge947())

val kUTTypeObjectiveCPlusPlusSource: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge948())

val kUTTypeCHeader: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge949())

val kUTTypeCPlusPlusHeader: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge950())

val kUTTypeJavaSource: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge951())

val kUTTypeScript: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge952())

val kUTTypeAppleScript: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge953())

val kUTTypeOSAScript: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge954())

val kUTTypeOSAScriptBundle: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge955())

val kUTTypeJavaScript: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge956())

val kUTTypeShellScript: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge957())

val kUTTypePerlScript: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge958())

val kUTTypePythonScript: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge959())

val kUTTypeRubyScript: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge960())

val kUTTypePHPScript: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge961())

val kUTTypeJSON: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge962())

val kUTTypePropertyList: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge963())

val kUTTypeXMLPropertyList: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge964())

val kUTTypeBinaryPropertyList: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge965())

val kUTTypePDF: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge966())

val kUTTypeRTFD: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge967())

val kUTTypeFlatRTFD: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge968())

val kUTTypeTXNTextAndMultimediaData: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge969())

val kUTTypeWebArchive: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge970())

val kUTTypeImage: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge971())

val kUTTypeJPEG: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge972())

val kUTTypeJPEG2000: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge973())

val kUTTypeTIFF: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge974())

val kUTTypePICT: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge975())

val kUTTypeGIF: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge976())

val kUTTypePNG: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge977())

val kUTTypeQuickTimeImage: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge978())

val kUTTypeAppleICNS: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge979())

val kUTTypeBMP: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge980())

val kUTTypeICO: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge981())

val kUTTypeRawImage: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge982())

val kUTTypeScalableVectorGraphics: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge983())

val kUTTypeLivePhoto: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge984())

val kUTTypeAudiovisualContent: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge985())

val kUTTypeMovie: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge986())

val kUTTypeVideo: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge987())

val kUTTypeAudio: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge988())

val kUTTypeQuickTimeMovie: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge989())

val kUTTypeMPEG: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge990())

val kUTTypeMPEG2Video: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge991())

val kUTTypeMPEG2TransportStream: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge992())

val kUTTypeMP3: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge993())

val kUTTypeMPEG4: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge994())

val kUTTypeMPEG4Audio: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge995())

val kUTTypeAppleProtectedMPEG4Audio: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge996())

val kUTTypeAppleProtectedMPEG4Video: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge997())

val kUTTypeAVIMovie: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge998())

val kUTTypeAudioInterchangeFileFormat: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge999())

val kUTTypeWaveformAudio: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1000())

val kUTTypeMIDIAudio: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1001())

val kUTTypePlaylist: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1002())

val kUTTypeM3UPlaylist: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1003())

val kUTTypeFolder: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1004())

val kUTTypeVolume: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1005())

val kUTTypePackage: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1006())

val kUTTypeBundle: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1007())

val kUTTypePluginBundle: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1008())

val kUTTypeSpotlightImporter: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1009())

val kUTTypeQuickLookGenerator: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1010())

val kUTTypeXPCService: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1011())

val kUTTypeFramework: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1012())

val kUTTypeApplication: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1013())

val kUTTypeApplicationBundle: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1014())

val kUTTypeApplicationFile: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1015())

val kUTTypeUnixExecutable: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1016())

val kUTTypeWindowsExecutable: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1017())

val kUTTypeJavaClass: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1018())

val kUTTypeJavaArchive: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1019())

val kUTTypeSystemPreferencesPane: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1020())

val kUTTypeGNUZipArchive: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1021())

val kUTTypeBzip2Archive: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1022())

val kUTTypeZipArchive: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1023())

val kUTTypeSpreadsheet: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1024())

val kUTTypePresentation: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1025())

val kUTTypeDatabase: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1026())

val kUTTypeVCard: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1027())

val kUTTypeToDoItem: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1028())

val kUTTypeCalendarEvent: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1029())

val kUTTypeEmailMessage: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1030())

val kUTTypeInternetLocation: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1031())

val kUTTypeInkText: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1032())

val kUTTypeFont: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1033())

val kUTTypeBookmark: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1034())

val kUTType3DContent: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1035())

val kUTTypePKCS12: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1036())

val kUTTypeX509Certificate: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1037())

val kUTTypeElectronicPublication: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1038())

val kUTTypeLog: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1039())

val kUTExportedTypeDeclarationsKey: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1040())

val kUTImportedTypeDeclarationsKey: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1041())

val kUTTypeIdentifierKey: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1042())

val kUTTypeTagSpecificationKey: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1043())

val kUTTypeConformsToKey: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1044())

val kUTTypeDescriptionKey: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1045())

val kUTTypeIconFileKey: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1046())

val kUTTypeReferenceURLKey: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1047())

val kUTTypeVersionKey: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1048())

val kUTTagClassFilenameExtension: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1049())

val kUTTagClassMIMEType: CFStringRef?
    get() = interpretCPointer<__CFString>(kniBridge1050())

@Deprecated("Unable to import this declaration", level = DeprecationLevel.ERROR)
val kUTTagClassNSPboardType: CFStringRef?
    get() = TODO()

@Deprecated("Unable to import this declaration", level = DeprecationLevel.ERROR)
val kUTTagClassOSType: CFStringRef?
    get() = TODO()

enum class UITextItemInteraction(override val value: NSInteger) : CEnum {
    UITextItemInteractionInvokeDefaultAction(0),
    UITextItemInteractionPresentActions(1),
    UITextItemInteractionPreview(2),
    ;
    
    companion object {
        fun byValue(value: NSInteger) = UITextItemInteraction.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSIntegerVar.size.toInt())
        var value: UITextItemInteraction
            get() = byValue(this.reinterpret<NSIntegerVar>().value)
            set(value) { this.reinterpret<NSIntegerVar>().value = value.value }
    }
}

typealias UIDocumentBrowserErrorCodeVar = LongVarOf<UIDocumentBrowserErrorCode>
typealias UIDocumentBrowserErrorCode = NSInteger

val UIDocumentBrowserErrorGeneric: UIDocumentBrowserErrorCode get() = 1

enum class UIDocumentBrowserImportMode(override val value: NSUInteger) : CEnum {
    UIDocumentBrowserImportModeNone(0u),
    UIDocumentBrowserImportModeCopy(1u),
    UIDocumentBrowserImportModeMove(2u),
    ;
    
    companion object {
        fun byValue(value: NSUInteger) = UIDocumentBrowserImportMode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSUIntegerVar.size.toInt())
        var value: UIDocumentBrowserImportMode
            get() = byValue(this.reinterpret<NSUIntegerVar>().value)
            set(value) { this.reinterpret<NSUIntegerVar>().value = value.value }
    }
}

typealias UIDocumentBrowserUserInterfaceStyleVar = ULongVarOf<UIDocumentBrowserUserInterfaceStyle>
typealias UIDocumentBrowserUserInterfaceStyle = NSUInteger

val UIDocumentBrowserUserInterfaceStyleWhite: UIDocumentBrowserUserInterfaceStyle get() = 0u
val UIDocumentBrowserUserInterfaceStyleLight: UIDocumentBrowserUserInterfaceStyle get() = 1u
val UIDocumentBrowserUserInterfaceStyleDark: UIDocumentBrowserUserInterfaceStyle get() = 2u

typealias UIDocumentBrowserActionAvailabilityVar = LongVarOf<UIDocumentBrowserActionAvailability>
typealias UIDocumentBrowserActionAvailability = NSInteger

val UIDocumentBrowserActionAvailabilityMenu: UIDocumentBrowserActionAvailability get() = 1
val UIDocumentBrowserActionAvailabilityNavigationBar: UIDocumentBrowserActionAvailability get() = 2

typealias AFHTTPRequestQueryStringSerializationStyleVar = ULongVarOf<AFHTTPRequestQueryStringSerializationStyle>
typealias AFHTTPRequestQueryStringSerializationStyle = NSUInteger

val AFHTTPRequestQueryStringDefaultStyle: AFHTTPRequestQueryStringSerializationStyle get() = 0u

enum class AFSSLPinningMode(override val value: NSUInteger) : CEnum {
    AFSSLPinningModeNone(0u),
    AFSSLPinningModePublicKey(1u),
    AFSSLPinningModeCertificate(2u),
    ;
    
    companion object {
        fun byValue(value: NSUInteger) = AFSSLPinningMode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSUIntegerVar.size.toInt())
        var value: AFSSLPinningMode
            get() = byValue(this.reinterpret<NSUIntegerVar>().value)
            set(value) { this.reinterpret<NSUIntegerVar>().value = value.value }
    }
}

typealias AFNetworkReachabilityStatusVar = LongVarOf<AFNetworkReachabilityStatus>
typealias AFNetworkReachabilityStatus = NSInteger

val AFNetworkReachabilityStatusUnknown: AFNetworkReachabilityStatus get() = -1
val AFNetworkReachabilityStatusNotReachable: AFNetworkReachabilityStatus get() = 0
val AFNetworkReachabilityStatusReachableViaWWAN: AFNetworkReachabilityStatus get() = 1
val AFNetworkReachabilityStatusReachableViaWiFi: AFNetworkReachabilityStatus get() = 2

@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseObjectForResponse:data:error:", "@40@0:8@16@24^@32", "knimi_com_afnetworking1")
internal fun objcKniBridge2(kniSC: NativePtr, kniR: NativePtr, response: NSURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge14(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, response.objcPtr(), data.objcPtr(), error.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking3")
internal fun objcKniBridge4(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFURLResponseSerializationProtocol? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLResponseSerializationProtocol>(kniBridge16(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentBrowser:didPickDocumentURLs:", "v32@0:8@16@24", "knimi_com_afnetworking6")
internal fun objcKniBridge7(kniSC: NativePtr, kniR: NativePtr, controller: UIDocumentBrowserViewController, didPickDocumentURLs: List<*>): Unit {
    return kniBridge18(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, controller.objcPtr(), didPickDocumentURLs.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentBrowser:didRequestDocumentCreationWithHandler:", "v32@0:8@16@\u003F24", "knimi_com_afnetworking8")
internal fun objcKniBridge9(kniSC: NativePtr, kniR: NativePtr, controller: UIDocumentBrowserViewController, didRequestDocumentCreationWithHandler: (NSURL?, UIDocumentBrowserImportMode) -> Unit): Unit {
    return kniBridge20(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, controller.objcPtr(), createKotlinObjectHolder(didRequestDocumentCreationWithHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentBrowser:didImportDocumentAtURL:toDestinationURL:", "v40@0:8@16@24@32", "knimi_com_afnetworking10")
internal fun objcKniBridge11(kniSC: NativePtr, kniR: NativePtr, controller: UIDocumentBrowserViewController, didImportDocumentAtURL: NSURL, toDestinationURL: NSURL): Unit {
    return kniBridge24(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, controller.objcPtr(), didImportDocumentAtURL.objcPtr(), toDestinationURL.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentBrowser:failedToImportDocumentAtURL:error:", "v40@0:8@16@24@32", "knimi_com_afnetworking12")
internal fun objcKniBridge13(kniSC: NativePtr, kniR: NativePtr, controller: UIDocumentBrowserViewController, failedToImportDocumentAtURL: NSURL, error: NSError?): Unit {
    return kniBridge26(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, controller.objcPtr(), failedToImportDocumentAtURL.objcPtr(), error.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentBrowser:applicationActivitiesForDocumentURLs:", "@32@0:8@16@24", "knimi_com_afnetworking14")
internal fun objcKniBridge15(kniSC: NativePtr, kniR: NativePtr, controller: UIDocumentBrowserViewController, applicationActivitiesForDocumentURLs: List<*>): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge28(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, controller.objcPtr(), applicationActivitiesForDocumentURLs.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("documentBrowser:willPresentActivityViewController:", "v32@0:8@16@24", "knimi_com_afnetworking16")
internal fun objcKniBridge17(kniSC: NativePtr, kniR: NativePtr, controller: UIDocumentBrowserViewController, willPresentActivityViewController: UIActivityViewController): Unit {
    return kniBridge30(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, controller.objcPtr(), willPresentActivityViewController.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestBySerializingRequest:withParameters:error:", "@40@0:8@16@24^@32", "knimi_com_afnetworking19")
internal fun objcKniBridge20(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, withParameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSURLRequest? {
    return interpretObjCPointerOrNull<NSURLRequest>(kniBridge32(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), withParameters.objcPtr(), error.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking21")
internal fun objcKniBridge22(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFURLRequestSerializationProtocol? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLRequestSerializationProtocol>(kniBridge34(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithFileURL:name:error:", "B40@0:8@16@24^@32", "knimi_com_afnetworking24")
internal fun objcKniBridge25(kniSC: NativePtr, kniR: NativePtr, fileURL: NSURL, name: String, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean {
    return kniBridge36(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fileURL.objcPtr(), name.objcPtr(), error.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithFileURL:name:fileName:mimeType:error:", "B56@0:8@16@24@32@40^@48", "knimi_com_afnetworking26")
internal fun objcKniBridge27(kniSC: NativePtr, kniR: NativePtr, fileURL: NSURL, name: String, fileName: String, mimeType: String, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean {
    return kniBridge38(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fileURL.objcPtr(), name.objcPtr(), fileName.objcPtr(), mimeType.objcPtr(), error.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithInputStream:name:fileName:length:mimeType:", "v56@0:8@16@24@32q40@48", "knimi_com_afnetworking28")
internal fun objcKniBridge29(kniSC: NativePtr, kniR: NativePtr, inputStream: NSInputStream?, name: String, fileName: String, length: int64_t, mimeType: String): Unit {
    return kniBridge40(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, inputStream.objcPtr(), name.objcPtr(), fileName.objcPtr(), length, mimeType.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithFileData:name:fileName:mimeType:", "v48@0:8@16@24@32@40", "knimi_com_afnetworking30")
internal fun objcKniBridge31(kniSC: NativePtr, kniR: NativePtr, data: NSData, name: String, fileName: String, mimeType: String): Unit {
    return kniBridge42(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), name.objcPtr(), fileName.objcPtr(), mimeType.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithFormData:name:", "v32@0:8@16@24", "knimi_com_afnetworking32")
internal fun objcKniBridge33(kniSC: NativePtr, kniR: NativePtr, data: NSData, name: String): Unit {
    return kniBridge44(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), name.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithHeaders:body:", "v32@0:8@16@24", "knimi_com_afnetworking34")
internal fun objcKniBridge35(kniSC: NativePtr, kniR: NativePtr, headers: Map<Any?, *>?, body: NSData): Unit {
    return kniBridge46(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, headers.objcPtr(), body.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("throttleBandwidthWithPacketSize:delay:", "v32@0:8Q16d24", "knimi_com_afnetworking36")
internal fun objcKniBridge37(kniSC: NativePtr, kniR: NativePtr, numberOfBytes: NSUInteger, delay: NSTimeInterval): Unit {
    return kniBridge48(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, numberOfBytes, delay)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking38")
internal fun objcKniBridge39(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge50(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking40")
internal fun objcKniBridge41(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer? {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge52(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking42")
internal fun objcKniBridge43(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFHTTPResponseSerializer? {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge54(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking44")
internal fun objcKniBridge45(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer? {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge56(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking46")
internal fun objcKniBridge47(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge58(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking48")
internal fun objcKniBridge49(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge60(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("validateResponse:data:error:", "B40@0:8@16@24^@32", "knimi_com_afnetworking50")
internal fun objcKniBridge51(kniSC: NativePtr, kniR: NativePtr, response: NSHTTPURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean {
    return kniBridge62(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, response.objcPtr(), data.objcPtr(), error.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("stringEncoding", "Q16@0:8", "knimi_com_afnetworking52")
internal fun objcKniBridge53(kniSC: NativePtr, kniR: NativePtr): NSStringEncoding {
    return kniBridge64(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setStringEncoding:", "v24@0:8Q16", "knimi_com_afnetworking54")
internal fun objcKniBridge55(kniSC: NativePtr, kniR: NativePtr, stringEncoding: NSStringEncoding): Unit {
    return kniBridge66(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, stringEncoding)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("acceptableStatusCodes", "@16@0:8", "knimi_com_afnetworking56")
internal fun objcKniBridge57(kniSC: NativePtr, kniR: NativePtr): NSIndexSet? {
    return interpretObjCPointerOrNull<NSIndexSet>(kniBridge68(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAcceptableStatusCodes:", "v24@0:8@16", "knimi_com_afnetworking58")
internal fun objcKniBridge59(kniSC: NativePtr, kniR: NativePtr, acceptableStatusCodes: NSIndexSet?): Unit {
    return kniBridge70(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, acceptableStatusCodes.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("acceptableContentTypes", "@16@0:8", "knimi_com_afnetworking60")
internal fun objcKniBridge61(kniSC: NativePtr, kniR: NativePtr): Set<*>? {
    return interpretObjCPointerOrNull<Set<*>>(kniBridge72(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAcceptableContentTypes:", "v24@0:8@16", "knimi_com_afnetworking62")
internal fun objcKniBridge63(kniSC: NativePtr, kniR: NativePtr, acceptableContentTypes: Set<*>?): Unit {
    return kniBridge74(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, acceptableContentTypes.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking64")
internal fun objcKniBridge65(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFHTTPResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge76(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseObjectForResponse:data:error:", "@40@0:8@16@24^@32", "knimi_com_afnetworking66")
internal fun objcKniBridge67(kniSC: NativePtr, kniR: NativePtr, response: NSURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge78(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, response.objcPtr(), data.objcPtr(), error.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_afnetworking68")
internal fun objcKniBridge69(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge80(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_afnetworking70")
internal fun objcKniBridge71(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge82(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_afnetworking72")
internal fun objcKniBridge73(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge84(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_afnetworking74")
internal fun objcKniBridge75(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge86(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_afnetworking76")
internal fun objcKniBridge77(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge88(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_afnetworking78")
internal fun objcKniBridge79(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge90(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_afnetworking80")
internal fun objcKniBridge81(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge92(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_afnetworking82")
internal fun objcKniBridge83(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge94(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_afnetworking84")
internal fun objcKniBridge85(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge96(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_afnetworking86")
internal fun objcKniBridge87(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge98(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_afnetworking88")
internal fun objcKniBridge89(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge100(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_afnetworking90")
internal fun objcKniBridge91(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge102(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_afnetworking92")
internal fun objcKniBridge93(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge104(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking94")
internal fun objcKniBridge95(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge106(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking96")
internal fun objcKniBridge97(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge108(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_afnetworking98")
internal fun objcKniBridge99(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge110(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializerWithReadingOptions:", "@24@0:8Q16", "knimi_com_afnetworking100")
internal fun objcKniBridge101(kniSC: NativePtr, kniR: NativePtr, readingOptions: NSJSONReadingOptions): AFJSONResponseSerializer {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge112(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, readingOptions))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking102")
internal fun objcKniBridge103(kniSC: NativePtr, kniR: NativePtr): AFJSONResponseSerializer {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge114(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking104")
internal fun objcKniBridge105(kniSC: NativePtr, kniR: NativePtr): AFJSONResponseSerializer? {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge116(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking106")
internal fun objcKniBridge107(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFJSONResponseSerializer? {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge118(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking108")
internal fun objcKniBridge109(kniSC: NativePtr, kniR: NativePtr): AFJSONResponseSerializer? {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge120(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("readingOptions", "Q16@0:8", "knimi_com_afnetworking110")
internal fun objcKniBridge111(kniSC: NativePtr, kniR: NativePtr): NSJSONReadingOptions {
    return kniBridge122(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setReadingOptions:", "v24@0:8Q16", "knimi_com_afnetworking112")
internal fun objcKniBridge113(kniSC: NativePtr, kniR: NativePtr, readingOptions: NSJSONReadingOptions): Unit {
    return kniBridge124(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, readingOptions)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("removesKeysWithNullValues", "B16@0:8", "knimi_com_afnetworking114")
internal fun objcKniBridge115(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge126(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setRemovesKeysWithNullValues:", "v20@0:8B16", "knimi_com_afnetworking116")
internal fun objcKniBridge117(kniSC: NativePtr, kniR: NativePtr, removesKeysWithNullValues: Boolean): Unit {
    return kniBridge128(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, removesKeysWithNullValues.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking118")
internal fun objcKniBridge119(kniSC: NativePtr, kniR: NativePtr): AFJSONResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge130(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking120")
internal fun objcKniBridge121(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFJSONResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge132(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking122")
internal fun objcKniBridge123(kniSC: NativePtr, kniR: NativePtr): AFXMLParserResponseSerializer {
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge134(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking124")
internal fun objcKniBridge125(kniSC: NativePtr, kniR: NativePtr): AFXMLParserResponseSerializer? {
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge136(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking126")
internal fun objcKniBridge127(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFXMLParserResponseSerializer? {
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge138(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking128")
internal fun objcKniBridge129(kniSC: NativePtr, kniR: NativePtr): AFXMLParserResponseSerializer? {
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge140(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking130")
internal fun objcKniBridge131(kniSC: NativePtr, kniR: NativePtr): AFXMLParserResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge142(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking132")
internal fun objcKniBridge133(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFXMLParserResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge144(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializerWithFormat:readOptions:", "@32@0:8Q16Q24", "knimi_com_afnetworking134")
internal fun objcKniBridge135(kniSC: NativePtr, kniR: NativePtr, format: NSPropertyListFormat, readOptions: NSPropertyListReadOptions): AFPropertyListResponseSerializer {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge146(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, format, readOptions))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking136")
internal fun objcKniBridge137(kniSC: NativePtr, kniR: NativePtr): AFPropertyListResponseSerializer {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge148(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking138")
internal fun objcKniBridge139(kniSC: NativePtr, kniR: NativePtr): AFPropertyListResponseSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge150(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking140")
internal fun objcKniBridge141(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFPropertyListResponseSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge152(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking142")
internal fun objcKniBridge143(kniSC: NativePtr, kniR: NativePtr): AFPropertyListResponseSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge154(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("format", "Q16@0:8", "knimi_com_afnetworking144")
internal fun objcKniBridge145(kniSC: NativePtr, kniR: NativePtr): NSPropertyListFormat {
    return kniBridge156(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setFormat:", "v24@0:8Q16", "knimi_com_afnetworking146")
internal fun objcKniBridge147(kniSC: NativePtr, kniR: NativePtr, format: NSPropertyListFormat): Unit {
    return kniBridge158(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, format)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("readOptions", "Q16@0:8", "knimi_com_afnetworking148")
internal fun objcKniBridge149(kniSC: NativePtr, kniR: NativePtr): NSPropertyListReadOptions {
    return kniBridge160(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setReadOptions:", "v24@0:8Q16", "knimi_com_afnetworking150")
internal fun objcKniBridge151(kniSC: NativePtr, kniR: NativePtr, readOptions: NSPropertyListReadOptions): Unit {
    return kniBridge162(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, readOptions)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking152")
internal fun objcKniBridge153(kniSC: NativePtr, kniR: NativePtr): AFPropertyListResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge164(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking154")
internal fun objcKniBridge155(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFPropertyListResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge166(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking156")
internal fun objcKniBridge157(kniSC: NativePtr, kniR: NativePtr): AFImageResponseSerializer {
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge168(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking158")
internal fun objcKniBridge159(kniSC: NativePtr, kniR: NativePtr): AFImageResponseSerializer? {
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge170(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking160")
internal fun objcKniBridge161(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFImageResponseSerializer? {
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge172(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking162")
internal fun objcKniBridge163(kniSC: NativePtr, kniR: NativePtr): AFImageResponseSerializer? {
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge174(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("imageScale", "d16@0:8", "knimi_com_afnetworking164")
internal fun objcKniBridge165(kniSC: NativePtr, kniR: NativePtr): CGFloat {
    return kniBridge176(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setImageScale:", "v24@0:8d16", "knimi_com_afnetworking166")
internal fun objcKniBridge167(kniSC: NativePtr, kniR: NativePtr, imageScale: CGFloat): Unit {
    return kniBridge178(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, imageScale)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("automaticallyInflatesResponseImage", "B16@0:8", "knimi_com_afnetworking168")
internal fun objcKniBridge169(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge180(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAutomaticallyInflatesResponseImage:", "v20@0:8B16", "knimi_com_afnetworking170")
internal fun objcKniBridge171(kniSC: NativePtr, kniR: NativePtr, automaticallyInflatesResponseImage: Boolean): Unit {
    return kniBridge182(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, automaticallyInflatesResponseImage.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking172")
internal fun objcKniBridge173(kniSC: NativePtr, kniR: NativePtr): AFImageResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge184(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking174")
internal fun objcKniBridge175(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFImageResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge186(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("compoundSerializerWithResponseSerializers:", "@24@0:8@16", "knimi_com_afnetworking176")
internal fun objcKniBridge177(kniSC: NativePtr, kniR: NativePtr, responseSerializers: List<*>): AFCompoundResponseSerializer {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge188(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, responseSerializers.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking178")
internal fun objcKniBridge179(kniSC: NativePtr, kniR: NativePtr): AFCompoundResponseSerializer {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge190(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking180")
internal fun objcKniBridge181(kniSC: NativePtr, kniR: NativePtr): AFCompoundResponseSerializer? {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge192(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking182")
internal fun objcKniBridge183(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFCompoundResponseSerializer? {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge194(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking184")
internal fun objcKniBridge185(kniSC: NativePtr, kniR: NativePtr): AFCompoundResponseSerializer? {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge196(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseSerializers", "@16@0:8", "knimi_com_afnetworking186")
internal fun objcKniBridge187(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge198(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking188")
internal fun objcKniBridge189(kniSC: NativePtr, kniR: NativePtr): AFCompoundResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge200(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking190")
internal fun objcKniBridge191(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFCompoundResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge202(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking192")
internal fun objcKniBridge193(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserViewController? {
    return interpretObjCPointerOrNull<UIDocumentBrowserViewController>(kniBridge204(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking194")
internal fun objcKniBridge195(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): UIDocumentBrowserViewController? {
    return interpretObjCPointerOrNull<UIDocumentBrowserViewController>(kniBridge206(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking196")
internal fun objcKniBridge197(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserViewController? {
    return interpretObjCPointerOrNull<UIDocumentBrowserViewController>(kniBridge208(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initForOpeningFilesWithContentTypes:", "@24@0:8@16", "knimi_com_afnetworking198")
internal fun objcKniBridge199(kniSC: NativePtr, kniR: NativePtr, allowedContentTypes: List<*>?): UIDocumentBrowserViewController {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIDocumentBrowserViewController>(kniBridge210(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, allowedContentTypes.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("revealDocumentAtURL:importIfNeeded:completion:", "v36@0:8@16B24@\u003F28", "knimi_com_afnetworking200")
internal fun objcKniBridge201(kniSC: NativePtr, kniR: NativePtr, url: NSURL, importIfNeeded: Boolean, completion: ((NSURL?, NSError?) -> Unit)?): Unit {
    return kniBridge212(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, url.objcPtr(), importIfNeeded.toByte(), createKotlinObjectHolder(completion))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("importDocumentAtURL:nextToDocumentAtURL:mode:completionHandler:", "v48@0:8@16@24Q32@\u003F40", "knimi_com_afnetworking202")
internal fun objcKniBridge203(kniSC: NativePtr, kniR: NativePtr, documentURL: NSURL, nextToDocumentAtURL: NSURL, mode: UIDocumentBrowserImportMode, completionHandler: (NSURL?, NSError?) -> Unit): Unit {
    return kniBridge216(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentURL.objcPtr(), nextToDocumentAtURL.objcPtr(), mode.value, createKotlinObjectHolder(completionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("transitionControllerForDocumentURL:", "@24@0:8@16", "knimi_com_afnetworking204")
internal fun objcKniBridge205(kniSC: NativePtr, kniR: NativePtr, documentURL: NSURL): UIDocumentBrowserTransitionController {
    return interpretObjCPointerOrNull<UIDocumentBrowserTransitionController>(kniBridge220(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, documentURL.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("delegate", "@16@0:8", "knimi_com_afnetworking206")
internal fun objcKniBridge207(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserViewControllerDelegateProtocol? {
    return interpretObjCPointerOrNull<UIDocumentBrowserViewControllerDelegateProtocol>(kniBridge222(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDelegate:", "v24@0:8@16", "knimi_com_afnetworking208")
internal fun objcKniBridge209(kniSC: NativePtr, kniR: NativePtr, delegate: UIDocumentBrowserViewControllerDelegateProtocol?): Unit {
    return kniBridge224(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, delegate.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allowsDocumentCreation", "B16@0:8", "knimi_com_afnetworking210")
internal fun objcKniBridge211(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge226(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAllowsDocumentCreation:", "v20@0:8B16", "knimi_com_afnetworking212")
internal fun objcKniBridge213(kniSC: NativePtr, kniR: NativePtr, allowsDocumentCreation: Boolean): Unit {
    return kniBridge228(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, allowsDocumentCreation.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allowsPickingMultipleItems", "B16@0:8", "knimi_com_afnetworking214")
internal fun objcKniBridge215(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge230(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAllowsPickingMultipleItems:", "v20@0:8B16", "knimi_com_afnetworking216")
internal fun objcKniBridge217(kniSC: NativePtr, kniR: NativePtr, allowsPickingMultipleItems: Boolean): Unit {
    return kniBridge232(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, allowsPickingMultipleItems.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allowedContentTypes", "@16@0:8", "knimi_com_afnetworking218")
internal fun objcKniBridge219(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge234(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("additionalLeadingNavigationBarButtonItems", "@16@0:8", "knimi_com_afnetworking220")
internal fun objcKniBridge221(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge236(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAdditionalLeadingNavigationBarButtonItems:", "v24@0:8@16", "knimi_com_afnetworking222")
internal fun objcKniBridge223(kniSC: NativePtr, kniR: NativePtr, additionalLeadingNavigationBarButtonItems: List<*>): Unit {
    return kniBridge238(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, additionalLeadingNavigationBarButtonItems.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("additionalTrailingNavigationBarButtonItems", "@16@0:8", "knimi_com_afnetworking224")
internal fun objcKniBridge225(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge240(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAdditionalTrailingNavigationBarButtonItems:", "v24@0:8@16", "knimi_com_afnetworking226")
internal fun objcKniBridge227(kniSC: NativePtr, kniR: NativePtr, additionalTrailingNavigationBarButtonItems: List<*>): Unit {
    return kniBridge242(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, additionalTrailingNavigationBarButtonItems.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("customActions", "@16@0:8", "knimi_com_afnetworking228")
internal fun objcKniBridge229(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge244(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setCustomActions:", "v24@0:8@16", "knimi_com_afnetworking230")
internal fun objcKniBridge231(kniSC: NativePtr, kniR: NativePtr, customActions: List<*>): Unit {
    return kniBridge246(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, customActions.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("browserUserInterfaceStyle", "Q16@0:8", "knimi_com_afnetworking232")
internal fun objcKniBridge233(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserUserInterfaceStyle {
    return kniBridge248(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setBrowserUserInterfaceStyle:", "v24@0:8Q16", "knimi_com_afnetworking234")
internal fun objcKniBridge235(kniSC: NativePtr, kniR: NativePtr, browserUserInterfaceStyle: UIDocumentBrowserUserInterfaceStyle): Unit {
    return kniBridge250(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, browserUserInterfaceStyle)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithNibName:bundle:", "@32@0:8@16@24", "knimi_com_afnetworking236")
internal fun objcKniBridge237(kniSC: NativePtr, kniR: NativePtr, nibNameOrNil: String?, bundle: NSBundle?): UIDocumentBrowserViewController {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIDocumentBrowserViewController>(kniBridge252(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, nibNameOrNil.objcPtr(), bundle.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking238")
internal fun objcKniBridge239(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): UIDocumentBrowserViewController? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIDocumentBrowserViewController>(kniBridge254(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking240")
internal fun objcKniBridge241(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserViewController? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIDocumentBrowserViewController>(kniBridge256(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking242")
internal fun objcKniBridge243(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge258(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking244")
internal fun objcKniBridge245(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserTransitionController? {
    return interpretObjCPointerOrNull<UIDocumentBrowserTransitionController>(kniBridge260(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking246")
internal fun objcKniBridge247(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): UIDocumentBrowserTransitionController? {
    return interpretObjCPointerOrNull<UIDocumentBrowserTransitionController>(kniBridge262(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking248")
internal fun objcKniBridge249(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserTransitionController? {
    return interpretObjCPointerOrNull<UIDocumentBrowserTransitionController>(kniBridge264(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("loadingProgress", "@16@0:8", "knimi_com_afnetworking250")
internal fun objcKniBridge251(kniSC: NativePtr, kniR: NativePtr): NSProgress? {
    return interpretObjCPointerOrNull<NSProgress>(kniBridge266(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setLoadingProgress:", "v24@0:8@16", "knimi_com_afnetworking252")
internal fun objcKniBridge253(kniSC: NativePtr, kniR: NativePtr, loadingProgress: NSProgress?): Unit {
    return kniBridge268(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, loadingProgress.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("targetView", "@16@0:8", "knimi_com_afnetworking254")
internal fun objcKniBridge255(kniSC: NativePtr, kniR: NativePtr): UIView? {
    return interpretObjCPointerOrNull<UIView>(kniBridge270(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTargetView:", "v24@0:8@16", "knimi_com_afnetworking256")
internal fun objcKniBridge257(kniSC: NativePtr, kniR: NativePtr, targetView: UIView?): Unit {
    return kniBridge272(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, targetView.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking258")
internal fun objcKniBridge259(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserTransitionController? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIDocumentBrowserTransitionController>(kniBridge274(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("transitionDuration:", "d24@0:8@16", "knimi_com_afnetworking260")
internal fun objcKniBridge261(kniSC: NativePtr, kniR: NativePtr, transitionContext: UIViewControllerContextTransitioningProtocol?): NSTimeInterval {
    return kniBridge276(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, transitionContext.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("animateTransition:", "v24@0:8@16", "knimi_com_afnetworking262")
internal fun objcKniBridge263(kniSC: NativePtr, kniR: NativePtr, transitionContext: UIViewControllerContextTransitioningProtocol): Unit {
    return kniBridge278(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, transitionContext.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_afnetworking264")
internal fun objcKniBridge265(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge280(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_afnetworking266")
internal fun objcKniBridge267(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge282(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_afnetworking268")
internal fun objcKniBridge269(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge284(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_afnetworking270")
internal fun objcKniBridge271(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge286(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_afnetworking272")
internal fun objcKniBridge273(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge288(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_afnetworking274")
internal fun objcKniBridge275(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge290(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_afnetworking276")
internal fun objcKniBridge277(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge292(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_afnetworking278")
internal fun objcKniBridge279(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge294(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_afnetworking280")
internal fun objcKniBridge281(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge296(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_afnetworking282")
internal fun objcKniBridge283(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge298(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_afnetworking284")
internal fun objcKniBridge285(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge300(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_afnetworking286")
internal fun objcKniBridge287(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge302(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_afnetworking288")
internal fun objcKniBridge289(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge304(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_afnetworking290")
internal fun objcKniBridge291(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge306(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking292")
internal fun objcKniBridge293(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserAction? {
    return interpretObjCPointerOrNull<UIDocumentBrowserAction>(kniBridge308(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking294")
internal fun objcKniBridge295(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): UIDocumentBrowserAction? {
    return interpretObjCPointerOrNull<UIDocumentBrowserAction>(kniBridge310(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking296")
internal fun objcKniBridge297(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserAction? {
    return interpretObjCPointerOrNull<UIDocumentBrowserAction>(kniBridge312(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithIdentifier:localizedTitle:availability:handler:", "@48@0:8@16@24q32@\u003F40", "knimi_com_afnetworking298")
internal fun objcKniBridge299(kniSC: NativePtr, kniR: NativePtr, identifier: String, localizedTitle: String, availability: UIDocumentBrowserActionAvailability, handler: (List<*>?) -> Unit): UIDocumentBrowserAction {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIDocumentBrowserAction>(kniBridge314(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, identifier.objcPtr(), localizedTitle.objcPtr(), availability, createKotlinObjectHolder(handler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("identifier", "@16@0:8", "knimi_com_afnetworking300")
internal fun objcKniBridge301(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge318(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("localizedTitle", "@16@0:8", "knimi_com_afnetworking302")
internal fun objcKniBridge303(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge320(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("availability", "q16@0:8", "knimi_com_afnetworking304")
internal fun objcKniBridge305(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserActionAvailability {
    return kniBridge322(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("image", "@16@0:8", "knimi_com_afnetworking306")
internal fun objcKniBridge307(kniSC: NativePtr, kniR: NativePtr): UIImage? {
    return interpretObjCPointerOrNull<UIImage>(kniBridge324(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setImage:", "v24@0:8@16", "knimi_com_afnetworking308")
internal fun objcKniBridge309(kniSC: NativePtr, kniR: NativePtr, image: UIImage?): Unit {
    return kniBridge326(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, image.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportedContentTypes", "@16@0:8", "knimi_com_afnetworking310")
internal fun objcKniBridge311(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge328(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSupportedContentTypes:", "v24@0:8@16", "knimi_com_afnetworking312")
internal fun objcKniBridge313(kniSC: NativePtr, kniR: NativePtr, supportedContentTypes: List<*>): Unit {
    return kniBridge330(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, supportedContentTypes.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsMultipleItems", "B16@0:8", "knimi_com_afnetworking314")
internal fun objcKniBridge315(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge332(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSupportsMultipleItems:", "v20@0:8B16", "knimi_com_afnetworking316")
internal fun objcKniBridge317(kniSC: NativePtr, kniR: NativePtr, supportsMultipleItems: Boolean): Unit {
    return kniBridge334(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, supportsMultipleItems.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking318")
internal fun objcKniBridge319(kniSC: NativePtr, kniR: NativePtr): UIDocumentBrowserAction? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIDocumentBrowserAction>(kniBridge336(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking320")
internal fun objcKniBridge321(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge338(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking322")
internal fun objcKniBridge323(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer? {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge340(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking324")
internal fun objcKniBridge325(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFHTTPRequestSerializer? {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge342(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking326")
internal fun objcKniBridge327(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer? {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge344(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking328")
internal fun objcKniBridge329(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge346(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setValue:forHTTPHeaderField:", "v32@0:8@16@24", "knimi_com_afnetworking330")
internal fun objcKniBridge331(kniSC: NativePtr, kniR: NativePtr, value: String?, forHTTPHeaderField: String): Unit {
    return kniBridge348(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr(), forHTTPHeaderField.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueForHTTPHeaderField:", "@24@0:8@16", "knimi_com_afnetworking332")
internal fun objcKniBridge333(kniSC: NativePtr, kniR: NativePtr, field: String): String? {
    return interpretObjCPointerOrNull<String>(kniBridge350(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAuthorizationHeaderFieldWithUsername:password:", "v32@0:8@16@24", "knimi_com_afnetworking334")
internal fun objcKniBridge335(kniSC: NativePtr, kniR: NativePtr, username: String, password: String): Unit {
    return kniBridge352(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, username.objcPtr(), password.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("clearAuthorizationHeader", "v16@0:8", "knimi_com_afnetworking336")
internal fun objcKniBridge337(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge354(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setQueryStringSerializationWithStyle:", "v24@0:8Q16", "knimi_com_afnetworking338")
internal fun objcKniBridge339(kniSC: NativePtr, kniR: NativePtr, style: AFHTTPRequestQueryStringSerializationStyle): Unit {
    return kniBridge356(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, style)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setQueryStringSerializationWithBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking340")
internal fun objcKniBridge341(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLRequest?, Any?, CPointer<ObjCObjectVar<NSError?>>?) -> String?)?): Unit {
    return kniBridge358(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestWithMethod:URLString:parameters:error:", "@48@0:8@16@24@32^@40", "knimi_com_afnetworking342")
internal fun objcKniBridge343(kniSC: NativePtr, kniR: NativePtr, method: String, URLString: String, parameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSMutableURLRequest {
    return interpretObjCPointerOrNull<NSMutableURLRequest>(kniBridge362(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, method.objcPtr(), URLString.objcPtr(), parameters.objcPtr(), error.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("multipartFormRequestWithMethod:URLString:parameters:constructingBodyWithBlock:error:", "@56@0:8@16@24@32@\u003F40^@48", "knimi_com_afnetworking344")
internal fun objcKniBridge345(kniSC: NativePtr, kniR: NativePtr, method: String, URLString: String, parameters: Map<Any?, *>?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, error: CPointer<ObjCObjectVar<NSError?>>?): NSMutableURLRequest {
    return interpretObjCPointerOrNull<NSMutableURLRequest>(kniBridge364(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, method.objcPtr(), URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(constructingBodyWithBlock), error.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestWithMultipartFormRequest:writingStreamContentsToFile:completionHandler:", "@40@0:8@16@24@\u003F32", "knimi_com_afnetworking346")
internal fun objcKniBridge347(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, writingStreamContentsToFile: NSURL, completionHandler: ((NSError?) -> Unit)?): NSMutableURLRequest {
    return interpretObjCPointerOrNull<NSMutableURLRequest>(kniBridge368(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), writingStreamContentsToFile.objcPtr(), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("stringEncoding", "Q16@0:8", "knimi_com_afnetworking348")
internal fun objcKniBridge349(kniSC: NativePtr, kniR: NativePtr): NSStringEncoding {
    return kniBridge372(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setStringEncoding:", "v24@0:8Q16", "knimi_com_afnetworking350")
internal fun objcKniBridge351(kniSC: NativePtr, kniR: NativePtr, stringEncoding: NSStringEncoding): Unit {
    return kniBridge374(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, stringEncoding)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allowsCellularAccess", "B16@0:8", "knimi_com_afnetworking352")
internal fun objcKniBridge353(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge376(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAllowsCellularAccess:", "v20@0:8B16", "knimi_com_afnetworking354")
internal fun objcKniBridge355(kniSC: NativePtr, kniR: NativePtr, allowsCellularAccess: Boolean): Unit {
    return kniBridge378(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, allowsCellularAccess.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("cachePolicy", "Q16@0:8", "knimi_com_afnetworking356")
internal fun objcKniBridge357(kniSC: NativePtr, kniR: NativePtr): NSURLRequestCachePolicy {
    return kniBridge380(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setCachePolicy:", "v24@0:8Q16", "knimi_com_afnetworking358")
internal fun objcKniBridge359(kniSC: NativePtr, kniR: NativePtr, cachePolicy: NSURLRequestCachePolicy): Unit {
    return kniBridge382(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, cachePolicy)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HTTPShouldHandleCookies", "B16@0:8", "knimi_com_afnetworking360")
internal fun objcKniBridge361(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge384(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHTTPShouldHandleCookies:", "v20@0:8B16", "knimi_com_afnetworking362")
internal fun objcKniBridge363(kniSC: NativePtr, kniR: NativePtr, HTTPShouldHandleCookies: Boolean): Unit {
    return kniBridge386(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, HTTPShouldHandleCookies.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HTTPShouldUsePipelining", "B16@0:8", "knimi_com_afnetworking364")
internal fun objcKniBridge365(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge388(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHTTPShouldUsePipelining:", "v20@0:8B16", "knimi_com_afnetworking366")
internal fun objcKniBridge367(kniSC: NativePtr, kniR: NativePtr, HTTPShouldUsePipelining: Boolean): Unit {
    return kniBridge390(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, HTTPShouldUsePipelining.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("networkServiceType", "Q16@0:8", "knimi_com_afnetworking368")
internal fun objcKniBridge369(kniSC: NativePtr, kniR: NativePtr): NSURLRequestNetworkServiceType {
    return kniBridge392(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setNetworkServiceType:", "v24@0:8Q16", "knimi_com_afnetworking370")
internal fun objcKniBridge371(kniSC: NativePtr, kniR: NativePtr, networkServiceType: NSURLRequestNetworkServiceType): Unit {
    return kniBridge394(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, networkServiceType)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("timeoutInterval", "d16@0:8", "knimi_com_afnetworking372")
internal fun objcKniBridge373(kniSC: NativePtr, kniR: NativePtr): NSTimeInterval {
    return kniBridge396(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTimeoutInterval:", "v24@0:8d16", "knimi_com_afnetworking374")
internal fun objcKniBridge375(kniSC: NativePtr, kniR: NativePtr, timeoutInterval: NSTimeInterval): Unit {
    return kniBridge398(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, timeoutInterval)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HTTPRequestHeaders", "@16@0:8", "knimi_com_afnetworking376")
internal fun objcKniBridge377(kniSC: NativePtr, kniR: NativePtr): Map<Any?, *> {
    return interpretObjCPointerOrNull<Map<Any?, *>>(kniBridge400(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HTTPMethodsEncodingParametersInURI", "@16@0:8", "knimi_com_afnetworking378")
internal fun objcKniBridge379(kniSC: NativePtr, kniR: NativePtr): Set<*> {
    return interpretObjCPointerOrNull<Set<*>>(kniBridge402(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHTTPMethodsEncodingParametersInURI:", "v24@0:8@16", "knimi_com_afnetworking380")
internal fun objcKniBridge381(kniSC: NativePtr, kniR: NativePtr, HTTPMethodsEncodingParametersInURI: Set<*>): Unit {
    return kniBridge404(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, HTTPMethodsEncodingParametersInURI.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking382")
internal fun objcKniBridge383(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge406(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking384")
internal fun objcKniBridge385(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFHTTPRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge408(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestBySerializingRequest:withParameters:error:", "@40@0:8@16@24^@32", "knimi_com_afnetworking386")
internal fun objcKniBridge387(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, withParameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSURLRequest? {
    return interpretObjCPointerOrNull<NSURLRequest>(kniBridge410(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), withParameters.objcPtr(), error.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_afnetworking388")
internal fun objcKniBridge389(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge412(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_afnetworking390")
internal fun objcKniBridge391(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge414(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_afnetworking392")
internal fun objcKniBridge393(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge416(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_afnetworking394")
internal fun objcKniBridge395(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge418(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_afnetworking396")
internal fun objcKniBridge397(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge420(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_afnetworking398")
internal fun objcKniBridge399(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge422(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_afnetworking400")
internal fun objcKniBridge401(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge424(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_afnetworking402")
internal fun objcKniBridge403(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge426(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_afnetworking404")
internal fun objcKniBridge405(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge428(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_afnetworking406")
internal fun objcKniBridge407(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge430(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_afnetworking408")
internal fun objcKniBridge409(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge432(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_afnetworking410")
internal fun objcKniBridge411(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge434(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_afnetworking412")
internal fun objcKniBridge413(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge436(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking414")
internal fun objcKniBridge415(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge438(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking416")
internal fun objcKniBridge417(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge440(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_afnetworking418")
internal fun objcKniBridge419(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge442(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializerWithWritingOptions:", "@24@0:8Q16", "knimi_com_afnetworking420")
internal fun objcKniBridge421(kniSC: NativePtr, kniR: NativePtr, writingOptions: NSJSONWritingOptions): AFJSONRequestSerializer {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge444(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, writingOptions))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking422")
internal fun objcKniBridge423(kniSC: NativePtr, kniR: NativePtr): AFJSONRequestSerializer {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge446(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking424")
internal fun objcKniBridge425(kniSC: NativePtr, kniR: NativePtr): AFJSONRequestSerializer? {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge448(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking426")
internal fun objcKniBridge427(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFJSONRequestSerializer? {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge450(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking428")
internal fun objcKniBridge429(kniSC: NativePtr, kniR: NativePtr): AFJSONRequestSerializer? {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge452(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("writingOptions", "Q16@0:8", "knimi_com_afnetworking430")
internal fun objcKniBridge431(kniSC: NativePtr, kniR: NativePtr): NSJSONWritingOptions {
    return kniBridge454(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setWritingOptions:", "v24@0:8Q16", "knimi_com_afnetworking432")
internal fun objcKniBridge433(kniSC: NativePtr, kniR: NativePtr, writingOptions: NSJSONWritingOptions): Unit {
    return kniBridge456(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, writingOptions)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking434")
internal fun objcKniBridge435(kniSC: NativePtr, kniR: NativePtr): AFJSONRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge458(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking436")
internal fun objcKniBridge437(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFJSONRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge460(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializerWithFormat:writeOptions:", "@32@0:8Q16Q24", "knimi_com_afnetworking438")
internal fun objcKniBridge439(kniSC: NativePtr, kniR: NativePtr, format: NSPropertyListFormat, writeOptions: NSPropertyListWriteOptions): AFPropertyListRequestSerializer {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge462(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, format, writeOptions))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking440")
internal fun objcKniBridge441(kniSC: NativePtr, kniR: NativePtr): AFPropertyListRequestSerializer {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge464(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking442")
internal fun objcKniBridge443(kniSC: NativePtr, kniR: NativePtr): AFPropertyListRequestSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge466(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking444")
internal fun objcKniBridge445(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFPropertyListRequestSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge468(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking446")
internal fun objcKniBridge447(kniSC: NativePtr, kniR: NativePtr): AFPropertyListRequestSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge470(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("format", "Q16@0:8", "knimi_com_afnetworking448")
internal fun objcKniBridge449(kniSC: NativePtr, kniR: NativePtr): NSPropertyListFormat {
    return kniBridge472(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setFormat:", "v24@0:8Q16", "knimi_com_afnetworking450")
internal fun objcKniBridge451(kniSC: NativePtr, kniR: NativePtr, format: NSPropertyListFormat): Unit {
    return kniBridge474(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, format)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("writeOptions", "Q16@0:8", "knimi_com_afnetworking452")
internal fun objcKniBridge453(kniSC: NativePtr, kniR: NativePtr): NSPropertyListWriteOptions {
    return kniBridge476(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setWriteOptions:", "v24@0:8Q16", "knimi_com_afnetworking454")
internal fun objcKniBridge455(kniSC: NativePtr, kniR: NativePtr, writeOptions: NSPropertyListWriteOptions): Unit {
    return kniBridge478(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, writeOptions)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking456")
internal fun objcKniBridge457(kniSC: NativePtr, kniR: NativePtr): AFPropertyListRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge480(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking458")
internal fun objcKniBridge459(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFPropertyListRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge482(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("certificatesInBundle:", "@24@0:8@16", "knimi_com_afnetworking460")
internal fun objcKniBridge461(kniSC: NativePtr, kniR: NativePtr, bundle: NSBundle): Set<*> {
    return interpretObjCPointerOrNull<Set<*>>(kniBridge484(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, bundle.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("defaultPolicy", "@16@0:8", "knimi_com_afnetworking462")
internal fun objcKniBridge463(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge486(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("policyWithPinningMode:", "@24@0:8Q16", "knimi_com_afnetworking464")
internal fun objcKniBridge465(kniSC: NativePtr, kniR: NativePtr, pinningMode: AFSSLPinningMode): AFSecurityPolicy {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge488(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, pinningMode.value))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("policyWithPinningMode:withPinnedCertificates:", "@32@0:8Q16@24", "knimi_com_afnetworking466")
internal fun objcKniBridge467(kniSC: NativePtr, kniR: NativePtr, pinningMode: AFSSLPinningMode, withPinnedCertificates: Set<*>): AFSecurityPolicy {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge490(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, pinningMode.value, withPinnedCertificates.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking468")
internal fun objcKniBridge469(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy? {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge492(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking470")
internal fun objcKniBridge471(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFSecurityPolicy? {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge494(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking472")
internal fun objcKniBridge473(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy? {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge496(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking474")
internal fun objcKniBridge475(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge498(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("evaluateServerTrust:forDomain:", "B32@0:8^{__SecTrust=}16@24", "knimi_com_afnetworking476")
internal fun objcKniBridge477(kniSC: NativePtr, kniR: NativePtr, serverTrust: SecTrustRef?, forDomain: String?): Boolean {
    return kniBridge500(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, serverTrust.rawValue, forDomain.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("SSLPinningMode", "Q16@0:8", "knimi_com_afnetworking478")
internal fun objcKniBridge479(kniSC: NativePtr, kniR: NativePtr): AFSSLPinningMode {
    return AFSSLPinningMode.byValue(kniBridge502(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("pinnedCertificates", "@16@0:8", "knimi_com_afnetworking480")
internal fun objcKniBridge481(kniSC: NativePtr, kniR: NativePtr): Set<*>? {
    return interpretObjCPointerOrNull<Set<*>>(kniBridge504(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setPinnedCertificates:", "v24@0:8@16", "knimi_com_afnetworking482")
internal fun objcKniBridge483(kniSC: NativePtr, kniR: NativePtr, pinnedCertificates: Set<*>?): Unit {
    return kniBridge506(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, pinnedCertificates.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allowInvalidCertificates", "B16@0:8", "knimi_com_afnetworking484")
internal fun objcKniBridge485(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge508(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAllowInvalidCertificates:", "v20@0:8B16", "knimi_com_afnetworking486")
internal fun objcKniBridge487(kniSC: NativePtr, kniR: NativePtr, allowInvalidCertificates: Boolean): Unit {
    return kniBridge510(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, allowInvalidCertificates.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("validatesDomainName", "B16@0:8", "knimi_com_afnetworking488")
internal fun objcKniBridge489(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge512(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setValidatesDomainName:", "v20@0:8B16", "knimi_com_afnetworking490")
internal fun objcKniBridge491(kniSC: NativePtr, kniR: NativePtr, validatesDomainName: Boolean): Unit {
    return kniBridge514(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, validatesDomainName.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking492")
internal fun objcKniBridge493(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge516(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking494")
internal fun objcKniBridge495(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFSecurityPolicy? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge518(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking496")
internal fun objcKniBridge497(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge520(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking498")
internal fun objcKniBridge499(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge522(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("sharedManager", "@16@0:8", "knimi_com_afnetworking500")
internal fun objcKniBridge501(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge524(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("manager", "@16@0:8", "knimi_com_afnetworking502")
internal fun objcKniBridge503(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge526(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("managerForDomain:", "@24@0:8@16", "knimi_com_afnetworking504")
internal fun objcKniBridge505(kniSC: NativePtr, kniR: NativePtr, domain: String): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge528(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, domain.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("managerForAddress:", "@24@0:8r^v16", "knimi_com_afnetworking506")
internal fun objcKniBridge507(kniSC: NativePtr, kniR: NativePtr, address: COpaquePointer?): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge530(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, address.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking508")
internal fun objcKniBridge509(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager? {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge532(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking510")
internal fun objcKniBridge511(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFNetworkReachabilityManager? {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge534(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking512")
internal fun objcKniBridge513(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager? {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge536(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithReachability:", "@24@0:8r^{__SCNetworkReachability=}16", "knimi_com_afnetworking514")
internal fun objcKniBridge515(kniSC: NativePtr, kniR: NativePtr, reachability: SCNetworkReachabilityRef?): AFNetworkReachabilityManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge538(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, reachability.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("startMonitoring", "v16@0:8", "knimi_com_afnetworking516")
internal fun objcKniBridge517(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge540(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("stopMonitoring", "v16@0:8", "knimi_com_afnetworking518")
internal fun objcKniBridge519(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge542(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("localizedNetworkReachabilityStatusString", "@16@0:8", "knimi_com_afnetworking520")
internal fun objcKniBridge521(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge544(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setReachabilityStatusChangeBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking522")
internal fun objcKniBridge523(kniSC: NativePtr, kniR: NativePtr, block: ((AFNetworkReachabilityStatus) -> Unit)?): Unit {
    return kniBridge546(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("networkReachabilityStatus", "q16@0:8", "knimi_com_afnetworking524")
internal fun objcKniBridge525(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityStatus {
    return kniBridge550(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isReachable", "B16@0:8", "knimi_com_afnetworking526")
internal fun objcKniBridge527(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge552(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isReachableViaWWAN", "B16@0:8", "knimi_com_afnetworking528")
internal fun objcKniBridge529(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge554(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isReachableViaWiFi", "B16@0:8", "knimi_com_afnetworking530")
internal fun objcKniBridge531(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge556(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking532")
internal fun objcKniBridge533(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge558(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking534")
internal fun objcKniBridge535(kniSC: NativePtr, kniR: NativePtr): AFURLSessionManager? {
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge560(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking536")
internal fun objcKniBridge537(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFURLSessionManager? {
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge562(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking538")
internal fun objcKniBridge539(kniSC: NativePtr, kniR: NativePtr): AFURLSessionManager? {
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge564(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking540")
internal fun objcKniBridge541(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge566(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithSessionConfiguration:", "@24@0:8@16", "knimi_com_afnetworking542")
internal fun objcKniBridge543(kniSC: NativePtr, kniR: NativePtr, configuration: NSURLSessionConfiguration?): AFURLSessionManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge568(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, configuration.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("invalidateSessionCancelingTasks:", "v20@0:8B16", "knimi_com_afnetworking544")
internal fun objcKniBridge545(kniSC: NativePtr, kniR: NativePtr, cancelPendingTasks: Boolean): Unit {
    return kniBridge570(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, cancelPendingTasks.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dataTaskWithRequest:completionHandler:", "@32@0:8@16@\u003F24", "knimi_com_afnetworking546")
internal fun objcKniBridge547(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionDataTask {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge572(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dataTaskWithRequest:uploadProgress:downloadProgress:completionHandler:", "@48@0:8@16@\u003F24@\u003F32@\u003F40", "knimi_com_afnetworking548")
internal fun objcKniBridge549(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, uploadProgress: ((NSProgress?) -> Unit)?, downloadProgress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionDataTask {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge576(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), createKotlinObjectHolder(uploadProgress), createKotlinObjectHolder(downloadProgress), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadTaskWithRequest:fromFile:progress:completionHandler:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking550")
internal fun objcKniBridge551(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, fromFile: NSURL, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask {
    return interpretObjCPointerOrNull<NSURLSessionUploadTask>(kniBridge584(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), fromFile.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadTaskWithRequest:fromData:progress:completionHandler:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking552")
internal fun objcKniBridge553(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, fromData: NSData?, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask {
    return interpretObjCPointerOrNull<NSURLSessionUploadTask>(kniBridge590(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), fromData.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadTaskWithStreamedRequest:progress:completionHandler:", "@40@0:8@16@\u003F24@\u003F32", "knimi_com_afnetworking554")
internal fun objcKniBridge555(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask {
    return interpretObjCPointerOrNull<NSURLSessionUploadTask>(kniBridge596(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("downloadTaskWithRequest:progress:destination:completionHandler:", "@48@0:8@16@\u003F24@\u003F32@\u003F40", "knimi_com_afnetworking556")
internal fun objcKniBridge557(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, progress: ((NSProgress?) -> Unit)?, destination: ((NSURL?, NSURLResponse?) -> NSURL?)?, completionHandler: ((NSURLResponse?, NSURL?, NSError?) -> Unit)?): NSURLSessionDownloadTask {
    return interpretObjCPointerOrNull<NSURLSessionDownloadTask>(kniBridge602(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(destination), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("downloadTaskWithResumeData:progress:destination:completionHandler:", "@48@0:8@16@\u003F24@\u003F32@\u003F40", "knimi_com_afnetworking558")
internal fun objcKniBridge559(kniSC: NativePtr, kniR: NativePtr, resumeData: NSData, progress: ((NSProgress?) -> Unit)?, destination: ((NSURL?, NSURLResponse?) -> NSURL?)?, completionHandler: ((NSURLResponse?, NSURL?, NSError?) -> Unit)?): NSURLSessionDownloadTask {
    return interpretObjCPointerOrNull<NSURLSessionDownloadTask>(kniBridge610(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, resumeData.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(destination), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadProgressForTask:", "@24@0:8@16", "knimi_com_afnetworking560")
internal fun objcKniBridge561(kniSC: NativePtr, kniR: NativePtr, task: NSURLSessionTask): NSProgress? {
    return interpretObjCPointerOrNull<NSProgress>(kniBridge618(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, task.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("downloadProgressForTask:", "@24@0:8@16", "knimi_com_afnetworking562")
internal fun objcKniBridge563(kniSC: NativePtr, kniR: NativePtr, task: NSURLSessionTask): NSProgress? {
    return interpretObjCPointerOrNull<NSProgress>(kniBridge620(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, task.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSessionDidBecomeInvalidBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking564")
internal fun objcKniBridge565(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSError?) -> Unit)?): Unit {
    return kniBridge622(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSessionDidReceiveAuthenticationChallengeBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking566")
internal fun objcKniBridge567(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition)?): Unit {
    return kniBridge626(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskNeedNewBodyStreamBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking568")
internal fun objcKniBridge569(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?) -> NSInputStream?)?): Unit {
    return kniBridge630(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskWillPerformHTTPRedirectionBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking570")
internal fun objcKniBridge571(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?, NSURLResponse?, NSURLRequest?) -> NSURLRequest?)?): Unit {
    return kniBridge634(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskDidReceiveAuthenticationChallengeBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking572")
internal fun objcKniBridge573(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition)?): Unit {
    return kniBridge638(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskDidSendBodyDataBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking574")
internal fun objcKniBridge575(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?, int64_t, int64_t, int64_t) -> Unit)?): Unit {
    return kniBridge642(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskDidCompleteBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking576")
internal fun objcKniBridge577(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?, NSError?) -> Unit)?): Unit {
    return kniBridge646(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDataTaskDidReceiveResponseBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking578")
internal fun objcKniBridge579(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDataTask?, NSURLResponse?) -> NSURLSessionResponseDisposition)?): Unit {
    return kniBridge650(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDataTaskDidBecomeDownloadTaskBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking580")
internal fun objcKniBridge581(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDataTask?, NSURLSessionDownloadTask?) -> Unit)?): Unit {
    return kniBridge654(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDataTaskDidReceiveDataBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking582")
internal fun objcKniBridge583(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDataTask?, NSData?) -> Unit)?): Unit {
    return kniBridge658(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDataTaskWillCacheResponseBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking584")
internal fun objcKniBridge585(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDataTask?, NSCachedURLResponse?) -> NSCachedURLResponse?)?): Unit {
    return kniBridge662(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDidFinishEventsForBackgroundURLSessionBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking586")
internal fun objcKniBridge587(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?) -> Unit)?): Unit {
    return kniBridge666(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDownloadTaskDidFinishDownloadingBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking588")
internal fun objcKniBridge589(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDownloadTask?, NSURL?) -> NSURL?)?): Unit {
    return kniBridge670(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDownloadTaskDidWriteDataBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking590")
internal fun objcKniBridge591(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t, int64_t) -> Unit)?): Unit {
    return kniBridge674(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDownloadTaskDidResumeBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking592")
internal fun objcKniBridge593(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t) -> Unit)?): Unit {
    return kniBridge678(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("session", "@16@0:8", "knimi_com_afnetworking594")
internal fun objcKniBridge595(kniSC: NativePtr, kniR: NativePtr): NSURLSession {
    return interpretObjCPointerOrNull<NSURLSession>(kniBridge682(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("operationQueue", "@16@0:8", "knimi_com_afnetworking596")
internal fun objcKniBridge597(kniSC: NativePtr, kniR: NativePtr): NSOperationQueue {
    return interpretObjCPointerOrNull<NSOperationQueue>(kniBridge684(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseSerializer", "@16@0:8", "knimi_com_afnetworking598")
internal fun objcKniBridge599(kniSC: NativePtr, kniR: NativePtr): AFURLResponseSerializationProtocol {
    return interpretObjCPointerOrNull<AFURLResponseSerializationProtocol>(kniBridge686(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setResponseSerializer:", "v24@0:8@16", "knimi_com_afnetworking600")
internal fun objcKniBridge601(kniSC: NativePtr, kniR: NativePtr, responseSerializer: AFURLResponseSerializationProtocol): Unit {
    return kniBridge688(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, responseSerializer.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("securityPolicy", "@16@0:8", "knimi_com_afnetworking602")
internal fun objcKniBridge603(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge690(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSecurityPolicy:", "v24@0:8@16", "knimi_com_afnetworking604")
internal fun objcKniBridge605(kniSC: NativePtr, kniR: NativePtr, securityPolicy: AFSecurityPolicy): Unit {
    return kniBridge692(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, securityPolicy.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("reachabilityManager", "@16@0:8", "knimi_com_afnetworking606")
internal fun objcKniBridge607(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge694(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setReachabilityManager:", "v24@0:8@16", "knimi_com_afnetworking608")
internal fun objcKniBridge609(kniSC: NativePtr, kniR: NativePtr, reachabilityManager: AFNetworkReachabilityManager): Unit {
    return kniBridge696(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, reachabilityManager.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("tasks", "@16@0:8", "knimi_com_afnetworking610")
internal fun objcKniBridge611(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge698(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dataTasks", "@16@0:8", "knimi_com_afnetworking612")
internal fun objcKniBridge613(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge700(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadTasks", "@16@0:8", "knimi_com_afnetworking614")
internal fun objcKniBridge615(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge702(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("downloadTasks", "@16@0:8", "knimi_com_afnetworking616")
internal fun objcKniBridge617(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge704(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("completionQueue", "@16@0:8", "knimi_com_afnetworking618")
internal fun objcKniBridge619(kniSC: NativePtr, kniR: NativePtr): dispatch_queue_t? {
    return interpretObjCPointerOrNull<NSObject>(kniBridge706(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setCompletionQueue:", "v24@0:8@16", "knimi_com_afnetworking620")
internal fun objcKniBridge621(kniSC: NativePtr, kniR: NativePtr, completionQueue: dispatch_queue_t?): Unit {
    return kniBridge708(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, completionQueue.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("completionGroup", "@16@0:8", "knimi_com_afnetworking622")
internal fun objcKniBridge623(kniSC: NativePtr, kniR: NativePtr): dispatch_group_t? {
    return interpretObjCPointerOrNull<NSObject>(kniBridge710(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setCompletionGroup:", "v24@0:8@16", "knimi_com_afnetworking624")
internal fun objcKniBridge625(kniSC: NativePtr, kniR: NativePtr, completionGroup: dispatch_group_t?): Unit {
    return kniBridge712(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, completionGroup.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("attemptsToRecreateUploadTasksForBackgroundSessions", "B16@0:8", "knimi_com_afnetworking626")
internal fun objcKniBridge627(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge714(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAttemptsToRecreateUploadTasksForBackgroundSessions:", "v20@0:8B16", "knimi_com_afnetworking628")
internal fun objcKniBridge629(kniSC: NativePtr, kniR: NativePtr, attemptsToRecreateUploadTasksForBackgroundSessions: Boolean): Unit {
    return kniBridge716(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, attemptsToRecreateUploadTasksForBackgroundSessions.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking630")
internal fun objcKniBridge631(kniSC: NativePtr, kniR: NativePtr): AFURLSessionManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge718(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking632")
internal fun objcKniBridge633(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFURLSessionManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge720(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_afnetworking634")
internal fun objcKniBridge635(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge722(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_afnetworking636")
internal fun objcKniBridge637(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge724(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_afnetworking638")
internal fun objcKniBridge639(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge726(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_afnetworking640")
internal fun objcKniBridge641(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge728(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_afnetworking642")
internal fun objcKniBridge643(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge730(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_afnetworking644")
internal fun objcKniBridge645(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge732(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_afnetworking646")
internal fun objcKniBridge647(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge734(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_afnetworking648")
internal fun objcKniBridge649(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge736(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_afnetworking650")
internal fun objcKniBridge651(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge738(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_afnetworking652")
internal fun objcKniBridge653(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge740(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_afnetworking654")
internal fun objcKniBridge655(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge742(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_afnetworking656")
internal fun objcKniBridge657(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge744(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_afnetworking658")
internal fun objcKniBridge659(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge746(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:downloadTask:didFinishDownloadingToURL:", "v40@0:8@16@24@32", "knimi_com_afnetworking660")
internal fun objcKniBridge661(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, downloadTask: NSURLSessionDownloadTask, didFinishDownloadingToURL: NSURL): Unit {
    return kniBridge748(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), downloadTask.objcPtr(), didFinishDownloadingToURL.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking662")
internal fun objcKniBridge663(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge750(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking664")
internal fun objcKniBridge665(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge752(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_afnetworking666")
internal fun objcKniBridge667(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge754(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:didBecomeInvalidWithError:", "v32@0:8@16@24", "knimi_com_afnetworking668")
internal fun objcKniBridge669(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, didBecomeInvalidWithError: NSError?): Unit {
    return kniBridge756(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), didBecomeInvalidWithError.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:didReceiveChallenge:completionHandler:", "v40@0:8@16@24@\u003F32", "knimi_com_afnetworking670")
internal fun objcKniBridge671(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, didReceiveChallenge: NSURLAuthenticationChallenge, completionHandler: (NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit): Unit {
    return kniBridge758(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), didReceiveChallenge.objcPtr(), createKotlinObjectHolder(completionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSessionDidFinishEventsForBackgroundURLSession:", "v24@0:8@16", "knimi_com_afnetworking672")
internal fun objcKniBridge673(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession): Unit {
    return kniBridge762(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:willBeginDelayedRequest:completionHandler:", "v48@0:8@16@24@32@\u003F40", "knimi_com_afnetworking674")
internal fun objcKniBridge675(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, willBeginDelayedRequest: NSURLRequest, completionHandler: (NSURLSessionDelayedRequestDisposition, NSURLRequest?) -> Unit): Unit {
    return kniBridge764(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), willBeginDelayedRequest.objcPtr(), createKotlinObjectHolder(completionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:taskIsWaitingForConnectivity:", "v32@0:8@16@24", "knimi_com_afnetworking676")
internal fun objcKniBridge677(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, taskIsWaitingForConnectivity: NSURLSessionTask): Unit {
    return kniBridge768(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), taskIsWaitingForConnectivity.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:", "v56@0:8@16@24@32@40@\u003F48", "knimi_com_afnetworking678")
internal fun objcKniBridge679(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, willPerformHTTPRedirection: NSHTTPURLResponse, newRequest: NSURLRequest, completionHandler: (NSURLRequest?) -> Unit): Unit {
    return kniBridge770(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), willPerformHTTPRedirection.objcPtr(), newRequest.objcPtr(), createKotlinObjectHolder(completionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:didReceiveChallenge:completionHandler:", "v48@0:8@16@24@32@\u003F40", "knimi_com_afnetworking680")
internal fun objcKniBridge681(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, didReceiveChallenge: NSURLAuthenticationChallenge, completionHandler: (NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit): Unit {
    return kniBridge774(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), didReceiveChallenge.objcPtr(), createKotlinObjectHolder(completionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:needNewBodyStream:", "v40@0:8@16@24@\u003F32", "knimi_com_afnetworking682")
internal fun objcKniBridge683(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, needNewBodyStream: (NSInputStream?) -> Unit): Unit {
    return kniBridge778(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), createKotlinObjectHolder(needNewBodyStream))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:", "v56@0:8@16@24q32q40q48", "knimi_com_afnetworking684")
internal fun objcKniBridge685(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, didSendBodyData: int64_t, totalBytesSent: int64_t, totalBytesExpectedToSend: int64_t): Unit {
    return kniBridge782(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), didSendBodyData, totalBytesSent, totalBytesExpectedToSend)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:didFinishCollectingMetrics:", "v40@0:8@16@24@32", "knimi_com_afnetworking686")
internal fun objcKniBridge687(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, didFinishCollectingMetrics: NSURLSessionTaskMetrics): Unit {
    return kniBridge784(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), didFinishCollectingMetrics.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:didCompleteWithError:", "v40@0:8@16@24@32", "knimi_com_afnetworking688")
internal fun objcKniBridge689(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, didCompleteWithError: NSError?): Unit {
    return kniBridge786(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), didCompleteWithError.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("manager", "@16@0:8", "knimi_com_afnetworking690")
internal fun objcKniBridge691(kniSC: NativePtr, kniR: NativePtr): AFHTTPSessionManager {
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge788(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking692")
internal fun objcKniBridge693(kniSC: NativePtr, kniR: NativePtr): AFHTTPSessionManager? {
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge790(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking694")
internal fun objcKniBridge695(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFHTTPSessionManager? {
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge792(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking696")
internal fun objcKniBridge697(kniSC: NativePtr, kniR: NativePtr): AFHTTPSessionManager? {
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge794(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking698")
internal fun objcKniBridge699(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge796(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithBaseURL:", "@24@0:8@16", "knimi_com_afnetworking700")
internal fun objcKniBridge701(kniSC: NativePtr, kniR: NativePtr, url: NSURL?): AFHTTPSessionManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge798(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, url.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithBaseURL:sessionConfiguration:", "@32@0:8@16@24", "knimi_com_afnetworking702")
internal fun objcKniBridge703(kniSC: NativePtr, kniR: NativePtr, url: NSURL?, sessionConfiguration: NSURLSessionConfiguration?): AFHTTPSessionManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge800(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, url.objcPtr(), sessionConfiguration.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("GET:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking704")
internal fun objcKniBridge705(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge802(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("GET:parameters:progress:success:failure:", "@56@0:8@16@24@\u003F32@\u003F40@\u003F48", "knimi_com_afnetworking706")
internal fun objcKniBridge707(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge808(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HEAD:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking708")
internal fun objcKniBridge709(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge816(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("POST:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking710")
internal fun objcKniBridge711(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge822(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("POST:parameters:progress:success:failure:", "@56@0:8@16@24@\u003F32@\u003F40@\u003F48", "knimi_com_afnetworking712")
internal fun objcKniBridge713(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge828(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("POST:parameters:constructingBodyWithBlock:success:failure:", "@56@0:8@16@24@\u003F32@\u003F40@\u003F48", "knimi_com_afnetworking714")
internal fun objcKniBridge715(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge836(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(constructingBodyWithBlock), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("POST:parameters:constructingBodyWithBlock:progress:success:failure:", "@64@0:8@16@24@\u003F32@\u003F40@\u003F48@\u003F56", "knimi_com_afnetworking716")
internal fun objcKniBridge717(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge844(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(constructingBodyWithBlock), createKotlinObjectHolder(progress), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("PUT:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking718")
internal fun objcKniBridge719(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge854(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("PATCH:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking720")
internal fun objcKniBridge721(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge860(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("DELETE:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking722")
internal fun objcKniBridge723(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge866(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("baseURL", "@16@0:8", "knimi_com_afnetworking724")
internal fun objcKniBridge725(kniSC: NativePtr, kniR: NativePtr): NSURL? {
    return interpretObjCPointerOrNull<NSURL>(kniBridge872(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestSerializer", "@16@0:8", "knimi_com_afnetworking726")
internal fun objcKniBridge727(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge874(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setRequestSerializer:", "v24@0:8@16", "knimi_com_afnetworking728")
internal fun objcKniBridge729(kniSC: NativePtr, kniR: NativePtr, requestSerializer: AFHTTPRequestSerializer): Unit {
    return kniBridge876(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, requestSerializer.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseSerializer", "@16@0:8", "knimi_com_afnetworking730")
internal fun objcKniBridge731(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge878(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setResponseSerializer:", "v24@0:8@16", "knimi_com_afnetworking732")
internal fun objcKniBridge733(kniSC: NativePtr, kniR: NativePtr, responseSerializer: AFHTTPResponseSerializer): Unit {
    return kniBridge880(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, responseSerializer.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithSessionConfiguration:", "@24@0:8@16", "knimi_com_afnetworking734")
internal fun objcKniBridge735(kniSC: NativePtr, kniR: NativePtr, configuration: NSURLSessionConfiguration?): AFHTTPSessionManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge882(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, configuration.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking736")
internal fun objcKniBridge737(kniSC: NativePtr, kniR: NativePtr): AFHTTPSessionManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge884(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking738")
internal fun objcKniBridge739(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFHTTPSessionManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge886(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking740")
internal fun objcKniBridge741(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge888(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking742")
internal fun objcKniBridge743(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge890(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@SymbolName("com_afnetworking_kniBridge0")
private external fun kniBridge0(p0: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge1")
private external fun kniBridge1(p0: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge2")
private external fun kniBridge2(p0: Long): NativePtr
@SymbolName("com_afnetworking_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge4")
private external fun kniBridge4(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge6")
private external fun kniBridge6(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("com_afnetworking_kniBridge8")
private external fun kniBridge8(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("com_afnetworking_kniBridge9")
private external fun kniBridge9(p0: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge10")
private external fun kniBridge10(p0: NativePtr): Byte
@SymbolName("com_afnetworking_kniBridge11")
private external fun kniBridge11(p0: NativePtr): Byte
@SymbolName("com_afnetworking_kniBridge12")
private external fun kniBridge12(p0: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge13")
private external fun kniBridge13(p0: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge14")
private external fun kniBridge14(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge15")
private fun kniBridge15(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLResponseSerializationProtocol>().responseObjectForResponse(response = interpretObjCPointerOrNull<NSURLResponse>(p1), data = interpretObjCPointerOrNull<NSData>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge16")
private external fun kniBridge16(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge17")
private fun kniBridge17(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLResponseSerializationProtocol>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge18")
private external fun kniBridge18(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge19")
private fun kniBridge19(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewControllerDelegateProtocol>().documentBrowser(controller = interpretObjCPointerOrNull<UIDocumentBrowserViewController>(p1)!!, didPickDocumentURLs = interpretObjCPointerOrNull<List<*>>(p2)!!)
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge21")
private fun kniBridge21(p0: NativePtr, p1: ULong, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURL?, UIDocumentBrowserImportMode) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURL>(p0), UIDocumentBrowserImportMode.byValue(p1))
}
@SymbolName("com_afnetworking_kniBridge20")
private external fun kniBridge20(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: ULong, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge22")
private fun kniBridge22(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewControllerDelegateProtocol>().documentBrowser(controller = interpretObjCPointerOrNull<UIDocumentBrowserViewController>(p1)!!, didRequestDocumentCreationWithHandler = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURL?, p1: UIDocumentBrowserImportMode): Unit {
return kniBridge23(p0.objcPtr(), p1.value, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge25")
private fun kniBridge25(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewControllerDelegateProtocol>().documentBrowser(controller = interpretObjCPointerOrNull<UIDocumentBrowserViewController>(p1)!!, didImportDocumentAtURL = interpretObjCPointerOrNull<NSURL>(p2)!!, toDestinationURL = interpretObjCPointerOrNull<NSURL>(p3)!!)
}
@SymbolName("com_afnetworking_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge27")
private fun kniBridge27(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewControllerDelegateProtocol>().documentBrowser(controller = interpretObjCPointerOrNull<UIDocumentBrowserViewController>(p1)!!, failedToImportDocumentAtURL = interpretObjCPointerOrNull<NSURL>(p2)!!, error = interpretObjCPointerOrNull<NSError>(p3))
}
@SymbolName("com_afnetworking_kniBridge28")
private external fun kniBridge28(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge29")
private fun kniBridge29(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewControllerDelegateProtocol>().documentBrowser(controller = interpretObjCPointerOrNull<UIDocumentBrowserViewController>(p1)!!, applicationActivitiesForDocumentURLs = interpretObjCPointerOrNull<List<*>>(p2)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge30")
private external fun kniBridge30(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge31")
private fun kniBridge31(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewControllerDelegateProtocol>().documentBrowser(controller = interpretObjCPointerOrNull<UIDocumentBrowserViewController>(p1)!!, willPresentActivityViewController = interpretObjCPointerOrNull<UIActivityViewController>(p2)!!)
}
@SymbolName("com_afnetworking_kniBridge32")
private external fun kniBridge32(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge33")
private fun kniBridge33(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLRequestSerializationProtocol>().requestBySerializingRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, withParameters = interpretObjCPointerOrNull<Any>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge35")
private fun kniBridge35(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLRequestSerializationProtocol>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge37")
private fun kniBridge37(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithFileURL(fileURL = interpretObjCPointerOrNull<NSURL>(p1)!!, name = interpretObjCPointerOrNull<String>(p2)!!, error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).toByte()
}
@SymbolName("com_afnetworking_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge39")
private fun kniBridge39(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithFileURL(fileURL = interpretObjCPointerOrNull<NSURL>(p1)!!, name = interpretObjCPointerOrNull<String>(p2)!!, fileName = interpretObjCPointerOrNull<String>(p3)!!, mimeType = interpretObjCPointerOrNull<String>(p4)!!, error = interpretCPointer<ObjCObjectVar<NSError?>>(p5)).toByte()
}
@SymbolName("com_afnetworking_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: Long, p6: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge41")
private fun kniBridge41(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Long, p5: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithInputStream(inputStream = interpretObjCPointerOrNull<NSInputStream>(p1), name = interpretObjCPointerOrNull<String>(p2)!!, fileName = interpretObjCPointerOrNull<String>(p3)!!, length = p4, mimeType = interpretObjCPointerOrNull<String>(p5)!!)
}
@SymbolName("com_afnetworking_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge43")
private fun kniBridge43(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithFileData(data = interpretObjCPointerOrNull<NSData>(p1)!!, name = interpretObjCPointerOrNull<String>(p2)!!, fileName = interpretObjCPointerOrNull<String>(p3)!!, mimeType = interpretObjCPointerOrNull<String>(p4)!!)
}
@SymbolName("com_afnetworking_kniBridge44")
private external fun kniBridge44(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge45")
private fun kniBridge45(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithFormData(data = interpretObjCPointerOrNull<NSData>(p1)!!, name = interpretObjCPointerOrNull<String>(p2)!!)
}
@SymbolName("com_afnetworking_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge47")
private fun kniBridge47(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithHeaders(headers = interpretObjCPointerOrNull<Map<Any?, *>>(p1), body = interpretObjCPointerOrNull<NSData>(p2)!!)
}
@SymbolName("com_afnetworking_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr, p2: ULong, p3: Double): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge49")
private fun kniBridge49(p0: NativePtr, p1: ULong, p2: Double): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().throttleBandwidthWithPacketSize(numberOfBytes = p1, delay = p2)
}
@SymbolName("com_afnetworking_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge51")
private fun kniBridge51(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge53")
private fun kniBridge53(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge55")
private fun kniBridge55(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge57")
private fun kniBridge57(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge59")
private fun kniBridge59(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge60")
private external fun kniBridge60(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge61")
private fun kniBridge61(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge62")
private external fun kniBridge62(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge63")
private fun kniBridge63(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().validateResponse(response = interpretObjCPointerOrNull<NSHTTPURLResponse>(p1), data = interpretObjCPointerOrNull<NSData>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).toByte()
}
@SymbolName("com_afnetworking_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge65")
private fun kniBridge65(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().stringEncoding()
}
@SymbolName("com_afnetworking_kniBridge66")
private external fun kniBridge66(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge67")
private fun kniBridge67(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().setStringEncoding(stringEncoding = p1)
}
@SymbolName("com_afnetworking_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge69")
private fun kniBridge69(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().acceptableStatusCodes().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge71")
private fun kniBridge71(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().setAcceptableStatusCodes(acceptableStatusCodes = interpretObjCPointerOrNull<NSIndexSet>(p1))
}
@SymbolName("com_afnetworking_kniBridge72")
private external fun kniBridge72(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge73")
private fun kniBridge73(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().acceptableContentTypes().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge74")
private external fun kniBridge74(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge75")
private fun kniBridge75(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().setAcceptableContentTypes(acceptableContentTypes = interpretObjCPointerOrNull<Set<*>>(p1))
}
@SymbolName("com_afnetworking_kniBridge76")
private external fun kniBridge76(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge77")
private fun kniBridge77(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge78")
private external fun kniBridge78(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge79")
private fun kniBridge79(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().responseObjectForResponse(response = interpretObjCPointerOrNull<NSURLResponse>(p1), data = interpretObjCPointerOrNull<NSData>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge81")
private fun kniBridge81(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge83")
private fun kniBridge83(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().`class`().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge85")
private fun kniBridge85(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge86")
private external fun kniBridge86(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge87")
private fun kniBridge87(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge88")
private external fun kniBridge88(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge89")
private fun kniBridge89(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge90")
private external fun kniBridge90(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge91")
private fun kniBridge91(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().isProxy().toByte()
}
@SymbolName("com_afnetworking_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge93")
private fun kniBridge93(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge94")
private external fun kniBridge94(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge95")
private fun kniBridge95(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge96")
private external fun kniBridge96(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge97")
private fun kniBridge97(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge98")
private external fun kniBridge98(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge99")
private fun kniBridge99(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge101")
private fun kniBridge101(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().hash()
}
@SymbolName("com_afnetworking_kniBridge102")
private external fun kniBridge102(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge103")
private fun kniBridge103(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().superclass().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge104")
private external fun kniBridge104(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge105")
private fun kniBridge105(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().description().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge106")
private external fun kniBridge106(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge107")
private fun kniBridge107(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge108")
private external fun kniBridge108(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge109")
private fun kniBridge109(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge110")
private external fun kniBridge110(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge111")
private fun kniBridge111(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().debugDescription().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge112")
private external fun kniBridge112(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge113")
private fun kniBridge113(p0: NativePtr, p1: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().serializerWithReadingOptions(readingOptions = p1).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge114")
private external fun kniBridge114(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge115")
private fun kniBridge115(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge117")
private fun kniBridge117(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge119")
private fun kniBridge119(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge120")
private external fun kniBridge120(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge121")
private fun kniBridge121(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge122")
private external fun kniBridge122(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge123")
private fun kniBridge123(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().readingOptions()
}
@SymbolName("com_afnetworking_kniBridge124")
private external fun kniBridge124(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge125")
private fun kniBridge125(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().setReadingOptions(readingOptions = p1)
}
@SymbolName("com_afnetworking_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge127")
private fun kniBridge127(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().removesKeysWithNullValues().toByte()
}
@SymbolName("com_afnetworking_kniBridge128")
private external fun kniBridge128(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge129")
private fun kniBridge129(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().setRemovesKeysWithNullValues(removesKeysWithNullValues = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge130")
private external fun kniBridge130(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge131")
private fun kniBridge131(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge132")
private external fun kniBridge132(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge133")
private fun kniBridge133(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge134")
private external fun kniBridge134(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge135")
private fun kniBridge135(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge136")
private external fun kniBridge136(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge137")
private fun kniBridge137(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge138")
private external fun kniBridge138(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge139")
private fun kniBridge139(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge140")
private external fun kniBridge140(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge141")
private fun kniBridge141(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge142")
private external fun kniBridge142(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge143")
private fun kniBridge143(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge144")
private external fun kniBridge144(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge145")
private fun kniBridge145(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge146")
private external fun kniBridge146(p0: NativePtr, p1: NativePtr, p2: ULong, p3: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge147")
private fun kniBridge147(p0: NativePtr, p1: ULong, p2: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().serializerWithFormat(format = p1, readOptions = p2).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge148")
private external fun kniBridge148(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge149")
private fun kniBridge149(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge151")
private fun kniBridge151(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge153")
private fun kniBridge153(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge154")
private external fun kniBridge154(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge155")
private fun kniBridge155(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge157")
private fun kniBridge157(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().format()
}
@SymbolName("com_afnetworking_kniBridge158")
private external fun kniBridge158(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge159")
private fun kniBridge159(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().setFormat(format = p1)
}
@SymbolName("com_afnetworking_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge161")
private fun kniBridge161(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().readOptions()
}
@SymbolName("com_afnetworking_kniBridge162")
private external fun kniBridge162(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge163")
private fun kniBridge163(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().setReadOptions(readOptions = p1)
}
@SymbolName("com_afnetworking_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge165")
private fun kniBridge165(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge166")
private external fun kniBridge166(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge167")
private fun kniBridge167(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge168")
private external fun kniBridge168(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge169")
private fun kniBridge169(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge170")
private external fun kniBridge170(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge171")
private fun kniBridge171(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge172")
private external fun kniBridge172(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge173")
private fun kniBridge173(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge174")
private external fun kniBridge174(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge175")
private fun kniBridge175(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge176")
private external fun kniBridge176(p0: NativePtr, p1: NativePtr): Double
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge177")
private fun kniBridge177(p0: NativePtr): Double {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().imageScale()
}
@SymbolName("com_afnetworking_kniBridge178")
private external fun kniBridge178(p0: NativePtr, p1: NativePtr, p2: Double): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge179")
private fun kniBridge179(p0: NativePtr, p1: Double): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().setImageScale(imageScale = p1)
}
@SymbolName("com_afnetworking_kniBridge180")
private external fun kniBridge180(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge181")
private fun kniBridge181(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().automaticallyInflatesResponseImage().toByte()
}
@SymbolName("com_afnetworking_kniBridge182")
private external fun kniBridge182(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge183")
private fun kniBridge183(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().setAutomaticallyInflatesResponseImage(automaticallyInflatesResponseImage = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge184")
private external fun kniBridge184(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge185")
private fun kniBridge185(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge186")
private external fun kniBridge186(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge187")
private fun kniBridge187(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge188")
private external fun kniBridge188(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge189")
private fun kniBridge189(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().compoundSerializerWithResponseSerializers(responseSerializers = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge190")
private external fun kniBridge190(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge191")
private fun kniBridge191(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge192")
private external fun kniBridge192(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge193")
private fun kniBridge193(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge194")
private external fun kniBridge194(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge195")
private fun kniBridge195(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge196")
private external fun kniBridge196(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge197")
private fun kniBridge197(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge198")
private external fun kniBridge198(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge199")
private fun kniBridge199(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializer>().responseSerializers().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge200")
private external fun kniBridge200(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge201")
private fun kniBridge201(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge202")
private external fun kniBridge202(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge203")
private fun kniBridge203(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge204")
private external fun kniBridge204(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge205")
private fun kniBridge205(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewControllerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge206")
private external fun kniBridge206(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge207")
private fun kniBridge207(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewControllerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge208")
private external fun kniBridge208(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge209")
private fun kniBridge209(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewControllerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge210")
private external fun kniBridge210(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge211")
private fun kniBridge211(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().initForOpeningFilesWithContentTypes(allowedContentTypes = interpretObjCPointerOrNull<List<*>>(p1)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge213")
private fun kniBridge213(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURL?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURL>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge212")
private external fun kniBridge212(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Byte, p4: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge215")
private external fun kniBridge215(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge214")
private fun kniBridge214(p0: NativePtr, p1: NativePtr, p2: Byte, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().revealDocumentAtURL(url = interpretObjCPointerOrNull<NSURL>(p1)!!, importIfNeeded = p2.toBoolean(), completion = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURL?, p1: NSError?): Unit {
return kniBridge215(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge217")
private fun kniBridge217(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURL?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURL>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge216")
private external fun kniBridge216(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: ULong, p5: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge219")
private external fun kniBridge219(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge218")
private fun kniBridge218(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong, p4: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().importDocumentAtURL(documentURL = interpretObjCPointerOrNull<NSURL>(p1)!!, nextToDocumentAtURL = interpretObjCPointerOrNull<NSURL>(p2)!!, mode = UIDocumentBrowserImportMode.byValue(p3), completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURL?, p1: NSError?): Unit {
return kniBridge219(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge220")
private external fun kniBridge220(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge221")
private fun kniBridge221(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().transitionControllerForDocumentURL(documentURL = interpretObjCPointerOrNull<NSURL>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge222")
private external fun kniBridge222(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge223")
private fun kniBridge223(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().delegate().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge224")
private external fun kniBridge224(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge225")
private fun kniBridge225(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().setDelegate(delegate = interpretObjCPointerOrNull<UIDocumentBrowserViewControllerDelegateProtocol>(p1))
}
@SymbolName("com_afnetworking_kniBridge226")
private external fun kniBridge226(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge227")
private fun kniBridge227(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().allowsDocumentCreation().toByte()
}
@SymbolName("com_afnetworking_kniBridge228")
private external fun kniBridge228(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge229")
private fun kniBridge229(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().setAllowsDocumentCreation(allowsDocumentCreation = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge230")
private external fun kniBridge230(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge231")
private fun kniBridge231(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().allowsPickingMultipleItems().toByte()
}
@SymbolName("com_afnetworking_kniBridge232")
private external fun kniBridge232(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge233")
private fun kniBridge233(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().setAllowsPickingMultipleItems(allowsPickingMultipleItems = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge234")
private external fun kniBridge234(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge235")
private fun kniBridge235(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().allowedContentTypes().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge236")
private external fun kniBridge236(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge237")
private fun kniBridge237(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().additionalLeadingNavigationBarButtonItems().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge238")
private external fun kniBridge238(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge239")
private fun kniBridge239(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().setAdditionalLeadingNavigationBarButtonItems(additionalLeadingNavigationBarButtonItems = interpretObjCPointerOrNull<List<*>>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge240")
private external fun kniBridge240(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge241")
private fun kniBridge241(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().additionalTrailingNavigationBarButtonItems().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge242")
private external fun kniBridge242(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge243")
private fun kniBridge243(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().setAdditionalTrailingNavigationBarButtonItems(additionalTrailingNavigationBarButtonItems = interpretObjCPointerOrNull<List<*>>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge244")
private external fun kniBridge244(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge245")
private fun kniBridge245(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().customActions().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge246")
private external fun kniBridge246(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge247")
private fun kniBridge247(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().setCustomActions(customActions = interpretObjCPointerOrNull<List<*>>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge248")
private external fun kniBridge248(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge249")
private fun kniBridge249(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().browserUserInterfaceStyle()
}
@SymbolName("com_afnetworking_kniBridge250")
private external fun kniBridge250(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge251")
private fun kniBridge251(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().setBrowserUserInterfaceStyle(browserUserInterfaceStyle = p1)
}
@SymbolName("com_afnetworking_kniBridge252")
private external fun kniBridge252(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge253")
private fun kniBridge253(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().initWithNibName(nibNameOrNil = interpretObjCPointerOrNull<String>(p1), bundle = interpretObjCPointerOrNull<NSBundle>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge254")
private external fun kniBridge254(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge255")
private fun kniBridge255(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge256")
private external fun kniBridge256(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge257")
private fun kniBridge257(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge258")
private external fun kniBridge258(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge259")
private fun kniBridge259(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserViewController>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge260")
private external fun kniBridge260(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge261")
private fun kniBridge261(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionControllerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge262")
private external fun kniBridge262(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge263")
private fun kniBridge263(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionControllerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge264")
private external fun kniBridge264(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge265")
private fun kniBridge265(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionControllerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge266")
private external fun kniBridge266(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge267")
private fun kniBridge267(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().loadingProgress().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge268")
private external fun kniBridge268(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge269")
private fun kniBridge269(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().setLoadingProgress(loadingProgress = interpretObjCPointerOrNull<NSProgress>(p1))
}
@SymbolName("com_afnetworking_kniBridge270")
private external fun kniBridge270(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge271")
private fun kniBridge271(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().targetView().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge272")
private external fun kniBridge272(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge273")
private fun kniBridge273(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().setTargetView(targetView = interpretObjCPointerOrNull<UIView>(p1))
}
@SymbolName("com_afnetworking_kniBridge274")
private external fun kniBridge274(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge275")
private fun kniBridge275(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge276")
private external fun kniBridge276(p0: NativePtr, p1: NativePtr, p2: NativePtr): Double
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge277")
private fun kniBridge277(p0: NativePtr, p1: NativePtr): Double {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().transitionDuration(transitionContext = interpretObjCPointerOrNull<UIViewControllerContextTransitioningProtocol>(p1))
}
@SymbolName("com_afnetworking_kniBridge278")
private external fun kniBridge278(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge279")
private fun kniBridge279(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().animateTransition(transitionContext = interpretObjCPointerOrNull<UIViewControllerContextTransitioningProtocol>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge280")
private external fun kniBridge280(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge281")
private fun kniBridge281(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge282")
private external fun kniBridge282(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge283")
private fun kniBridge283(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().`class`().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge284")
private external fun kniBridge284(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge285")
private fun kniBridge285(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge286")
private external fun kniBridge286(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge287")
private fun kniBridge287(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge288")
private external fun kniBridge288(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge289")
private fun kniBridge289(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge290")
private external fun kniBridge290(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge291")
private fun kniBridge291(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().isProxy().toByte()
}
@SymbolName("com_afnetworking_kniBridge292")
private external fun kniBridge292(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge293")
private fun kniBridge293(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge294")
private external fun kniBridge294(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge295")
private fun kniBridge295(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge296")
private external fun kniBridge296(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge297")
private fun kniBridge297(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge298")
private external fun kniBridge298(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge299")
private fun kniBridge299(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge300")
private external fun kniBridge300(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge301")
private fun kniBridge301(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().hash()
}
@SymbolName("com_afnetworking_kniBridge302")
private external fun kniBridge302(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge303")
private fun kniBridge303(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().superclass().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge304")
private external fun kniBridge304(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge305")
private fun kniBridge305(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().description().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge306")
private external fun kniBridge306(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge307")
private fun kniBridge307(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserTransitionController>().debugDescription().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge308")
private external fun kniBridge308(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge309")
private fun kniBridge309(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserActionMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge310")
private external fun kniBridge310(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge311")
private fun kniBridge311(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserActionMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge312")
private external fun kniBridge312(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge313")
private fun kniBridge313(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserActionMeta>().alloc().objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge315")
private fun kniBridge315(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(List<*>?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<List<*>>(p0))
}
@SymbolName("com_afnetworking_kniBridge314")
private external fun kniBridge314(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Long, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge317")
private external fun kniBridge317(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge316")
private fun kniBridge316(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Long, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().initWithIdentifier(identifier = interpretObjCPointerOrNull<String>(p1)!!, localizedTitle = interpretObjCPointerOrNull<String>(p2)!!, availability = p3, handler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: List<*>?): Unit {
return kniBridge317(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge318")
private external fun kniBridge318(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge319")
private fun kniBridge319(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().identifier().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge320")
private external fun kniBridge320(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge321")
private fun kniBridge321(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().localizedTitle().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge322")
private external fun kniBridge322(p0: NativePtr, p1: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge323")
private fun kniBridge323(p0: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().availability()
}
@SymbolName("com_afnetworking_kniBridge324")
private external fun kniBridge324(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge325")
private fun kniBridge325(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().image().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge326")
private external fun kniBridge326(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge327")
private fun kniBridge327(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().setImage(image = interpretObjCPointerOrNull<UIImage>(p1))
}
@SymbolName("com_afnetworking_kniBridge328")
private external fun kniBridge328(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge329")
private fun kniBridge329(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().supportedContentTypes().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge330")
private external fun kniBridge330(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge331")
private fun kniBridge331(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().setSupportedContentTypes(supportedContentTypes = interpretObjCPointerOrNull<List<*>>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge332")
private external fun kniBridge332(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge333")
private fun kniBridge333(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().supportsMultipleItems().toByte()
}
@SymbolName("com_afnetworking_kniBridge334")
private external fun kniBridge334(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge335")
private fun kniBridge335(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().setSupportsMultipleItems(supportsMultipleItems = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge336")
private external fun kniBridge336(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge337")
private fun kniBridge337(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIDocumentBrowserAction>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge338")
private external fun kniBridge338(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge339")
private fun kniBridge339(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge340")
private external fun kniBridge340(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge341")
private fun kniBridge341(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge342")
private external fun kniBridge342(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge343")
private fun kniBridge343(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge344")
private external fun kniBridge344(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge345")
private fun kniBridge345(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge346")
private external fun kniBridge346(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge347")
private fun kniBridge347(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge348")
private external fun kniBridge348(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge349")
private fun kniBridge349(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setValue(value = interpretObjCPointerOrNull<String>(p1), forHTTPHeaderField = interpretObjCPointerOrNull<String>(p2)!!)
}
@SymbolName("com_afnetworking_kniBridge350")
private external fun kniBridge350(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge351")
private fun kniBridge351(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().valueForHTTPHeaderField(field = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge352")
private external fun kniBridge352(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge353")
private fun kniBridge353(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setAuthorizationHeaderFieldWithUsername(username = interpretObjCPointerOrNull<String>(p1)!!, password = interpretObjCPointerOrNull<String>(p2)!!)
}
@SymbolName("com_afnetworking_kniBridge354")
private external fun kniBridge354(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge355")
private fun kniBridge355(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().clearAuthorizationHeader()
}
@SymbolName("com_afnetworking_kniBridge356")
private external fun kniBridge356(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge357")
private fun kniBridge357(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setQueryStringSerializationWithStyle(style = p1)
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge359")
private fun kniBridge359(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLRequest?, Any?, CPointer<ObjCObjectVar<NSError?>>?) -> String?>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLRequest>(p0), interpretObjCPointerOrNull<Any>(p1), interpretCPointer<ObjCObjectVar<NSError?>>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge358")
private external fun kniBridge358(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge361")
private external fun kniBridge361(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge360")
private fun kniBridge360(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setQueryStringSerializationWithBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLRequest?, p1: Any?, p2: CPointer<ObjCObjectVar<NSError?>>?): String? {
return interpretObjCPointerOrNull<String>(kniBridge361(p0.objcPtr(), p1.objcPtr(), p2.rawValue, interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@SymbolName("com_afnetworking_kniBridge362")
private external fun kniBridge362(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge363")
private fun kniBridge363(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().requestWithMethod(method = interpretObjCPointerOrNull<String>(p1)!!, URLString = interpretObjCPointerOrNull<String>(p2)!!, parameters = interpretObjCPointerOrNull<Any>(p3), error = interpretCPointer<ObjCObjectVar<NSError?>>(p4)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge365")
private fun kniBridge365(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(AFMultipartFormDataProtocol?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<AFMultipartFormDataProtocol>(p0))
}
@SymbolName("com_afnetworking_kniBridge364")
private external fun kniBridge364(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge367")
private external fun kniBridge367(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge366")
private fun kniBridge366(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().multipartFormRequestWithMethod(method = interpretObjCPointerOrNull<String>(p1)!!, URLString = interpretObjCPointerOrNull<String>(p2)!!, parameters = interpretObjCPointerOrNull<Map<Any?, *>>(p3), constructingBodyWithBlock = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: AFMultipartFormDataProtocol?): Unit {
return kniBridge367(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, error = interpretCPointer<ObjCObjectVar<NSError?>>(p5)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge369")
private fun kniBridge369(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_afnetworking_kniBridge368")
private external fun kniBridge368(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge371")
private external fun kniBridge371(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge370")
private fun kniBridge370(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().requestWithMultipartFormRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, writingStreamContentsToFile = interpretObjCPointerOrNull<NSURL>(p2)!!, completionHandler = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge371(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge372")
private external fun kniBridge372(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge373")
private fun kniBridge373(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().stringEncoding()
}
@SymbolName("com_afnetworking_kniBridge374")
private external fun kniBridge374(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge375")
private fun kniBridge375(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setStringEncoding(stringEncoding = p1)
}
@SymbolName("com_afnetworking_kniBridge376")
private external fun kniBridge376(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge377")
private fun kniBridge377(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().allowsCellularAccess().toByte()
}
@SymbolName("com_afnetworking_kniBridge378")
private external fun kniBridge378(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge379")
private fun kniBridge379(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setAllowsCellularAccess(allowsCellularAccess = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge380")
private external fun kniBridge380(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge381")
private fun kniBridge381(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().cachePolicy()
}
@SymbolName("com_afnetworking_kniBridge382")
private external fun kniBridge382(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge383")
private fun kniBridge383(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setCachePolicy(cachePolicy = p1)
}
@SymbolName("com_afnetworking_kniBridge384")
private external fun kniBridge384(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge385")
private fun kniBridge385(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().HTTPShouldHandleCookies().toByte()
}
@SymbolName("com_afnetworking_kniBridge386")
private external fun kniBridge386(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge387")
private fun kniBridge387(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setHTTPShouldHandleCookies(HTTPShouldHandleCookies = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge388")
private external fun kniBridge388(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge389")
private fun kniBridge389(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().HTTPShouldUsePipelining().toByte()
}
@SymbolName("com_afnetworking_kniBridge390")
private external fun kniBridge390(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge391")
private fun kniBridge391(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setHTTPShouldUsePipelining(HTTPShouldUsePipelining = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge392")
private external fun kniBridge392(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge393")
private fun kniBridge393(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().networkServiceType()
}
@SymbolName("com_afnetworking_kniBridge394")
private external fun kniBridge394(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge395")
private fun kniBridge395(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setNetworkServiceType(networkServiceType = p1)
}
@SymbolName("com_afnetworking_kniBridge396")
private external fun kniBridge396(p0: NativePtr, p1: NativePtr): Double
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge397")
private fun kniBridge397(p0: NativePtr): Double {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().timeoutInterval()
}
@SymbolName("com_afnetworking_kniBridge398")
private external fun kniBridge398(p0: NativePtr, p1: NativePtr, p2: Double): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge399")
private fun kniBridge399(p0: NativePtr, p1: Double): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setTimeoutInterval(timeoutInterval = p1)
}
@SymbolName("com_afnetworking_kniBridge400")
private external fun kniBridge400(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge401")
private fun kniBridge401(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().HTTPRequestHeaders().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge402")
private external fun kniBridge402(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge403")
private fun kniBridge403(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().HTTPMethodsEncodingParametersInURI().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge404")
private external fun kniBridge404(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge405")
private fun kniBridge405(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setHTTPMethodsEncodingParametersInURI(HTTPMethodsEncodingParametersInURI = interpretObjCPointerOrNull<Set<*>>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge406")
private external fun kniBridge406(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge407")
private fun kniBridge407(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge408")
private external fun kniBridge408(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge409")
private fun kniBridge409(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge410")
private external fun kniBridge410(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge411")
private fun kniBridge411(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().requestBySerializingRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, withParameters = interpretObjCPointerOrNull<Any>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge412")
private external fun kniBridge412(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge413")
private fun kniBridge413(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge414")
private external fun kniBridge414(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge415")
private fun kniBridge415(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().`class`().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge416")
private external fun kniBridge416(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge417")
private fun kniBridge417(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge418")
private external fun kniBridge418(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge419")
private fun kniBridge419(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge420")
private external fun kniBridge420(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge421")
private fun kniBridge421(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge422")
private external fun kniBridge422(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge423")
private fun kniBridge423(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().isProxy().toByte()
}
@SymbolName("com_afnetworking_kniBridge424")
private external fun kniBridge424(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge425")
private fun kniBridge425(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge426")
private external fun kniBridge426(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge427")
private fun kniBridge427(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge428")
private external fun kniBridge428(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge429")
private fun kniBridge429(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge430")
private external fun kniBridge430(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge431")
private fun kniBridge431(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge432")
private external fun kniBridge432(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge433")
private fun kniBridge433(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().hash()
}
@SymbolName("com_afnetworking_kniBridge434")
private external fun kniBridge434(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge435")
private fun kniBridge435(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().superclass().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge436")
private external fun kniBridge436(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge437")
private fun kniBridge437(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().description().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge438")
private external fun kniBridge438(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge439")
private fun kniBridge439(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge440")
private external fun kniBridge440(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge441")
private fun kniBridge441(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge442")
private external fun kniBridge442(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge443")
private fun kniBridge443(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().debugDescription().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge444")
private external fun kniBridge444(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge445")
private fun kniBridge445(p0: NativePtr, p1: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().serializerWithWritingOptions(writingOptions = p1).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge446")
private external fun kniBridge446(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge447")
private fun kniBridge447(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge448")
private external fun kniBridge448(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge449")
private fun kniBridge449(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge450")
private external fun kniBridge450(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge451")
private fun kniBridge451(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge452")
private external fun kniBridge452(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge453")
private fun kniBridge453(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge454")
private external fun kniBridge454(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge455")
private fun kniBridge455(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializer>().writingOptions()
}
@SymbolName("com_afnetworking_kniBridge456")
private external fun kniBridge456(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge457")
private fun kniBridge457(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializer>().setWritingOptions(writingOptions = p1)
}
@SymbolName("com_afnetworking_kniBridge458")
private external fun kniBridge458(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge459")
private fun kniBridge459(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge460")
private external fun kniBridge460(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge461")
private fun kniBridge461(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge462")
private external fun kniBridge462(p0: NativePtr, p1: NativePtr, p2: ULong, p3: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge463")
private fun kniBridge463(p0: NativePtr, p1: ULong, p2: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().serializerWithFormat(format = p1, writeOptions = p2).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge464")
private external fun kniBridge464(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge465")
private fun kniBridge465(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge466")
private external fun kniBridge466(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge467")
private fun kniBridge467(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge468")
private external fun kniBridge468(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge469")
private fun kniBridge469(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge470")
private external fun kniBridge470(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge471")
private fun kniBridge471(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge472")
private external fun kniBridge472(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge473")
private fun kniBridge473(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().format()
}
@SymbolName("com_afnetworking_kniBridge474")
private external fun kniBridge474(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge475")
private fun kniBridge475(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().setFormat(format = p1)
}
@SymbolName("com_afnetworking_kniBridge476")
private external fun kniBridge476(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge477")
private fun kniBridge477(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().writeOptions()
}
@SymbolName("com_afnetworking_kniBridge478")
private external fun kniBridge478(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge479")
private fun kniBridge479(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().setWriteOptions(writeOptions = p1)
}
@SymbolName("com_afnetworking_kniBridge480")
private external fun kniBridge480(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge481")
private fun kniBridge481(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge482")
private external fun kniBridge482(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge483")
private fun kniBridge483(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge484")
private external fun kniBridge484(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge485")
private fun kniBridge485(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().certificatesInBundle(bundle = interpretObjCPointerOrNull<NSBundle>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge486")
private external fun kniBridge486(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge487")
private fun kniBridge487(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().defaultPolicy().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge488")
private external fun kniBridge488(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge489")
private fun kniBridge489(p0: NativePtr, p1: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().policyWithPinningMode(pinningMode = AFSSLPinningMode.byValue(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge490")
private external fun kniBridge490(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge491")
private fun kniBridge491(p0: NativePtr, p1: ULong, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().policyWithPinningMode(pinningMode = AFSSLPinningMode.byValue(p1), withPinnedCertificates = interpretObjCPointerOrNull<Set<*>>(p2)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge492")
private external fun kniBridge492(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge493")
private fun kniBridge493(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge494")
private external fun kniBridge494(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge495")
private fun kniBridge495(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge496")
private external fun kniBridge496(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge497")
private fun kniBridge497(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge498")
private external fun kniBridge498(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge499")
private fun kniBridge499(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge500")
private external fun kniBridge500(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge501")
private fun kniBridge501(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().evaluateServerTrust(serverTrust = interpretCPointer<__SecTrust>(p1), forDomain = interpretObjCPointerOrNull<String>(p2)).toByte()
}
@SymbolName("com_afnetworking_kniBridge502")
private external fun kniBridge502(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge503")
private fun kniBridge503(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().SSLPinningMode().value
}
@SymbolName("com_afnetworking_kniBridge504")
private external fun kniBridge504(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge505")
private fun kniBridge505(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().pinnedCertificates().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge506")
private external fun kniBridge506(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge507")
private fun kniBridge507(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().setPinnedCertificates(pinnedCertificates = interpretObjCPointerOrNull<Set<*>>(p1))
}
@SymbolName("com_afnetworking_kniBridge508")
private external fun kniBridge508(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge509")
private fun kniBridge509(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().allowInvalidCertificates().toByte()
}
@SymbolName("com_afnetworking_kniBridge510")
private external fun kniBridge510(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge511")
private fun kniBridge511(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().setAllowInvalidCertificates(allowInvalidCertificates = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge512")
private external fun kniBridge512(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge513")
private fun kniBridge513(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().validatesDomainName().toByte()
}
@SymbolName("com_afnetworking_kniBridge514")
private external fun kniBridge514(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge515")
private fun kniBridge515(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().setValidatesDomainName(validatesDomainName = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge516")
private external fun kniBridge516(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge517")
private fun kniBridge517(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge518")
private external fun kniBridge518(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge519")
private fun kniBridge519(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge520")
private external fun kniBridge520(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge521")
private fun kniBridge521(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge522")
private external fun kniBridge522(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge523")
private fun kniBridge523(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge524")
private external fun kniBridge524(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge525")
private fun kniBridge525(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().sharedManager().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge526")
private external fun kniBridge526(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge527")
private fun kniBridge527(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().manager().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge528")
private external fun kniBridge528(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge529")
private fun kniBridge529(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().managerForDomain(domain = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge530")
private external fun kniBridge530(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge531")
private fun kniBridge531(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().managerForAddress(address = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge532")
private external fun kniBridge532(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge533")
private fun kniBridge533(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge534")
private external fun kniBridge534(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge535")
private fun kniBridge535(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge536")
private external fun kniBridge536(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge537")
private fun kniBridge537(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge538")
private external fun kniBridge538(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge539")
private fun kniBridge539(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().initWithReachability(reachability = interpretCPointer<__SCNetworkReachability>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge540")
private external fun kniBridge540(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge541")
private fun kniBridge541(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().startMonitoring()
}
@SymbolName("com_afnetworking_kniBridge542")
private external fun kniBridge542(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge543")
private fun kniBridge543(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().stopMonitoring()
}
@SymbolName("com_afnetworking_kniBridge544")
private external fun kniBridge544(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge545")
private fun kniBridge545(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().localizedNetworkReachabilityStatusString().objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge547")
private fun kniBridge547(p0: Long, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(AFNetworkReachabilityStatus) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(p0)
}
@SymbolName("com_afnetworking_kniBridge546")
private external fun kniBridge546(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge549")
private external fun kniBridge549(p0: Long, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge548")
private fun kniBridge548(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().setReachabilityStatusChangeBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: AFNetworkReachabilityStatus): Unit {
return kniBridge549(p0, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge550")
private external fun kniBridge550(p0: NativePtr, p1: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge551")
private fun kniBridge551(p0: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().networkReachabilityStatus()
}
@SymbolName("com_afnetworking_kniBridge552")
private external fun kniBridge552(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge553")
private fun kniBridge553(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().isReachable().toByte()
}
@SymbolName("com_afnetworking_kniBridge554")
private external fun kniBridge554(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge555")
private fun kniBridge555(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().isReachableViaWWAN().toByte()
}
@SymbolName("com_afnetworking_kniBridge556")
private external fun kniBridge556(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge557")
private fun kniBridge557(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().isReachableViaWiFi().toByte()
}
@SymbolName("com_afnetworking_kniBridge558")
private external fun kniBridge558(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge559")
private fun kniBridge559(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge560")
private external fun kniBridge560(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge561")
private fun kniBridge561(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManagerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge562")
private external fun kniBridge562(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge563")
private fun kniBridge563(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManagerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge564")
private external fun kniBridge564(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge565")
private fun kniBridge565(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManagerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge566")
private external fun kniBridge566(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge567")
private fun kniBridge567(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManagerMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge568")
private external fun kniBridge568(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge569")
private fun kniBridge569(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().initWithSessionConfiguration(configuration = interpretObjCPointerOrNull<NSURLSessionConfiguration>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge570")
private external fun kniBridge570(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge571")
private fun kniBridge571(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().invalidateSessionCancelingTasks(cancelPendingTasks = p1.toBoolean())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge573")
private fun kniBridge573(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge572")
private external fun kniBridge572(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge575")
private external fun kniBridge575(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge574")
private fun kniBridge574(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().dataTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, completionHandler = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge575(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge577")
private fun kniBridge577(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge578")
private fun kniBridge578(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge579")
private fun kniBridge579(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge576")
private external fun kniBridge576(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge581")
private external fun kniBridge581(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge582")
private external fun kniBridge582(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge583")
private external fun kniBridge583(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge580")
private fun kniBridge580(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().dataTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, uploadProgress = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge581(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, downloadProgress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge582(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge583(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge585")
private fun kniBridge585(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge586")
private fun kniBridge586(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge584")
private external fun kniBridge584(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge588")
private external fun kniBridge588(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge589")
private external fun kniBridge589(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge587")
private fun kniBridge587(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, fromFile = interpretObjCPointerOrNull<NSURL>(p2)!!, progress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge588(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge589(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge591")
private fun kniBridge591(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge592")
private fun kniBridge592(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge590")
private external fun kniBridge590(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge594")
private external fun kniBridge594(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge595")
private external fun kniBridge595(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge593")
private fun kniBridge593(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, fromData = interpretObjCPointerOrNull<NSData>(p2), progress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge594(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge595(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge597")
private fun kniBridge597(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge598")
private fun kniBridge598(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge596")
private external fun kniBridge596(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge600")
private external fun kniBridge600(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge601")
private external fun kniBridge601(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge599")
private fun kniBridge599(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadTaskWithStreamedRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, progress = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge600(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, completionHandler = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge601(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge603")
private fun kniBridge603(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge604")
private fun kniBridge604(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURL?, NSURLResponse?) -> NSURL?>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURL>(p0), interpretObjCPointerOrNull<NSURLResponse>(p1)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge605")
private fun kniBridge605(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, NSURL?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<NSURL>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge602")
private external fun kniBridge602(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge607")
private external fun kniBridge607(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge608")
private external fun kniBridge608(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge609")
private external fun kniBridge609(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge606")
private fun kniBridge606(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().downloadTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, progress = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge607(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, destination = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURL?, p1: NSURLResponse?): NSURL? {
return interpretObjCPointerOrNull<NSURL>(kniBridge608(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: NSURL?, p2: NSError?): Unit {
return kniBridge609(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge611")
private fun kniBridge611(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge612")
private fun kniBridge612(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURL?, NSURLResponse?) -> NSURL?>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURL>(p0), interpretObjCPointerOrNull<NSURLResponse>(p1)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge613")
private fun kniBridge613(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, NSURL?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<NSURL>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge610")
private external fun kniBridge610(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge615")
private external fun kniBridge615(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge616")
private external fun kniBridge616(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge617")
private external fun kniBridge617(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge614")
private fun kniBridge614(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().downloadTaskWithResumeData(resumeData = interpretObjCPointerOrNull<NSData>(p1)!!, progress = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge615(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, destination = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURL?, p1: NSURLResponse?): NSURL? {
return interpretObjCPointerOrNull<NSURL>(kniBridge616(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: NSURL?, p2: NSError?): Unit {
return kniBridge617(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge618")
private external fun kniBridge618(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge619")
private fun kniBridge619(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadProgressForTask(task = interpretObjCPointerOrNull<NSURLSessionTask>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge620")
private external fun kniBridge620(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge621")
private fun kniBridge621(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().downloadProgressForTask(task = interpretObjCPointerOrNull<NSURLSessionTask>(p1)!!).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge623")
private fun kniBridge623(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge622")
private external fun kniBridge622(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge625")
private external fun kniBridge625(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge624")
private fun kniBridge624(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setSessionDidBecomeInvalidBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSError?): Unit {
return kniBridge625(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge627")
private fun kniBridge627(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Long {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLAuthenticationChallenge>(p1), interpretCPointer<ObjCObjectVar<NSURLCredential?>>(p2))
}
@SymbolName("com_afnetworking_kniBridge626")
private external fun kniBridge626(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge629")
private external fun kniBridge629(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge628")
private fun kniBridge628(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setSessionDidReceiveAuthenticationChallengeBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLAuthenticationChallenge?, p2: CPointer<ObjCObjectVar<NSURLCredential?>>?): NSURLSessionAuthChallengeDisposition {
return kniBridge629(p0.objcPtr(), p1.objcPtr(), p2.rawValue, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge631")
private fun kniBridge631(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?) -> NSInputStream?>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge630")
private external fun kniBridge630(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge633")
private external fun kniBridge633(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge632")
private fun kniBridge632(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskNeedNewBodyStreamBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?): NSInputStream? {
return interpretObjCPointerOrNull<NSInputStream>(kniBridge633(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge635")
private fun kniBridge635(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?, NSURLResponse?, NSURLRequest?) -> NSURLRequest?>(interpretObjCPointerOrNull<Any>(p4))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1), interpretObjCPointerOrNull<NSURLResponse>(p2), interpretObjCPointerOrNull<NSURLRequest>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge634")
private external fun kniBridge634(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge637")
private external fun kniBridge637(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge636")
private fun kniBridge636(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskWillPerformHTTPRedirectionBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?, p2: NSURLResponse?, p3: NSURLRequest?): NSURLRequest? {
return interpretObjCPointerOrNull<NSURLRequest>(kniBridge637(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), p3.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge639")
private fun kniBridge639(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Long {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition>(interpretObjCPointerOrNull<Any>(p4))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1), interpretObjCPointerOrNull<NSURLAuthenticationChallenge>(p2), interpretCPointer<ObjCObjectVar<NSURLCredential?>>(p3))
}
@SymbolName("com_afnetworking_kniBridge638")
private external fun kniBridge638(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge641")
private external fun kniBridge641(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge640")
private fun kniBridge640(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskDidReceiveAuthenticationChallengeBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?, p2: NSURLAuthenticationChallenge?, p3: CPointer<ObjCObjectVar<NSURLCredential?>>?): NSURLSessionAuthChallengeDisposition {
return kniBridge641(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), p3.rawValue, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge643")
private fun kniBridge643(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: Long, p5: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?, int64_t, int64_t, int64_t) -> Unit>(interpretObjCPointerOrNull<Any>(p5))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1), p2, p3, p4)
}
@SymbolName("com_afnetworking_kniBridge642")
private external fun kniBridge642(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge645")
private external fun kniBridge645(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: Long, p5: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge644")
private fun kniBridge644(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskDidSendBodyDataBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?, p2: int64_t, p3: int64_t, p4: int64_t): Unit {
return kniBridge645(p0.objcPtr(), p1.objcPtr(), p2, p3, p4, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge647")
private fun kniBridge647(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge646")
private external fun kniBridge646(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge649")
private external fun kniBridge649(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge648")
private fun kniBridge648(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskDidCompleteBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?, p2: NSError?): Unit {
return kniBridge649(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge651")
private fun kniBridge651(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Long {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDataTask?, NSURLResponse?) -> NSURLSessionResponseDisposition>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDataTask>(p1), interpretObjCPointerOrNull<NSURLResponse>(p2))
}
@SymbolName("com_afnetworking_kniBridge650")
private external fun kniBridge650(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge653")
private external fun kniBridge653(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge652")
private fun kniBridge652(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDataTaskDidReceiveResponseBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDataTask?, p2: NSURLResponse?): NSURLSessionResponseDisposition {
return kniBridge653(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge655")
private fun kniBridge655(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDataTask?, NSURLSessionDownloadTask?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDataTask>(p1), interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p2))
}
@SymbolName("com_afnetworking_kniBridge654")
private external fun kniBridge654(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge657")
private external fun kniBridge657(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge656")
private fun kniBridge656(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDataTaskDidBecomeDownloadTaskBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDataTask?, p2: NSURLSessionDownloadTask?): Unit {
return kniBridge657(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge659")
private fun kniBridge659(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDataTask?, NSData?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDataTask>(p1), interpretObjCPointerOrNull<NSData>(p2))
}
@SymbolName("com_afnetworking_kniBridge658")
private external fun kniBridge658(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge661")
private external fun kniBridge661(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge660")
private fun kniBridge660(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDataTaskDidReceiveDataBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDataTask?, p2: NSData?): Unit {
return kniBridge661(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge663")
private fun kniBridge663(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDataTask?, NSCachedURLResponse?) -> NSCachedURLResponse?>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDataTask>(p1), interpretObjCPointerOrNull<NSCachedURLResponse>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge662")
private external fun kniBridge662(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge665")
private external fun kniBridge665(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge664")
private fun kniBridge664(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDataTaskWillCacheResponseBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDataTask?, p2: NSCachedURLResponse?): NSCachedURLResponse? {
return interpretObjCPointerOrNull<NSCachedURLResponse>(kniBridge665(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge667")
private fun kniBridge667(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSURLSession>(p0))
}
@SymbolName("com_afnetworking_kniBridge666")
private external fun kniBridge666(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge669")
private external fun kniBridge669(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge668")
private fun kniBridge668(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDidFinishEventsForBackgroundURLSessionBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?): Unit {
return kniBridge669(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge671")
private fun kniBridge671(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDownloadTask?, NSURL?) -> NSURL?>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p1), interpretObjCPointerOrNull<NSURL>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge670")
private external fun kniBridge670(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge673")
private external fun kniBridge673(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge672")
private fun kniBridge672(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDownloadTaskDidFinishDownloadingBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDownloadTask?, p2: NSURL?): NSURL? {
return interpretObjCPointerOrNull<NSURL>(kniBridge673(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge675")
private fun kniBridge675(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: Long, p5: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t, int64_t) -> Unit>(interpretObjCPointerOrNull<Any>(p5))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p1), p2, p3, p4)
}
@SymbolName("com_afnetworking_kniBridge674")
private external fun kniBridge674(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge677")
private external fun kniBridge677(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: Long, p5: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge676")
private fun kniBridge676(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDownloadTaskDidWriteDataBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDownloadTask?, p2: int64_t, p3: int64_t, p4: int64_t): Unit {
return kniBridge677(p0.objcPtr(), p1.objcPtr(), p2, p3, p4, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge679")
private fun kniBridge679(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t) -> Unit>(interpretObjCPointerOrNull<Any>(p4))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p1), p2, p3)
}
@SymbolName("com_afnetworking_kniBridge678")
private external fun kniBridge678(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge681")
private external fun kniBridge681(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge680")
private fun kniBridge680(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDownloadTaskDidResumeBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDownloadTask?, p2: int64_t, p3: int64_t): Unit {
return kniBridge681(p0.objcPtr(), p1.objcPtr(), p2, p3, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge682")
private external fun kniBridge682(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge683")
private fun kniBridge683(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().session().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge684")
private external fun kniBridge684(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge685")
private fun kniBridge685(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().operationQueue().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge686")
private external fun kniBridge686(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge687")
private fun kniBridge687(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().responseSerializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge688")
private external fun kniBridge688(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge689")
private fun kniBridge689(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setResponseSerializer(responseSerializer = interpretObjCPointerOrNull<AFURLResponseSerializationProtocol>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge690")
private external fun kniBridge690(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge691")
private fun kniBridge691(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().securityPolicy().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge692")
private external fun kniBridge692(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge693")
private fun kniBridge693(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setSecurityPolicy(securityPolicy = interpretObjCPointerOrNull<AFSecurityPolicy>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge694")
private external fun kniBridge694(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge695")
private fun kniBridge695(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().reachabilityManager().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge696")
private external fun kniBridge696(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge697")
private fun kniBridge697(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setReachabilityManager(reachabilityManager = interpretObjCPointerOrNull<AFNetworkReachabilityManager>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge698")
private external fun kniBridge698(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge699")
private fun kniBridge699(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().tasks().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge700")
private external fun kniBridge700(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge701")
private fun kniBridge701(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().dataTasks().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge702")
private external fun kniBridge702(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge703")
private fun kniBridge703(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadTasks().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge704")
private external fun kniBridge704(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge705")
private fun kniBridge705(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().downloadTasks().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge706")
private external fun kniBridge706(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge707")
private fun kniBridge707(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().completionQueue().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge708")
private external fun kniBridge708(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge709")
private fun kniBridge709(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setCompletionQueue(completionQueue = interpretObjCPointerOrNull<NSObject>(p1))
}
@SymbolName("com_afnetworking_kniBridge710")
private external fun kniBridge710(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge711")
private fun kniBridge711(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().completionGroup().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge712")
private external fun kniBridge712(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge713")
private fun kniBridge713(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setCompletionGroup(completionGroup = interpretObjCPointerOrNull<NSObject>(p1))
}
@SymbolName("com_afnetworking_kniBridge714")
private external fun kniBridge714(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge715")
private fun kniBridge715(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().attemptsToRecreateUploadTasksForBackgroundSessions().toByte()
}
@SymbolName("com_afnetworking_kniBridge716")
private external fun kniBridge716(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge717")
private fun kniBridge717(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setAttemptsToRecreateUploadTasksForBackgroundSessions(attemptsToRecreateUploadTasksForBackgroundSessions = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge718")
private external fun kniBridge718(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge719")
private fun kniBridge719(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge720")
private external fun kniBridge720(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge721")
private fun kniBridge721(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge722")
private external fun kniBridge722(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge723")
private fun kniBridge723(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge724")
private external fun kniBridge724(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge725")
private fun kniBridge725(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().`class`().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge726")
private external fun kniBridge726(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge727")
private fun kniBridge727(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge728")
private external fun kniBridge728(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge729")
private fun kniBridge729(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge730")
private external fun kniBridge730(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge731")
private fun kniBridge731(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge732")
private external fun kniBridge732(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge733")
private fun kniBridge733(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().isProxy().toByte()
}
@SymbolName("com_afnetworking_kniBridge734")
private external fun kniBridge734(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge735")
private fun kniBridge735(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge736")
private external fun kniBridge736(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge737")
private fun kniBridge737(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge738")
private external fun kniBridge738(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge739")
private fun kniBridge739(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge740")
private external fun kniBridge740(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge741")
private fun kniBridge741(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge742")
private external fun kniBridge742(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge743")
private fun kniBridge743(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().hash()
}
@SymbolName("com_afnetworking_kniBridge744")
private external fun kniBridge744(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge745")
private fun kniBridge745(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().superclass().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge746")
private external fun kniBridge746(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge747")
private fun kniBridge747(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().description().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge748")
private external fun kniBridge748(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge749")
private fun kniBridge749(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, downloadTask = interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p2)!!, didFinishDownloadingToURL = interpretObjCPointerOrNull<NSURL>(p3)!!)
}
@SymbolName("com_afnetworking_kniBridge750")
private external fun kniBridge750(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge751")
private fun kniBridge751(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge752")
private external fun kniBridge752(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge753")
private fun kniBridge753(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge754")
private external fun kniBridge754(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge755")
private fun kniBridge755(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().debugDescription().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge756")
private external fun kniBridge756(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge757")
private fun kniBridge757(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, didBecomeInvalidWithError = interpretObjCPointerOrNull<NSError>(p2))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge759")
private fun kniBridge759(p0: Long, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(p0, interpretObjCPointerOrNull<NSURLCredential>(p1))
}
@SymbolName("com_afnetworking_kniBridge758")
private external fun kniBridge758(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge761")
private external fun kniBridge761(p0: Long, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge760")
private fun kniBridge760(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, didReceiveChallenge = interpretObjCPointerOrNull<NSURLAuthenticationChallenge>(p2)!!, completionHandler = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURLSessionAuthChallengeDisposition, p1: NSURLCredential?): Unit {
return kniBridge761(p0, p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge762")
private external fun kniBridge762(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge763")
private fun kniBridge763(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSessionDidFinishEventsForBackgroundURLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!)
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge765")
private fun kniBridge765(p0: Long, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDelayedRequestDisposition, NSURLRequest?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(p0, interpretObjCPointerOrNull<NSURLRequest>(p1))
}
@SymbolName("com_afnetworking_kniBridge764")
private external fun kniBridge764(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge767")
private external fun kniBridge767(p0: Long, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge766")
private fun kniBridge766(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, willBeginDelayedRequest = interpretObjCPointerOrNull<NSURLRequest>(p3)!!, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURLSessionDelayedRequestDisposition, p1: NSURLRequest?): Unit {
return kniBridge767(p0, p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge768")
private external fun kniBridge768(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge769")
private fun kniBridge769(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, taskIsWaitingForConnectivity = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!)
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge771")
private fun kniBridge771(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLRequest?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSURLRequest>(p0))
}
@SymbolName("com_afnetworking_kniBridge770")
private external fun kniBridge770(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge773")
private external fun kniBridge773(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge772")
private fun kniBridge772(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, willPerformHTTPRedirection = interpretObjCPointerOrNull<NSHTTPURLResponse>(p3)!!, newRequest = interpretObjCPointerOrNull<NSURLRequest>(p4)!!, completionHandler = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURLRequest?): Unit {
return kniBridge773(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge775")
private fun kniBridge775(p0: Long, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(p0, interpretObjCPointerOrNull<NSURLCredential>(p1))
}
@SymbolName("com_afnetworking_kniBridge774")
private external fun kniBridge774(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge777")
private external fun kniBridge777(p0: Long, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge776")
private fun kniBridge776(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, didReceiveChallenge = interpretObjCPointerOrNull<NSURLAuthenticationChallenge>(p3)!!, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURLSessionAuthChallengeDisposition, p1: NSURLCredential?): Unit {
return kniBridge777(p0, p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge779")
private fun kniBridge779(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSInputStream?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSInputStream>(p0))
}
@SymbolName("com_afnetworking_kniBridge778")
private external fun kniBridge778(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge781")
private external fun kniBridge781(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge780")
private fun kniBridge780(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, needNewBodyStream = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSInputStream?): Unit {
return kniBridge781(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge782")
private external fun kniBridge782(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Long, p5: Long, p6: Long): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge783")
private fun kniBridge783(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Long, p4: Long, p5: Long): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, didSendBodyData = p3, totalBytesSent = p4, totalBytesExpectedToSend = p5)
}
@SymbolName("com_afnetworking_kniBridge784")
private external fun kniBridge784(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge785")
private fun kniBridge785(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, didFinishCollectingMetrics = interpretObjCPointerOrNull<NSURLSessionTaskMetrics>(p3)!!)
}
@SymbolName("com_afnetworking_kniBridge786")
private external fun kniBridge786(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge787")
private fun kniBridge787(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, didCompleteWithError = interpretObjCPointerOrNull<NSError>(p3))
}
@SymbolName("com_afnetworking_kniBridge788")
private external fun kniBridge788(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge789")
private fun kniBridge789(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().manager().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge790")
private external fun kniBridge790(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge791")
private fun kniBridge791(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge792")
private external fun kniBridge792(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge793")
private fun kniBridge793(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge794")
private external fun kniBridge794(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge795")
private fun kniBridge795(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge796")
private external fun kniBridge796(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge797")
private fun kniBridge797(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge798")
private external fun kniBridge798(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge799")
private fun kniBridge799(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().initWithBaseURL(url = interpretObjCPointerOrNull<NSURL>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge800")
private external fun kniBridge800(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge801")
private fun kniBridge801(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().initWithBaseURL(url = interpretObjCPointerOrNull<NSURL>(p1), sessionConfiguration = interpretObjCPointerOrNull<NSURLSessionConfiguration>(p2)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge803")
private fun kniBridge803(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge804")
private fun kniBridge804(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge802")
private external fun kniBridge802(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge806")
private external fun kniBridge806(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge807")
private external fun kniBridge807(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge805")
private fun kniBridge805(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().GET(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge806(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge807(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge809")
private fun kniBridge809(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge810")
private fun kniBridge810(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge811")
private fun kniBridge811(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge808")
private external fun kniBridge808(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge813")
private external fun kniBridge813(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge814")
private external fun kniBridge814(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge815")
private external fun kniBridge815(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge812")
private fun kniBridge812(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().GET(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), progress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge813(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, success = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge814(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge815(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge817")
private fun kniBridge817(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge818")
private fun kniBridge818(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge816")
private external fun kniBridge816(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge820")
private external fun kniBridge820(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge821")
private external fun kniBridge821(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge819")
private fun kniBridge819(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().HEAD(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?): Unit {
return kniBridge820(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge821(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge823")
private fun kniBridge823(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge824")
private fun kniBridge824(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge822")
private external fun kniBridge822(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge826")
private external fun kniBridge826(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge827")
private external fun kniBridge827(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge825")
private fun kniBridge825(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().POST(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge826(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge827(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge829")
private fun kniBridge829(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge830")
private fun kniBridge830(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge831")
private fun kniBridge831(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge828")
private external fun kniBridge828(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge833")
private external fun kniBridge833(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge834")
private external fun kniBridge834(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge835")
private external fun kniBridge835(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge832")
private fun kniBridge832(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().POST(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), progress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge833(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, success = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge834(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge835(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge837")
private fun kniBridge837(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(AFMultipartFormDataProtocol?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<AFMultipartFormDataProtocol>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge838")
private fun kniBridge838(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge839")
private fun kniBridge839(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge836")
private external fun kniBridge836(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge841")
private external fun kniBridge841(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge842")
private external fun kniBridge842(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge843")
private external fun kniBridge843(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge840")
private fun kniBridge840(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().POST(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), constructingBodyWithBlock = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: AFMultipartFormDataProtocol?): Unit {
return kniBridge841(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, success = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge842(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge843(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge845")
private fun kniBridge845(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(AFMultipartFormDataProtocol?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<AFMultipartFormDataProtocol>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge846")
private fun kniBridge846(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge847")
private fun kniBridge847(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge848")
private fun kniBridge848(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge844")
private external fun kniBridge844(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge850")
private external fun kniBridge850(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge851")
private external fun kniBridge851(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge852")
private external fun kniBridge852(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge853")
private external fun kniBridge853(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge849")
private fun kniBridge849(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().POST(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), constructingBodyWithBlock = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: AFMultipartFormDataProtocol?): Unit {
return kniBridge850(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, progress = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge851(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, success = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge852(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p6.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge853(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge855")
private fun kniBridge855(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge856")
private fun kniBridge856(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge854")
private external fun kniBridge854(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge858")
private external fun kniBridge858(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge859")
private external fun kniBridge859(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge857")
private fun kniBridge857(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().PUT(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge858(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge859(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge861")
private fun kniBridge861(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge862")
private fun kniBridge862(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge860")
private external fun kniBridge860(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge864")
private external fun kniBridge864(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge865")
private external fun kniBridge865(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge863")
private fun kniBridge863(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().PATCH(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge864(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge865(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge867")
private fun kniBridge867(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge868")
private fun kniBridge868(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge866")
private external fun kniBridge866(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge870")
private external fun kniBridge870(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge871")
private external fun kniBridge871(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge869")
private fun kniBridge869(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().DELETE(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge870(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge871(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge872")
private external fun kniBridge872(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge873")
private fun kniBridge873(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().baseURL().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge874")
private external fun kniBridge874(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge875")
private fun kniBridge875(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().requestSerializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge876")
private external fun kniBridge876(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge877")
private fun kniBridge877(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().setRequestSerializer(requestSerializer = interpretObjCPointerOrNull<AFHTTPRequestSerializer>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge878")
private external fun kniBridge878(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge879")
private fun kniBridge879(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().responseSerializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge880")
private external fun kniBridge880(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge881")
private fun kniBridge881(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().setResponseSerializer(responseSerializer = interpretObjCPointerOrNull<AFHTTPResponseSerializer>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge882")
private external fun kniBridge882(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge883")
private fun kniBridge883(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().initWithSessionConfiguration(configuration = interpretObjCPointerOrNull<NSURLSessionConfiguration>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge884")
private external fun kniBridge884(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge885")
private fun kniBridge885(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge886")
private external fun kniBridge886(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge887")
private fun kniBridge887(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge888")
private external fun kniBridge888(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge889")
private fun kniBridge889(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge890")
private external fun kniBridge890(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge891")
private fun kniBridge891(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge892")
private external fun kniBridge892(): NativePtr
@SymbolName("com_afnetworking_kniBridge893")
private external fun kniBridge893(): NativePtr
@SymbolName("com_afnetworking_kniBridge894")
private external fun kniBridge894(): NativePtr
@SymbolName("com_afnetworking_kniBridge895")
private external fun kniBridge895(): NativePtr
@SymbolName("com_afnetworking_kniBridge896")
private external fun kniBridge896(): NativePtr
@SymbolName("com_afnetworking_kniBridge897")
private external fun kniBridge897(): NativePtr
@SymbolName("com_afnetworking_kniBridge898")
private external fun kniBridge898(): ULong
@SymbolName("com_afnetworking_kniBridge899")
private external fun kniBridge899(): Double
@SymbolName("com_afnetworking_kniBridge900")
private external fun kniBridge900(): NativePtr
@SymbolName("com_afnetworking_kniBridge901")
private external fun kniBridge901(): NativePtr
@SymbolName("com_afnetworking_kniBridge902")
private external fun kniBridge902(): NativePtr
@SymbolName("com_afnetworking_kniBridge903")
private external fun kniBridge903(): NativePtr
@SymbolName("com_afnetworking_kniBridge904")
private external fun kniBridge904(): NativePtr
@SymbolName("com_afnetworking_kniBridge905")
private external fun kniBridge905(): NativePtr
@SymbolName("com_afnetworking_kniBridge906")
private external fun kniBridge906(): NativePtr
@SymbolName("com_afnetworking_kniBridge907")
private external fun kniBridge907(): NativePtr
@SymbolName("com_afnetworking_kniBridge908")
private external fun kniBridge908(): NativePtr
@SymbolName("com_afnetworking_kniBridge909")
private external fun kniBridge909(): NativePtr
@SymbolName("com_afnetworking_kniBridge910")
private external fun kniBridge910(): NativePtr
@SymbolName("com_afnetworking_kniBridge911")
private external fun kniBridge911(): NativePtr
@SymbolName("com_afnetworking_kniBridge912")
private external fun kniBridge912(): NativePtr
@SymbolName("com_afnetworking_kniBridge913")
private external fun kniBridge913(): NativePtr
@SymbolName("com_afnetworking_kniBridge914")
private external fun kniBridge914(): NativePtr
@SymbolName("com_afnetworking_kniBridge915")
private external fun kniBridge915(): NativePtr
@SymbolName("com_afnetworking_kniBridge916")
private external fun kniBridge916(): NativePtr
@SymbolName("com_afnetworking_kniBridge917")
private external fun kniBridge917(): NativePtr
@SymbolName("com_afnetworking_kniBridge918")
private external fun kniBridge918(): NativePtr
@SymbolName("com_afnetworking_kniBridge919")
private external fun kniBridge919(): NativePtr
@SymbolName("com_afnetworking_kniBridge920")
private external fun kniBridge920(): NativePtr
@SymbolName("com_afnetworking_kniBridge921")
private external fun kniBridge921(): NativePtr
@SymbolName("com_afnetworking_kniBridge922")
private external fun kniBridge922(): NativePtr
@SymbolName("com_afnetworking_kniBridge923")
private external fun kniBridge923(): NativePtr
@SymbolName("com_afnetworking_kniBridge924")
private external fun kniBridge924(): NativePtr
@SymbolName("com_afnetworking_kniBridge925")
private external fun kniBridge925(): NativePtr
@SymbolName("com_afnetworking_kniBridge926")
private external fun kniBridge926(): NativePtr
@SymbolName("com_afnetworking_kniBridge927")
private external fun kniBridge927(): NativePtr
@SymbolName("com_afnetworking_kniBridge928")
private external fun kniBridge928(): NativePtr
@SymbolName("com_afnetworking_kniBridge929")
private external fun kniBridge929(): NativePtr
@SymbolName("com_afnetworking_kniBridge930")
private external fun kniBridge930(): NativePtr
@SymbolName("com_afnetworking_kniBridge931")
private external fun kniBridge931(): NativePtr
@SymbolName("com_afnetworking_kniBridge932")
private external fun kniBridge932(): NativePtr
@SymbolName("com_afnetworking_kniBridge933")
private external fun kniBridge933(): NativePtr
@SymbolName("com_afnetworking_kniBridge934")
private external fun kniBridge934(): NativePtr
@SymbolName("com_afnetworking_kniBridge935")
private external fun kniBridge935(): NativePtr
@SymbolName("com_afnetworking_kniBridge936")
private external fun kniBridge936(): NativePtr
@SymbolName("com_afnetworking_kniBridge937")
private external fun kniBridge937(): NativePtr
@SymbolName("com_afnetworking_kniBridge938")
private external fun kniBridge938(): NativePtr
@SymbolName("com_afnetworking_kniBridge939")
private external fun kniBridge939(): NativePtr
@SymbolName("com_afnetworking_kniBridge940")
private external fun kniBridge940(): NativePtr
@SymbolName("com_afnetworking_kniBridge941")
private external fun kniBridge941(): NativePtr
@SymbolName("com_afnetworking_kniBridge942")
private external fun kniBridge942(): NativePtr
@SymbolName("com_afnetworking_kniBridge943")
private external fun kniBridge943(): NativePtr
@SymbolName("com_afnetworking_kniBridge944")
private external fun kniBridge944(): NativePtr
@SymbolName("com_afnetworking_kniBridge945")
private external fun kniBridge945(): NativePtr
@SymbolName("com_afnetworking_kniBridge946")
private external fun kniBridge946(): NativePtr
@SymbolName("com_afnetworking_kniBridge947")
private external fun kniBridge947(): NativePtr
@SymbolName("com_afnetworking_kniBridge948")
private external fun kniBridge948(): NativePtr
@SymbolName("com_afnetworking_kniBridge949")
private external fun kniBridge949(): NativePtr
@SymbolName("com_afnetworking_kniBridge950")
private external fun kniBridge950(): NativePtr
@SymbolName("com_afnetworking_kniBridge951")
private external fun kniBridge951(): NativePtr
@SymbolName("com_afnetworking_kniBridge952")
private external fun kniBridge952(): NativePtr
@SymbolName("com_afnetworking_kniBridge953")
private external fun kniBridge953(): NativePtr
@SymbolName("com_afnetworking_kniBridge954")
private external fun kniBridge954(): NativePtr
@SymbolName("com_afnetworking_kniBridge955")
private external fun kniBridge955(): NativePtr
@SymbolName("com_afnetworking_kniBridge956")
private external fun kniBridge956(): NativePtr
@SymbolName("com_afnetworking_kniBridge957")
private external fun kniBridge957(): NativePtr
@SymbolName("com_afnetworking_kniBridge958")
private external fun kniBridge958(): NativePtr
@SymbolName("com_afnetworking_kniBridge959")
private external fun kniBridge959(): NativePtr
@SymbolName("com_afnetworking_kniBridge960")
private external fun kniBridge960(): NativePtr
@SymbolName("com_afnetworking_kniBridge961")
private external fun kniBridge961(): NativePtr
@SymbolName("com_afnetworking_kniBridge962")
private external fun kniBridge962(): NativePtr
@SymbolName("com_afnetworking_kniBridge963")
private external fun kniBridge963(): NativePtr
@SymbolName("com_afnetworking_kniBridge964")
private external fun kniBridge964(): NativePtr
@SymbolName("com_afnetworking_kniBridge965")
private external fun kniBridge965(): NativePtr
@SymbolName("com_afnetworking_kniBridge966")
private external fun kniBridge966(): NativePtr
@SymbolName("com_afnetworking_kniBridge967")
private external fun kniBridge967(): NativePtr
@SymbolName("com_afnetworking_kniBridge968")
private external fun kniBridge968(): NativePtr
@SymbolName("com_afnetworking_kniBridge969")
private external fun kniBridge969(): NativePtr
@SymbolName("com_afnetworking_kniBridge970")
private external fun kniBridge970(): NativePtr
@SymbolName("com_afnetworking_kniBridge971")
private external fun kniBridge971(): NativePtr
@SymbolName("com_afnetworking_kniBridge972")
private external fun kniBridge972(): NativePtr
@SymbolName("com_afnetworking_kniBridge973")
private external fun kniBridge973(): NativePtr
@SymbolName("com_afnetworking_kniBridge974")
private external fun kniBridge974(): NativePtr
@SymbolName("com_afnetworking_kniBridge975")
private external fun kniBridge975(): NativePtr
@SymbolName("com_afnetworking_kniBridge976")
private external fun kniBridge976(): NativePtr
@SymbolName("com_afnetworking_kniBridge977")
private external fun kniBridge977(): NativePtr
@SymbolName("com_afnetworking_kniBridge978")
private external fun kniBridge978(): NativePtr
@SymbolName("com_afnetworking_kniBridge979")
private external fun kniBridge979(): NativePtr
@SymbolName("com_afnetworking_kniBridge980")
private external fun kniBridge980(): NativePtr
@SymbolName("com_afnetworking_kniBridge981")
private external fun kniBridge981(): NativePtr
@SymbolName("com_afnetworking_kniBridge982")
private external fun kniBridge982(): NativePtr
@SymbolName("com_afnetworking_kniBridge983")
private external fun kniBridge983(): NativePtr
@SymbolName("com_afnetworking_kniBridge984")
private external fun kniBridge984(): NativePtr
@SymbolName("com_afnetworking_kniBridge985")
private external fun kniBridge985(): NativePtr
@SymbolName("com_afnetworking_kniBridge986")
private external fun kniBridge986(): NativePtr
@SymbolName("com_afnetworking_kniBridge987")
private external fun kniBridge987(): NativePtr
@SymbolName("com_afnetworking_kniBridge988")
private external fun kniBridge988(): NativePtr
@SymbolName("com_afnetworking_kniBridge989")
private external fun kniBridge989(): NativePtr
@SymbolName("com_afnetworking_kniBridge990")
private external fun kniBridge990(): NativePtr
@SymbolName("com_afnetworking_kniBridge991")
private external fun kniBridge991(): NativePtr
@SymbolName("com_afnetworking_kniBridge992")
private external fun kniBridge992(): NativePtr
@SymbolName("com_afnetworking_kniBridge993")
private external fun kniBridge993(): NativePtr
@SymbolName("com_afnetworking_kniBridge994")
private external fun kniBridge994(): NativePtr
@SymbolName("com_afnetworking_kniBridge995")
private external fun kniBridge995(): NativePtr
@SymbolName("com_afnetworking_kniBridge996")
private external fun kniBridge996(): NativePtr
@SymbolName("com_afnetworking_kniBridge997")
private external fun kniBridge997(): NativePtr
@SymbolName("com_afnetworking_kniBridge998")
private external fun kniBridge998(): NativePtr
@SymbolName("com_afnetworking_kniBridge999")
private external fun kniBridge999(): NativePtr
@SymbolName("com_afnetworking_kniBridge1000")
private external fun kniBridge1000(): NativePtr
@SymbolName("com_afnetworking_kniBridge1001")
private external fun kniBridge1001(): NativePtr
@SymbolName("com_afnetworking_kniBridge1002")
private external fun kniBridge1002(): NativePtr
@SymbolName("com_afnetworking_kniBridge1003")
private external fun kniBridge1003(): NativePtr
@SymbolName("com_afnetworking_kniBridge1004")
private external fun kniBridge1004(): NativePtr
@SymbolName("com_afnetworking_kniBridge1005")
private external fun kniBridge1005(): NativePtr
@SymbolName("com_afnetworking_kniBridge1006")
private external fun kniBridge1006(): NativePtr
@SymbolName("com_afnetworking_kniBridge1007")
private external fun kniBridge1007(): NativePtr
@SymbolName("com_afnetworking_kniBridge1008")
private external fun kniBridge1008(): NativePtr
@SymbolName("com_afnetworking_kniBridge1009")
private external fun kniBridge1009(): NativePtr
@SymbolName("com_afnetworking_kniBridge1010")
private external fun kniBridge1010(): NativePtr
@SymbolName("com_afnetworking_kniBridge1011")
private external fun kniBridge1011(): NativePtr
@SymbolName("com_afnetworking_kniBridge1012")
private external fun kniBridge1012(): NativePtr
@SymbolName("com_afnetworking_kniBridge1013")
private external fun kniBridge1013(): NativePtr
@SymbolName("com_afnetworking_kniBridge1014")
private external fun kniBridge1014(): NativePtr
@SymbolName("com_afnetworking_kniBridge1015")
private external fun kniBridge1015(): NativePtr
@SymbolName("com_afnetworking_kniBridge1016")
private external fun kniBridge1016(): NativePtr
@SymbolName("com_afnetworking_kniBridge1017")
private external fun kniBridge1017(): NativePtr
@SymbolName("com_afnetworking_kniBridge1018")
private external fun kniBridge1018(): NativePtr
@SymbolName("com_afnetworking_kniBridge1019")
private external fun kniBridge1019(): NativePtr
@SymbolName("com_afnetworking_kniBridge1020")
private external fun kniBridge1020(): NativePtr
@SymbolName("com_afnetworking_kniBridge1021")
private external fun kniBridge1021(): NativePtr
@SymbolName("com_afnetworking_kniBridge1022")
private external fun kniBridge1022(): NativePtr
@SymbolName("com_afnetworking_kniBridge1023")
private external fun kniBridge1023(): NativePtr
@SymbolName("com_afnetworking_kniBridge1024")
private external fun kniBridge1024(): NativePtr
@SymbolName("com_afnetworking_kniBridge1025")
private external fun kniBridge1025(): NativePtr
@SymbolName("com_afnetworking_kniBridge1026")
private external fun kniBridge1026(): NativePtr
@SymbolName("com_afnetworking_kniBridge1027")
private external fun kniBridge1027(): NativePtr
@SymbolName("com_afnetworking_kniBridge1028")
private external fun kniBridge1028(): NativePtr
@SymbolName("com_afnetworking_kniBridge1029")
private external fun kniBridge1029(): NativePtr
@SymbolName("com_afnetworking_kniBridge1030")
private external fun kniBridge1030(): NativePtr
@SymbolName("com_afnetworking_kniBridge1031")
private external fun kniBridge1031(): NativePtr
@SymbolName("com_afnetworking_kniBridge1032")
private external fun kniBridge1032(): NativePtr
@SymbolName("com_afnetworking_kniBridge1033")
private external fun kniBridge1033(): NativePtr
@SymbolName("com_afnetworking_kniBridge1034")
private external fun kniBridge1034(): NativePtr
@SymbolName("com_afnetworking_kniBridge1035")
private external fun kniBridge1035(): NativePtr
@SymbolName("com_afnetworking_kniBridge1036")
private external fun kniBridge1036(): NativePtr
@SymbolName("com_afnetworking_kniBridge1037")
private external fun kniBridge1037(): NativePtr
@SymbolName("com_afnetworking_kniBridge1038")
private external fun kniBridge1038(): NativePtr
@SymbolName("com_afnetworking_kniBridge1039")
private external fun kniBridge1039(): NativePtr
@SymbolName("com_afnetworking_kniBridge1040")
private external fun kniBridge1040(): NativePtr
@SymbolName("com_afnetworking_kniBridge1041")
private external fun kniBridge1041(): NativePtr
@SymbolName("com_afnetworking_kniBridge1042")
private external fun kniBridge1042(): NativePtr
@SymbolName("com_afnetworking_kniBridge1043")
private external fun kniBridge1043(): NativePtr
@SymbolName("com_afnetworking_kniBridge1044")
private external fun kniBridge1044(): NativePtr
@SymbolName("com_afnetworking_kniBridge1045")
private external fun kniBridge1045(): NativePtr
@SymbolName("com_afnetworking_kniBridge1046")
private external fun kniBridge1046(): NativePtr
@SymbolName("com_afnetworking_kniBridge1047")
private external fun kniBridge1047(): NativePtr
@SymbolName("com_afnetworking_kniBridge1048")
private external fun kniBridge1048(): NativePtr
@SymbolName("com_afnetworking_kniBridge1049")
private external fun kniBridge1049(): NativePtr
@SymbolName("com_afnetworking_kniBridge1050")
private external fun kniBridge1050(): NativePtr
