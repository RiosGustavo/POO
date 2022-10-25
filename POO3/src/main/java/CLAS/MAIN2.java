
package CLAS;

import java.util.Scanner;


public class MAIN2 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
       System.out.println("digite numero 1");
       int n1= leer.nextInt();
       
       System.out.println("digite numero 2");
       int n2= leer.nextInt();
        
        OPER op = new OPER();
        
        
        int suma = op.Sumar(n1, n2);
        int resta = op.Restar(n1, n2);
        int mult = op.Multiplicar(n1, n2);
        int div = op.Dividir(n1, n2);
        op.MostrarResultados(suma, resta, mult, div);
    }
    
}
