/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probar_git;

/**
 *
 * @author martin
 */
public class Ciudad {
    //atributos
    private String nombre;
    private int poblacion;
    //constructor

    public Ciudad(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
