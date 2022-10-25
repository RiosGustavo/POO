package CyO5;

import ServicioB.MetodosBanc;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        MetodosBanc Banco = new MetodosBanc();

        String op = "n";

        System.out.println("Bienvenido a su Sucursal Bancaria Vitual");
        System.out.println("Por favor Ingrese sus Datos Personales:");
        Banco.IngresoDatos();

        System.out.println("Que Transaccion desea realizar ");

        do {
            System.out.println("MENU");
            System.out.println("1. Deposito Dinero en la cuenta ");
            System.out.println("2. Retiro Dinero de la cuenta");
            System.out.println("3. Retiro rapido Max 20% del saldo total");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            System.out.println("Elija una opcion");

            int op1 = leer.nextInt();

            switch(op1) {

                case 1:
                    Banco.Ingresar();
                    break;

                case 2:
                    Banco.Retirar();

                    break;

                case 3:
                    Banco.ExtraccionRapida();
                    
                    break;
                
                case 4:
                    Banco.consultarSaldo();
                    break;
                    
                case 5:
                                   
                    Banco.consultarDatos();
                    break;
                    
                case 6:
                    System.out.println("Salir s/n");
                    op = leer.next();
                    

            }

        } while (op.equalsIgnoreCase("n"));

    }

}
