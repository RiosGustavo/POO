/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesStgring;

/**
 *
 * @author portatil
 */
public class AtributosCadena {
    private String Frase;
    private int LongitudFrase;

    public AtributosCadena(String Frase, int LongitudFrase) {
        this.Frase = Frase;
        this.LongitudFrase = LongitudFrase;
    }
    
    
    public AtributosCadena(){
        
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public int getLongitudFrase() {
        return LongitudFrase;
    }

    public void setLongitudFrase(int LongitudFrase) {
        this.LongitudFrase = LongitudFrase;
    }
    
    
    
    
}
