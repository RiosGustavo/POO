
package CLA.newpackage;

import java.util.Scanner;


public class OPERA {
    
     //atributos
    
   
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    
    
    //metodos
    
    // metodo para pedirle al usuario que nos digite dos numeros
  
    
    public void Sumar(int num1, int num2){
       suma = num1+num2;
    }
    
    public void Restar(int num1, int num2){
       resta = num1-num2; 
    }
    
    public void Multiplicar(int num1, int num2){
        multiplicacion = num1*num2;
    }
    
    public void Dividir(int num1, int num2){
       division = num1/num2;
    }
    
    public void MostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
}
