
package CLA.newpackage;

import java.util.Scanner;


public class MAIN1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite numero 1");
       int n1= leer.nextInt();
       System.out.println("digite numero 2");
        int n2= leer.nextInt();
        
        OPERA op = new OPERA();
        
        
        op.Sumar(n1, n2);
        op.Restar(n1, n2);
        op.Multiplicar(n1, n2);
        op.Dividir(n1, n2);
        op.MostrarResultados();
    }
    
}
