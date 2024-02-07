
package nombrepremier.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nombrepremier.com package. 
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

    private final static QName _NpmbrePremierTest_QNAME = new QName("http://com.nombrePremier/", "npmbre_premier_test");
    private final static QName _NpmbrePremierTestResponse_QNAME = new QName("http://com.nombrePremier/", "npmbre_premier_testResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nombrepremier.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NpmbrePremierTest }
     * 
     */
    public NpmbrePremierTest createNpmbrePremierTest() {
        return new NpmbrePremierTest();
    }

    /**
     * Create an instance of {@link NpmbrePremierTestResponse }
     * 
     */
    public NpmbrePremierTestResponse createNpmbrePremierTestResponse() {
        return new NpmbrePremierTestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NpmbrePremierTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.nombrePremier/", name = "npmbre_premier_test")
    public JAXBElement<NpmbrePremierTest> createNpmbrePremierTest(NpmbrePremierTest value) {
        return new JAXBElement<NpmbrePremierTest>(_NpmbrePremierTest_QNAME, NpmbrePremierTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NpmbrePremierTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.nombrePremier/", name = "npmbre_premier_testResponse")
    public JAXBElement<NpmbrePremierTestResponse> createNpmbrePremierTestResponse(NpmbrePremierTestResponse value) {
        return new JAXBElement<NpmbrePremierTestResponse>(_NpmbrePremierTestResponse_QNAME, NpmbrePremierTestResponse.class, null, value);
    }

}
