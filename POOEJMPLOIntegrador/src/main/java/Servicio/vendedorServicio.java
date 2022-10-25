
package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class vendedorServicio {
    Scanner leer = new Scanner(System.in);
    
    /// creo el metodoc con los atributos y el nombre que le quiero dar al metodo
    public Vendedor altaVendedor(){
        
        
        /// instancio un objeto de tipo vendedor
        
        Vendedor v1 = new Vendedor();
        // lleno los atributos
        System.out.println("ingrese el nombre del vendedor");
        v1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese el DNI");
        v1.setDNI(leer.nextInt());
        
        System.out.println("Ingrese el sueldo Basico");
        v1.setSueldoBasico(leer.nextDouble());
        
        System.out.println("Ingrese el dia enque comenzo a trabajar");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes enque comenzo a trabajar");
        int mes = leer.nextInt();
        
         System.out.println("Ingrese el año enque comenzo a trabajar");
        int anio = leer.nextInt();
        
        Date Fecha = new Date(anio-1900, mes-1,dia);
        v1.setFechaInicio(Fecha);
        
        return v1;
        
    }
    public void sueldoMensual(Vendedor v1){
        System.out.println("Cuales fueron las ventas totales del vendedor");
        double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo Mensual del vendedor "
                +v1.getNombre()+" es de $ "+v1.getSueldoMensual());
        
    }
    /// se pasa como parametro la clase en  este caso Vendedor con la varibale que creamos v1
    public void vacaciones(Vendedor v1){
        
        /// con este procedimiento calculamos antiguedad
        
        Date hoy = new Date();
        
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if(antiguedad<5){
            System.out.println("Le corresponden 14 dias de vacaciones");
        }else if(antiguedad<10){
            System.out.println("Le corresponden 21 dias de vacaciones");
        }else if(antiguedad<20){
            System.out.println("le corresponden 28 dias de vacaciones");
        }else if(antiguedad>20){
            System.out.println("le corresponden 35 dias de vacaciones");
        }else{
            System.out.println("El empleado tiene vacaciones proporcioneles");
        }
    }
}
