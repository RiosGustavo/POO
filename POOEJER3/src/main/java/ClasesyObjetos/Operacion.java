
package ClasesyObjetos;

import java.util.Scanner;


public class Operacion {
    // atributos
    
  private  int Num1;
    private int Num2;
    
    public Operacion(int Num1, int Num2){
        this.Num1 = Num1;
        this.Num2 = Num2;
        
    }
    
    public Operacion(){
        
        
    }

    public int getNum1() {
        return Num1;
    }

    public void setNum1(int Num1) {
        this.Num1 = Num1;
    }

    public int getNum2() {
        return Num2;
    }

    public void setNum2(int Num2) {
        this.Num2 = Num2;
    }
    
    public void Operacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Numero1");
        Num1 = leer.nextInt();
        System.out.println("Ingrese Numero1");
        Num2 = leer.nextInt();
    }
    
    public int Sumar(){
        int suma = Num1+Num2;
        return suma;
    }
    
    public int Restar(){
        int resta = Num1-Num2;
        return resta;
    }
    
    public int Multiplicacion(){
        if (Num1>0 && Num2>0){
            int multi = Num1*Num2;
            return multi;
        }else{
            System.out.println("Error Multiplicacion por 0");
            return 0;
        }
        
    }
    
    public int Division(){
        if (Num2==0){
            System.out.println("Error Division por 0");
            return 0;
        }else{
            int div = Num1/Num2;
            return div;
        }
    }
    
    
    
}
