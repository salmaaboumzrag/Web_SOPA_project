/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombrepremierws_client;

import java.util.Scanner;

/**
 *
 * @author salma aboumzrag
 */
public class NombrePremierWS_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        int X = scanner.nextInt();
        System.out.println(npmbrePremierTest(X));
        System.out.println("les facteur premiers de ce nombre sont : "+decomposerEnFacteursPremiers(X));


    }

    private static String npmbrePremierTest(int x) {
        nombrepremier.com.NombrePremier_Service service = new nombrepremier.com.NombrePremier_Service();
        nombrepremier.com.NombrePremier port = service.getNombrePremierPort();
        return port.npmbrePremierTest(x);
    }

    private static java.util.List<java.lang.Object> decomposerEnFacteursPremiers(int number) {
        decomposition_facteurs_premier_client.DecomposerEnFacteursPremiers_Service service = new decomposition_facteurs_premier_client.DecomposerEnFacteursPremiers_Service();
        decomposition_facteurs_premier_client.DecomposerEnFacteursPremiers port = service.getDecomposerEnFacteursPremiersPort();
        return port.decomposerEnFacteursPremiers(number);
    }
    
}
