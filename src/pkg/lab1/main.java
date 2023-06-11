/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg.lab1;

/**
 *
 * @author Andres
 */
public class main {
    public static void main(String[] args) throws InterruptedException {
        
        Cliente Cliente_1 = new Cliente("Cliente_1", "Fabricio");
        Cliente Cliente_2 = new Cliente("Cliente_2","Gabriela");
        
        Vendedor vendedor_1 = new Vendedor("Cliente_1");
        Vendedor vendedor_2 = new Vendedor("Cliente_2");
        
        vendedor_1.setNombre("Fabricio");
        vendedor_2.setNombre("Gabriela");
        
        vendedor_1.start();
        vendedor_2.start();
        vendedor_2.join();
        Cliente_1.start();
        Cliente_2.start();
        
    }
}
