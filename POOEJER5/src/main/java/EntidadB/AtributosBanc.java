/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadB;

/**
 *
 * @author portatil
 */
public class AtributosBanc {
    private int numeroCuenta;
    private long DNIcliente;
    private int saldoActual;
    
    public AtributosBanc(int numeroCuenta, long DNIcliente, int saldoActual){
        this.numeroCuenta = numeroCuenta; 
        this.DNIcliente = DNIcliente;
        this.saldoActual = saldoActual;
    }
    
    public AtributosBanc(){
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNIcliente() {
        return DNIcliente;
    }

    public void setDNIcliente(long DNIcliente) {
        this.DNIcliente = DNIcliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
    
}
