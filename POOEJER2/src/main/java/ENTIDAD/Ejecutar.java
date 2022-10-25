
package ENTIDAD;


public class Ejecutar {

    public static void main(String[] args) {
       
        
        Circunferencia op = new Circunferencia();
        
        
        
        op.CrearCircunferencia();
        
        double Area = op.AreaCircunferencia();
        double Perimetro = op.Perimetro();
        
     op.MostrarResultados(Area, Perimetro);
        
    }
    
}
