
package nombrepremier.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour npmbre_premier_test complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="npmbre_premier_test">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "npmbre_premier_test", propOrder = {
    "x"
})
public class NpmbrePremierTest {

    @XmlElement(name = "X")
    protected int x;

    /**
     * Obtient la valeur de la propriété x.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Définit la valeur de la propriété x.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

}
