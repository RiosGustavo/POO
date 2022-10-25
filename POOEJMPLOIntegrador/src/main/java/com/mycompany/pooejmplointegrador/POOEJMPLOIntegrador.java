
package com.mycompany.pooejmplointegrador;

import Entidades.Vendedor;
import Servicio.vendedorServicio;

/**
 *
 * @author portatil
 */
public class POOEJMPLOIntegrador {

    public static void main(String[] args) {
        vendedorServicio vs = new vendedorServicio();
        
        Vendedor v1 = vs.altaVendedor();
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
    }
}
