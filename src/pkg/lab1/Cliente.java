/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.lab1;

/**
 *
 * @author MARIA VALERIA J
 */
public class Cliente extends Thread {

    int[] productos = {1, 2, 3, 4, 5};
    String nombre;
    String vendedor;

    public Cliente(String nombre, String vendedor) {
        this.nombre = nombre;
        this.vendedor = vendedor;
    }

    public int getProductos() {
        return productos.length;
    }

    public void run() {
        long tiempoInicio = System.currentTimeMillis();

        for (int i = 1; i < getProductos() + 1; i++) {

            try {
                int rand = (int) (Math.random() * 5000);
                Thread.sleep(rand);
            } catch (Exception e) {
            }
            
            long tiempoFinal = System.currentTimeMillis();
            long tiempoEjecucion = (tiempoFinal - tiempoInicio) / 1000;
            System.out.println("Procesado el producto " + i + " del cliente " + nombre + " -> Tiempo: " + tiempoEjecucion + " segundos.");
        }
            long tiempoFinal = System.currentTimeMillis();
            long tiempoEjecucion = (tiempoFinal - tiempoInicio) / 1000;
        System.out.println("El vendedor " + vendedor + " HA TERMINADO DE PROCESAR " + nombre + " EN EL TIEMPO: " + tiempoEjecucion + " segundos");
    }
}
