/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author andre
 */
public class CajeroThread extends Thread{
    private String nombre;
    private cliente cliente;
    private long initialTime;

    public CajeroThread(String nombre, cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
    
    @Override
    public void run(){
        
        System.out.println("La cajera "+this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                                       + this.cliente.getNombre()+ "EN EL TIEMPO: "
                                       + ((System.currentTimeMillis()-this.initialTime)/1000
                                       + "Seg"));
        for (int i=0;i<this.cliente.getCarrocompra().length;i++){
                       this.esperarXsegundos(cliente.getCarrocompra()[i]);
                       System.out.println("Procesado el producto "+(i+1)
                       +" del cliente "+this.cliente.getNombre()+"->Tiempo: "
                       +((System.currentTimeMillis()-this.initialTime)/1000
                       +"Seg"));
        }
    }
    private void esperarXsegundos(int segundos){
        try{
            Thread.sleep(segundos * 1000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }    
}
