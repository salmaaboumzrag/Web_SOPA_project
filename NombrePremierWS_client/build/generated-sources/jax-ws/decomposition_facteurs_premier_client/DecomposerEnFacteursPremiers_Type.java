
package decomposition_facteurs_premier_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour decomposer_en_facteurs_premiers complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="decomposer_en_facteurs_premiers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decomposer_en_facteurs_premiers", propOrder = {
    "number"
})
public class DecomposerEnFacteursPremiers_Type {

    protected int number;

    /**
     * Obtient la valeur de la propriété number.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Définit la valeur de la propriété number.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

}
