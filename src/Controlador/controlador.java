/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CajeroThread;
import Modelo.cliente;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andre
 */
public class controlador implements ActionListener{
    cliente cliente1;
    CajeroThread cajera1;
    cliente cliente2;
    CajeroThread cajera2;    
    Formulario form=new Formulario();

    public controlador() {
        this.form.getjButton1().addActionListener(this);
        this.form.getjButton2().addActionListener(this);
    }

    public void iniciar(){
        this.form.setLocationRelativeTo(null);
        this.form.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.form.getjButton1()){
            long initialTime= System.currentTimeMillis();
            cliente1=new cliente(this.form.getjTextField1().getText(), new int[]{2, 2, 1, 5, 2, 3});
            cajera1 = new CajeroThread(this.form.getjTextField2().getText(),cliente1, initialTime);
                    cajera1.start();
                                
            
        }
        if(e.getSource()==this.form.getjButton2()){
            long initialTime= System.currentTimeMillis();
            cliente2=new cliente(this.form.getjTextField3().getText(), new int[]{2, 2, 1, 5, 2, 3});
            cajera2 = new CajeroThread(this.form.getjTextField4().getText(),cliente2, initialTime);
                    cajera2.start();
                                
            
        }        
    }
    
    
}
