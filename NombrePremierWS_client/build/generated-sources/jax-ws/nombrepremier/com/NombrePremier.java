
package nombrepremier.com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "nombre_premier", targetNamespace = "http://com.nombrePremier/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NombrePremier {


    /**
     * 
     * @param x
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "npmbre_premier_test")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "npmbre_premier_test", targetNamespace = "http://com.nombrePremier/", className = "nombrepremier.com.NpmbrePremierTest")
    @ResponseWrapper(localName = "npmbre_premier_testResponse", targetNamespace = "http://com.nombrePremier/", className = "nombrepremier.com.NpmbrePremierTestResponse")
    @Action(input = "http://com.nombrePremier/nombre_premier/npmbre_premier_testRequest", output = "http://com.nombrePremier/nombre_premier/npmbre_premier_testResponse")
    public String npmbrePremierTest(
        @WebParam(name = "X", targetNamespace = "")
        int x);

}
