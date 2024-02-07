
package decomposition_facteurs_premier_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the decomposition_facteurs_premier_client package. 
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

    private final static QName _DecomposerEnFacteursPremiers_QNAME = new QName("http://com.decomposition/", "decomposer_en_facteurs_premiers");
    private final static QName _DecomposerEnFacteursPremiersResponse_QNAME = new QName("http://com.decomposition/", "decomposer_en_facteurs_premiersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: decomposition_facteurs_premier_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DecomposerEnFacteursPremiers_Type }
     * 
     */
    public DecomposerEnFacteursPremiers_Type createDecomposerEnFacteursPremiers_Type() {
        return new DecomposerEnFacteursPremiers_Type();
    }

    /**
     * Create an instance of {@link DecomposerEnFacteursPremiersResponse }
     * 
     */
    public DecomposerEnFacteursPremiersResponse createDecomposerEnFacteursPremiersResponse() {
        return new DecomposerEnFacteursPremiersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecomposerEnFacteursPremiers_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.decomposition/", name = "decomposer_en_facteurs_premiers")
    public JAXBElement<DecomposerEnFacteursPremiers_Type> createDecomposerEnFacteursPremiers(DecomposerEnFacteursPremiers_Type value) {
        return new JAXBElement<DecomposerEnFacteursPremiers_Type>(_DecomposerEnFacteursPremiers_QNAME, DecomposerEnFacteursPremiers_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecomposerEnFacteursPremiersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.decomposition/", name = "decomposer_en_facteurs_premiersResponse")
    public JAXBElement<DecomposerEnFacteursPremiersResponse> createDecomposerEnFacteursPremiersResponse(DecomposerEnFacteursPremiersResponse value) {
        return new JAXBElement<DecomposerEnFacteursPremiersResponse>(_DecomposerEnFacteursPremiersResponse_QNAME, DecomposerEnFacteursPremiersResponse.class, null, value);
    }

}
