package ServicioB;

import EntidadB.AtributosBanc;
import java.util.Scanner;

public class MetodosBanc {

    Scanner leer = new Scanner(System.in);

    AtributosBanc Cuenta = new AtributosBanc();

    public AtributosBanc IngresoDatos() {

        System.out.println("Por favor ingrese su Numero de Cuenta:");
        Cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Por favor ingrese su DNI:");
        Cuenta.setDNIcliente(leer.nextLong());
        System.out.println("Ingrese su Saldo:");
        Cuenta.setSaldoActual(leer.nextInt());
        return Cuenta;

    }

    public void Ingresar() {
        System.out.println("Ingrese Cantidad de Dinero va a deposidtar");
      double  ingreso = leer.nextDouble();

        int ingre = (int) ingreso;
        Cuenta.setSaldoActual(Cuenta.getSaldoActual() + ingre);

    }

    public void Retirar() {
        System.out.println("Ingrese la Cantidad de Dinero a Retirar");
       double retiro = leer.nextDouble();
        int ret = (int) retiro;

        if (retiro > Cuenta.getSaldoActual()) {
            Cuenta.setSaldoActual(0);

        } else {
            Cuenta.setSaldoActual(Cuenta.getSaldoActual() - ret);
        }

    }
    
    public void ExtraccionRapida(){
        System.out.println("Ingrese la Cantidad de Dinero a Retirar");
        int retiroRapido = leer.nextInt();
        
        if ((retiroRapido*100)/Cuenta.getSaldoActual() < 20){
            
            Cuenta.setSaldoActual(Cuenta.getSaldoActual() -  retiroRapido);
        }
    }
    
    public void consultarSaldo(){
        
        System.out.println("Su saldo disponible Es: "+Cuenta.getSaldoActual());
        
    }
    
    public void consultarDatos(){
        System.out.println("DNI Cliente:");
        System.out.println(Cuenta.getDNIcliente());
       
        System.out.println("");
         System.out.println("Numero de Cuenta Cliente");
         System.out.println(Cuenta.getNumeroCuenta());
    }

}
