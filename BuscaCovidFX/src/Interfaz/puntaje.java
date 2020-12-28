/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Francisco
 */
public class puntaje {
    int casillas;
    
    public puntaje(){
        this.casillas=0;
        
    }
    public void sumaPuntaje(int p){
        this.casillas= this.casillas+p;
    }
    public int getPuntaje(){
        return casillas;
    }
    public void descubiertas(){
        System.out.println("Casillas descubiertas: "+ casillas);
    }
}
