/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades1;

/**
 *
 * @author portatil
 */
public class Atributos {
    private  int Num1;
    private int Num2;
    
    public Atributos(int Num1, int Num2){
        this.Num1 = Num1;
        this.Num2 = Num2;
        
    }
    
    public Atributos(){
        
        
    }

    public int getNum1() {
        return Num1;
    }

    public void setNum1(int Num1) {
        this.Num1 = Num1;
    }

    public int getNum2() {
        return Num2;
    }

    public void setNum2(int Num2) {
        this.Num2 = Num2;
    }
}
