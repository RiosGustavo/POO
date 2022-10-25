
package ENTIDAD;

import java.util.Scanner;


public class Circunferencia {
    
    private double Radio;
    
    
   

    public Circunferencia(double Radio) {
        this.Radio = Radio;
        
    }
    
    public Circunferencia(){
    
    }
    
      //  Metodo Getter mostramos el Radio
    public double getRadio() {
        return Radio;
    }

    
    
// Metodo Setter establecemos el Radio
      public void setRadio(double Radio) {
        this.Radio = Radio;
    }
 
    
    
    public void CrearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Radio de la Circunferencia");
        
        Radio = leer.nextDouble();
        
        
    }
    
    public double AreaCircunferencia(){
        
       double Area = (Math.pow(Radio, 2)*Math.PI);
        return Area;
        
    }
    
    public double Perimetro(){
        
       double Perimetro = 2*Math.PI*Radio;
         return Perimetro;
    }
    
    public void MostrarResultados( double Area, double Perimetro){
    
      System.out.println("El Area de la Circunferencia es: "+Area);
      System.out.println("El Perimetro de la Circunferencia es: "+Perimetro);
       
       
        
}
       
}
