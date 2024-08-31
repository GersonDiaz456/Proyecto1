

package Ventana;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Alumno {
    //definicion de variables
    private String nombre;
    private int edad;
    
    //Creacion de Metodo nombre
     public void leerNombre(Scanner entrada) {
        nombre = entrada.nextLine();
    }
// retorno del Metodo
    public String getNombre() {
        return nombre;
    }
//Creacion del Metodo Edad
    public void leerEdad(Scanner entrada) {
        edad = entrada.nextInt();
    }

    public int getEdad() {
        return edad;
    }
 
    
    
    
}
