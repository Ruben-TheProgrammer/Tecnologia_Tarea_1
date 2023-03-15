/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tecnologia_Tarea_1;

/**
 *
 * @author Usuario
 */
public class auto {
    private String marca;
  private int combustible;

public auto(String pmarca, int pcombustible){
marca = pmarca;
combustible = pcombustible;
}

public auto(){
}

public String getMarca(){
return marca;
}

public int getCombustible(){
return combustible;
}

public void setMarca(String marcarecibida){
marca=marcarecibida;
}

public void setCombustible(int pcombustible) {
combustible = pcombustible;
}

public void circular(int km){
combustible = combustible - 2*km;
}

public void cargar(int litros){
combustible = combustible+litros;
}
}
    

