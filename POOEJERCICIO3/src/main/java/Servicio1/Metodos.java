package Servicio1;

import Entidades1.Atributos;
import java.util.Scanner;

public class Metodos {

    Scanner leer = new Scanner(System.in);

    Atributos oper = new Atributos();

    public Atributos IngresoNumeros() {

        System.out.println("Ingrese Numero1");
        oper.setNum1(leer.nextInt());
        System.out.println("Ingrese Numero2");
        oper.setNum2(leer.nextInt());

        return oper;

    }

    public void Sumar() {
        System.out.println("La suma es: " + (oper.getNum1() + oper.getNum2()));

    }

    public void Restar() {
        System.out.println("La Resta es: " + (oper.getNum1() - oper.getNum2()));

    }

    public void Multiplicacion() {
        if (oper.getNum1() > 0 && oper.getNum2() > 0) {
            System.out.println("La Multiplicacion es: " + (oper.getNum1() * oper.getNum2()));

        } else {
            System.out.println("Error Multiplicacion por 0");
            int multi = 0;
            System.out.println(multi);
        }

    }

    public void Division() {
        if (oper.getNum2() == 0) {
            System.out.println("Error Division por 0");
            int div = 0;
            System.out.println(div);
        } else {
            System.out.println("La Division es: " + (oper.getNum1() / oper.getNum2()));

        }
    }

}
