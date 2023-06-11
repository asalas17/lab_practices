/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.lab1;

/**
 *
 * @author MARIA VALERIA J
 */
public class Vendedor extends Thread {

    String nombre;
    String clienteAsignado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vendedor(String clienteAsignado) {
        this.clienteAsignado = clienteAsignado;
    }

    public void run() {
        System.out.println("El vendedor " + getNombre() + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + clienteAsignado + " EN EL TIEMPO: " + 0 + " segundos");
    }
}
