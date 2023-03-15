/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tecnologia_Tarea_1;
/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        auto nuevoauto = new auto();
System.out.println(nuevoauto.getMarca());
nuevoauto.setMarca("Toyota");
System.out.println(nuevoauto.getMarca());

nuevoauto = new auto("Ford",50);
System.out.println(nuevoauto.getMarca());
nuevoauto.circular(15);
System.out.println(nuevoauto.getCombustible());
nuevoauto.cargar(50);
System.out.println(nuevoauto.getCombustible());
nuevoauto.circular(8);
nuevoauto.circular(4);
System.out.println(nuevoauto.getCombustible());

    }
    
}
