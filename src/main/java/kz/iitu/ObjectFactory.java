
package kz.iitu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kz.iitu package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetListCityResponse_QNAME = new QName("http://iitu.kz/", "getListCityResponse");
    private final static QName _GetCityByCityName_QNAME = new QName("http://iitu.kz/", "getCityByCityName");
    private final static QName _GetListCity_QNAME = new QName("http://iitu.kz/", "getListCity");
    private final static QName _GetListCityByZoneName_QNAME = new QName("http://iitu.kz/", "getListCityByZoneName");
    private final static QName _GetListOfTimezone_QNAME = new QName("http://iitu.kz/", "getListOfTimezone");
    private final static QName _GetListOfTimezoneResponse_QNAME = new QName("http://iitu.kz/", "getListOfTimezoneResponse");
    private final static QName _GetListOfCountryCodeResponse_QNAME = new QName("http://iitu.kz/", "getListOfCountryCodeResponse");
    private final static QName _GetCityByCityNameResponse_QNAME = new QName("http://iitu.kz/", "getCityByCityNameResponse");
    private final static QName _GetListCityByZoneNameAndByCode_QNAME = new QName("http://iitu.kz/", "getListCityByZoneNameAndByCode");
    private final static QName _Exception_QNAME = new QName("http://iitu.kz/", "Exception");
    private final static QName _GetListCityByCodeResponse_QNAME = new QName("http://iitu.kz/", "getListCityByCodeResponse");
    private final static QName _GetListCityByZoneNameResponse_QNAME = new QName("http://iitu.kz/", "getListCityByZoneNameResponse");
    private final static QName _GetString_QNAME = new QName("http://iitu.kz/", "getString");
    private final static QName _GetListCityByZoneNameAndByCodeResponse_QNAME = new QName("http://iitu.kz/", "getListCityByZoneNameAndByCodeResponse");
    private final static QName _GetListOfCountryCode_QNAME = new QName("http://iitu.kz/", "getListOfCountryCode");
    private final static QName _GetListCityByCode_QNAME = new QName("http://iitu.kz/", "getListCityByCode");
    private final static QName _GetStringResponse_QNAME = new QName("http://iitu.kz/", "getStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kz.iitu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListOfCountryCode }
     * 
     */
    public GetListOfCountryCode createGetListOfCountryCode() {
        return new GetListOfCountryCode();
    }

    /**
     * Create an instance of {@link GetListCityByCode }
     * 
     */
    public GetListCityByCode createGetListCityByCode() {
        return new GetListCityByCode();
    }

    /**
     * Create an instance of {@link GetStringResponse }
     * 
     */
    public GetStringResponse createGetStringResponse() {
        return new GetStringResponse();
    }

    /**
     * Create an instance of {@link GetListCityByZoneNameAndByCodeResponse }
     * 
     */
    public GetListCityByZoneNameAndByCodeResponse createGetListCityByZoneNameAndByCodeResponse() {
        return new GetListCityByZoneNameAndByCodeResponse();
    }

    /**
     * Create an instance of {@link GetString }
     * 
     */
    public GetString createGetString() {
        return new GetString();
    }

    /**
     * Create an instance of {@link GetListCityByZoneNameAndByCode }
     * 
     */
    public GetListCityByZoneNameAndByCode createGetListCityByZoneNameAndByCode() {
        return new GetListCityByZoneNameAndByCode();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetListCityByCodeResponse }
     * 
     */
    public GetListCityByCodeResponse createGetListCityByCodeResponse() {
        return new GetListCityByCodeResponse();
    }

    /**
     * Create an instance of {@link GetListCityByZoneNameResponse }
     * 
     */
    public GetListCityByZoneNameResponse createGetListCityByZoneNameResponse() {
        return new GetListCityByZoneNameResponse();
    }

    /**
     * Create an instance of {@link GetListOfCountryCodeResponse }
     * 
     */
    public GetListOfCountryCodeResponse createGetListOfCountryCodeResponse() {
        return new GetListOfCountryCodeResponse();
    }

    /**
     * Create an instance of {@link GetCityByCityNameResponse }
     * 
     */
    public GetCityByCityNameResponse createGetCityByCityNameResponse() {
        return new GetCityByCityNameResponse();
    }

    /**
     * Create an instance of {@link GetCityByCityName }
     * 
     */
    public GetCityByCityName createGetCityByCityName() {
        return new GetCityByCityName();
    }

    /**
     * Create an instance of {@link GetListCity }
     * 
     */
    public GetListCity createGetListCity() {
        return new GetListCity();
    }

    /**
     * Create an instance of {@link GetListCityByZoneName }
     * 
     */
    public GetListCityByZoneName createGetListCityByZoneName() {
        return new GetListCityByZoneName();
    }

    /**
     * Create an instance of {@link GetListOfTimezone }
     * 
     */
    public GetListOfTimezone createGetListOfTimezone() {
        return new GetListOfTimezone();
    }

    /**
     * Create an instance of {@link GetListOfTimezoneResponse }
     * 
     */
    public GetListOfTimezoneResponse createGetListOfTimezoneResponse() {
        return new GetListOfTimezoneResponse();
    }

    /**
     * Create an instance of {@link GetListCityResponse }
     * 
     */
    public GetListCityResponse createGetListCityResponse() {
        return new GetListCityResponse();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListCityResponse")
    public JAXBElement<GetListCityResponse> createGetListCityResponse(GetListCityResponse value) {
        return new JAXBElement<GetListCityResponse>(_GetListCityResponse_QNAME, GetListCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCityByCityName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getCityByCityName")
    public JAXBElement<GetCityByCityName> createGetCityByCityName(GetCityByCityName value) {
        return new JAXBElement<GetCityByCityName>(_GetCityByCityName_QNAME, GetCityByCityName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListCity")
    public JAXBElement<GetListCity> createGetListCity(GetListCity value) {
        return new JAXBElement<GetListCity>(_GetListCity_QNAME, GetListCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCityByZoneName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListCityByZoneName")
    public JAXBElement<GetListCityByZoneName> createGetListCityByZoneName(GetListCityByZoneName value) {
        return new JAXBElement<GetListCityByZoneName>(_GetListCityByZoneName_QNAME, GetListCityByZoneName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfTimezone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListOfTimezone")
    public JAXBElement<GetListOfTimezone> createGetListOfTimezone(GetListOfTimezone value) {
        return new JAXBElement<GetListOfTimezone>(_GetListOfTimezone_QNAME, GetListOfTimezone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfTimezoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListOfTimezoneResponse")
    public JAXBElement<GetListOfTimezoneResponse> createGetListOfTimezoneResponse(GetListOfTimezoneResponse value) {
        return new JAXBElement<GetListOfTimezoneResponse>(_GetListOfTimezoneResponse_QNAME, GetListOfTimezoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfCountryCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListOfCountryCodeResponse")
    public JAXBElement<GetListOfCountryCodeResponse> createGetListOfCountryCodeResponse(GetListOfCountryCodeResponse value) {
        return new JAXBElement<GetListOfCountryCodeResponse>(_GetListOfCountryCodeResponse_QNAME, GetListOfCountryCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCityByCityNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getCityByCityNameResponse")
    public JAXBElement<GetCityByCityNameResponse> createGetCityByCityNameResponse(GetCityByCityNameResponse value) {
        return new JAXBElement<GetCityByCityNameResponse>(_GetCityByCityNameResponse_QNAME, GetCityByCityNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCityByZoneNameAndByCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListCityByZoneNameAndByCode")
    public JAXBElement<GetListCityByZoneNameAndByCode> createGetListCityByZoneNameAndByCode(GetListCityByZoneNameAndByCode value) {
        return new JAXBElement<GetListCityByZoneNameAndByCode>(_GetListCityByZoneNameAndByCode_QNAME, GetListCityByZoneNameAndByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCityByCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListCityByCodeResponse")
    public JAXBElement<GetListCityByCodeResponse> createGetListCityByCodeResponse(GetListCityByCodeResponse value) {
        return new JAXBElement<GetListCityByCodeResponse>(_GetListCityByCodeResponse_QNAME, GetListCityByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCityByZoneNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListCityByZoneNameResponse")
    public JAXBElement<GetListCityByZoneNameResponse> createGetListCityByZoneNameResponse(GetListCityByZoneNameResponse value) {
        return new JAXBElement<GetListCityByZoneNameResponse>(_GetListCityByZoneNameResponse_QNAME, GetListCityByZoneNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getString")
    public JAXBElement<GetString> createGetString(GetString value) {
        return new JAXBElement<GetString>(_GetString_QNAME, GetString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCityByZoneNameAndByCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListCityByZoneNameAndByCodeResponse")
    public JAXBElement<GetListCityByZoneNameAndByCodeResponse> createGetListCityByZoneNameAndByCodeResponse(GetListCityByZoneNameAndByCodeResponse value) {
        return new JAXBElement<GetListCityByZoneNameAndByCodeResponse>(_GetListCityByZoneNameAndByCodeResponse_QNAME, GetListCityByZoneNameAndByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListOfCountryCode")
    public JAXBElement<GetListOfCountryCode> createGetListOfCountryCode(GetListOfCountryCode value) {
        return new JAXBElement<GetListOfCountryCode>(_GetListOfCountryCode_QNAME, GetListOfCountryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCityByCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getListCityByCode")
    public JAXBElement<GetListCityByCode> createGetListCityByCode(GetListCityByCode value) {
        return new JAXBElement<GetListCityByCode>(_GetListCityByCode_QNAME, GetListCityByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "getStringResponse")
    public JAXBElement<GetStringResponse> createGetStringResponse(GetStringResponse value) {
        return new JAXBElement<GetStringResponse>(_GetStringResponse_QNAME, GetStringResponse.class, null, value);
    }

}
