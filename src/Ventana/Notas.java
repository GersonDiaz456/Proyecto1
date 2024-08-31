
package Ventana;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Notas {
   //Declaracion de Variables 
    private int nota1, nota2, nota3, nota4;
    private double notaRecuperacion;
//creacion de Metodo Nota1
    public void setNota1(int nota1) {
       this.nota1=nota1; 
    }
    //metodo de retorno
    public int getNota1() {
        return nota1;
    }
    
    public void setNota2(int nota2) {
        this.nota2= nota2;
    }
    
    public int getNota2() {
        return nota2;
    }
    
    public void setNota3(int nota3) {
        this.nota3= nota3;
    }
    
    public int getNota3() {
        return nota3;
    }
    
    public void setNota4(int nota4) {
        this.nota4= nota4;
    }
    
    public int getNota4() {
        return nota4;
    }
    //metodo de promedio
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }
    //metodo de Evaluacion
    public String evaluarAlumno() {
        double promedio = calcularPromedio();
        
       if (promedio >= 61) {
        return "Alumno Aprobado";
    } else if (promedio >= 48 && promedio < 61) {
        return "Tiene derecho a recuperación";
    } else {
        return "El alumno no tiene derecho a recuperación";
    }
}
    
    
    
}
