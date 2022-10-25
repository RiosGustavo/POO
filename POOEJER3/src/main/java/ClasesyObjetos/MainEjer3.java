
package ClasesyObjetos;


public class MainEjer3 {

   
    public static void main(String[] args) {
        Operacion op = new Operacion();
        
        op.Operacion();
        
        int suma = op.Sumar();
        int resta = op.Restar();
        int multi = op.Multiplicacion();
        int div = op.Division();
        
        System.out.println("la suma es "+suma);
        System.out.println("la resta es "+resta);
        System.out.println("la multiplicacion es "+multi);
        System.out.println("la division es "+div);
              
        
        
        
    }
    
}
