
package kz.iitu;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceTest", targetNamespace = "http://iitu.kz/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceTest {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getString", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetString")
    @ResponseWrapper(localName = "getStringResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetStringResponse")
    @Action(input = "http://iitu.kz/WebServiceTest/getStringRequest", output = "http://iitu.kz/WebServiceTest/getStringResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://iitu.kz/WebServiceTest/getString/Fault/Exception")
    })
    public String getString(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<kz.iitu.City>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListCityByCode", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetListCityByCode")
    @ResponseWrapper(localName = "getListCityByCodeResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetListCityByCodeResponse")
    @Action(input = "http://iitu.kz/WebServiceTest/getListCityByCodeRequest", output = "http://iitu.kz/WebServiceTest/getListCityByCodeResponse")
    public List<City> getListCityByCode(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns kz.iitu.City
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCityByCityName", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetCityByCityName")
    @ResponseWrapper(localName = "getCityByCityNameResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetCityByCityNameResponse")
    @Action(input = "http://iitu.kz/WebServiceTest/getCityByCityNameRequest", output = "http://iitu.kz/WebServiceTest/getCityByCityNameResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://iitu.kz/WebServiceTest/getCityByCityName/Fault/Exception")
    })
    public City getCityByCityName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<kz.iitu.City>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListCityByZoneName", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetListCityByZoneName")
    @ResponseWrapper(localName = "getListCityByZoneNameResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetListCityByZoneNameResponse")
    @Action(input = "http://iitu.kz/WebServiceTest/getListCityByZoneNameRequest", output = "http://iitu.kz/WebServiceTest/getListCityByZoneNameResponse")
    public List<City> getListCityByZoneName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<kz.iitu.City>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListCityByZoneNameAndByCode", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetListCityByZoneNameAndByCode")
    @ResponseWrapper(localName = "getListCityByZoneNameAndByCodeResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.GetListCityByZoneNameAndByCodeResponse")
    @Action(input = "http://iitu.kz/WebServiceTest/getListCityByZoneNameAndByCodeRequest", output = "http://iitu.kz/WebServiceTest/getListCityByZoneNameAndByCodeResponse")
    public List<City> getListCityByZoneNameAndByCode(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
