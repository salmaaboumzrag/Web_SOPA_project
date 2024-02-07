
package sommews_client;

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
@WebServiceClient(name = "additionWS", targetNamespace = "http://com.addition/", wsdlLocation = "http://localhost:8080/WebApplication_calcul/additionWS?wsdl")
public class AdditionWS_Service
    extends Service
{

    private final static URL ADDITIONWS_WSDL_LOCATION;
    private final static WebServiceException ADDITIONWS_EXCEPTION;
    private final static QName ADDITIONWS_QNAME = new QName("http://com.addition/", "additionWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebApplication_calcul/additionWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDITIONWS_WSDL_LOCATION = url;
        ADDITIONWS_EXCEPTION = e;
    }

    public AdditionWS_Service() {
        super(__getWsdlLocation(), ADDITIONWS_QNAME);
    }

    public AdditionWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDITIONWS_QNAME, features);
    }

    public AdditionWS_Service(URL wsdlLocation) {
        super(wsdlLocation, ADDITIONWS_QNAME);
    }

    public AdditionWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDITIONWS_QNAME, features);
    }

    public AdditionWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdditionWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdditionWS
     */
    @WebEndpoint(name = "additionWSPort")
    public AdditionWS getAdditionWSPort() {
        return super.getPort(new QName("http://com.addition/", "additionWSPort"), AdditionWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdditionWS
     */
    @WebEndpoint(name = "additionWSPort")
    public AdditionWS getAdditionWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://com.addition/", "additionWSPort"), AdditionWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDITIONWS_EXCEPTION!= null) {
            throw ADDITIONWS_EXCEPTION;
        }
        return ADDITIONWS_WSDL_LOCATION;
    }

}
