/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombrePremier.com;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author salma aboumzrag
 */
@WebService(serviceName = "nombre_premier")
public class nombre_premier {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "npmbre_premier_test")
    public String npmbre_premier_test(@WebParam(name = "X") int X) {
        
        if (X <= 1) {
            return X +" n'est pas premier ";
        }
        
        for (int i = 2; i <= Math.sqrt(X); i++) {
            if (X % i == 0) {
                return X +" n'est pas premier ";
            }
        }
        return X +" est premier ";
                
    }
}
