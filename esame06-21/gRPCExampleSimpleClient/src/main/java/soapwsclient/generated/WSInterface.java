
package soapwsclient.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSInterface", targetNamespace = "http://soapws.softeng.sapienza.it/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSInterface {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCommercialInfo", targetNamespace = "http://soapws.softeng.sapienza.it/", className = "soapwsclient.generated.GetCommercialInfo")
    @ResponseWrapper(localName = "getCommercialInfoResponse", targetNamespace = "http://soapws.softeng.sapienza.it/", className = "soapwsclient.generated.GetCommercialInfoResponse")
    public String getCommercialInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getETA", targetNamespace = "http://soapws.softeng.sapienza.it/", className = "soapwsclient.generated.GetETA")
    @ResponseWrapper(localName = "getETAResponse", targetNamespace = "http://soapws.softeng.sapienza.it/", className = "soapwsclient.generated.GetETAResponse")
    public String getETA(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
