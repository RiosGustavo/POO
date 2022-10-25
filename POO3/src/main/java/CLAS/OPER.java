
package CLAS;


public class OPER {
      //atributos
    
   
   
    
    
    
    //metodos
    
    // metodo para pedirle al usuario que nos digite dos numeros
  
    
    public int Sumar(int num1, int num2){
       int suma = num1+num2;
       return suma;
    }
    
    public int Restar(int num1, int num2){
       int resta = num1-num2; 
       return resta;
    }
    
    public int Multiplicar(int num1, int num2){
        int multiplicacion = num1*num2;
        return multiplicacion;
    }
    
    public int Dividir(int num1, int num2){
       int division = num1/num2;
       return division;
    }
    
    public void MostrarResultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
