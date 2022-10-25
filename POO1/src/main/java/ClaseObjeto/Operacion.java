
package ClaseObjeto;

import java.util.Scanner;


public class Operacion {
    //atributos
    
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    
    
    //metodos
    
    // metodo para pedirle al usuario que nos digite dos numeros
    public void LeerNumeros(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        System.out.println("Ingrese un numero");
        
        num1= leer.nextInt();
        num2= leer.nextInt();
        
    }
    
    public void Sumar(){
        suma = num1+num2;
    }
    
    public void Restar(){
        resta = num1-num2;
    }
    
    public void Multiplicar(){
        multiplicacion = num1*num2;
    }
    
    public void Dividir(){
        division = num1/num2;
    }
    
    public void MostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
