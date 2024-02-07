/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decomposition.com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author salma aboumzrag
 */
@WebService(serviceName = "decomposer_en_facteurs_premiers")
public class decomposer_en_facteurs_premiers {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "decomposer_en_facteurs_premiers")
    public List decomposer_en_facteurs_premiers(@WebParam(name = "number") int X) {
      
        List facteursPremiers = new ArrayList<>();
        // Pour 2, diviser X tant qu'il est pair.
            while (X % 2 == 0) {
                facteursPremiers.add(2);
                X /= 2;
            }

            // Pour les nombres impairs à partir de 3.
            for (int i = 3; i <= Math.sqrt(X); i += 2) {
                // Tant que i divise X, ajouter i et diviser X
                while (X % i == 0) {
                    facteursPremiers.add(i);
                    X /= i;
                }
            }

            // Si X est un nombre premier plus grand que 2
            if (X > 2) {
                facteursPremiers.add(X);
            }

            return facteursPremiers;
        }
}
