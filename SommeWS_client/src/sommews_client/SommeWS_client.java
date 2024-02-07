
package sommews_client;

import java.util.Scanner;

/**
 *
 * @author salma aboumzrag
 */
public class SommeWS_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un premier nombre :");
        int X = scanner.nextInt();
        
        System.out.println("Entrez un deuxieme nombre :");
        int Y = scanner.nextInt();
        
        System.out.println("La somme de "+ X +" et "+ Y +" est : "+ addition(X,Y));
        
    }

    private static int addition(int x, int y) {
        sommews_client.AdditionWS_Service service = new sommews_client.AdditionWS_Service();
        sommews_client.AdditionWS port = service.getAdditionWSPort();
        return port.addition(x, y);
    }
    
}
