
package nombrepremier.com;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "nombre_premier", targetNamespace = "http://com.nombrePremier/", wsdlLocation = "http://localhost:8080/WebApplication_calcul/nombre_premier?wsdl")
public class NombrePremier_Service
    extends Service
{

    private final static URL NOMBREPREMIER_WSDL_LOCATION;
    private final static WebServiceException NOMBREPREMIER_EXCEPTION;
    private final static QName NOMBREPREMIER_QNAME = new QName("http://com.nombrePremier/", "nombre_premier");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebApplication_calcul/nombre_premier?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NOMBREPREMIER_WSDL_LOCATION = url;
        NOMBREPREMIER_EXCEPTION = e;
    }

    public NombrePremier_Service() {
        super(__getWsdlLocation(), NOMBREPREMIER_QNAME);
    }

    public NombrePremier_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NOMBREPREMIER_QNAME, features);
    }

    public NombrePremier_Service(URL wsdlLocation) {
        super(wsdlLocation, NOMBREPREMIER_QNAME);
    }

    public NombrePremier_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NOMBREPREMIER_QNAME, features);
    }

    public NombrePremier_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NombrePremier_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NombrePremier
     */
    @WebEndpoint(name = "nombre_premierPort")
    public NombrePremier getNombrePremierPort() {
        return super.getPort(new QName("http://com.nombrePremier/", "nombre_premierPort"), NombrePremier.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NombrePremier
     */
    @WebEndpoint(name = "nombre_premierPort")
    public NombrePremier getNombrePremierPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com.nombrePremier/", "nombre_premierPort"), NombrePremier.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NOMBREPREMIER_EXCEPTION!= null) {
            throw NOMBREPREMIER_EXCEPTION;
        }
        return NOMBREPREMIER_WSDL_LOCATION;
    }

}