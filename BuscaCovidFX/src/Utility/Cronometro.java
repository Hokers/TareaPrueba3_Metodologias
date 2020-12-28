/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Hokers
 */
public class Cronometro implements ActionListener {
    public int segundos;
    public int minutos;
    public Timer cronometro;
    
    public Cronometro()
    {
        segundos = 0;
        minutos = 0;
        cronometro = new Timer(1000,this);
        
    }
    
    public void IniciarCronometro()
    {
        cronometro.start();
    }
    public void ReiniciarCronometro()
    {
        segundos = 0;
        minutos = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       segundos ++;
       if(segundos == 60)
       {
           minutos ++;
           segundos = 0;
           
       }
       System.out.println(minutos+ " " + segundos);
    }
}
