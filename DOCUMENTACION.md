# Documentación del Proyecto

## Datos de Prueba
Aquí se presentan los datos de prueba utilizados para validar el funcionamiento de la aplicación:

| Nombre     | Edad | Nota 1 | Nota 2 | Nota 3 | Nota 4 | Promedio | Evaluación       |
|------------|------|--------|--------|--------|--------|----------|------------------|
Nombre: Hola!!!!!!!!!, Edad: 19, Nota1: 61, Nota2: 61, Nota3: 61, Nota4: 61, Promedio: 61.0
Nombre: Daniel, Edad: 19, Nota1: 61, Nota2: 61, Nota3: 61, Nota4: 61, Promedio: 61.0
Nombre: Ingeniero, Edad: 19, Nota1: 61, Nota2: 61, Nota3: 61, Nota4: 61, Promedio: 61.0

## Capturas de Pantalla estan en el PDF

##Codigo Fuente

package Ventana;
//importaciones del Main
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
//Creacion de Subclase de Jframe
public class Ventana extends JFrame {
//declaracion de variables
    private JPanel panel;
    private JTextField nombreTextField, edadTextField, nota1TextField, nota2TextField, nota3TextField, nota4TextField;
    private JLabel resultadoLabel, evaluacionLabel;
    private Notas notas;
    private double promedio;

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
//Creacion de la Ventana
    public Ventana() {
        //Instancia de Notas
        notas= new Notas();
        //Proporcion de la Ventana
        setSize(500,500);
        setTitle("Aprobacion de Alumnos");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
        //se llaman metodos mas adelante creados
        iniciarComponentes();
        colocarBotones();
    }
//Creacion de Metodo
    private void iniciarComponentes() {
        //instancia del Panel
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
 
        //Etiquetas
        JLabel nombreLabel = new JLabel("Nombre del Alumno");
        nombreLabel.setBounds(10, 20, 150, 25);
        panel.add(nombreLabel);
//Linea de Texto en el Panel
        nombreTextField = new JTextField(20);
        nombreTextField.setBounds(180, 20, 165, 25);
        panel.add(nombreTextField);

        JLabel edadLabel = new JLabel("Edad del Alumno");
        edadLabel.setBounds(10, 60, 150, 25);
        panel.add(edadLabel);

        edadTextField = new JTextField(20);
        edadTextField.setBounds(180, 60, 165, 25);
        panel.add(edadTextField);

        JLabel nota1Label = new JLabel("Nota 1");
        nota1Label.setBounds(10, 100, 150, 25);
        panel.add(nota1Label);

        nota1TextField = new JTextField(20);
        nota1TextField.setBounds(180, 100, 165, 25);
        panel.add(nota1TextField);

        JLabel nota2Label = new JLabel("Nota 2");
        nota2Label.setBounds(10, 140, 150, 25);
        panel.add(nota2Label);

        nota2TextField = new JTextField(20);
        nota2TextField.setBounds(180, 140, 165, 25);
        panel.add(nota2TextField);

        JLabel nota3Label = new JLabel("Nota 3");
        nota3Label.setBounds(10, 180, 150, 25);
        panel.add(nota3Label);

        nota3TextField = new JTextField(20);
        nota3TextField.setBounds(180, 180, 165, 25);
        panel.add(nota3TextField);

        JLabel nota4Label = new JLabel("Nota 4");
        nota4Label.setBounds(10, 220, 150, 25);
        panel.add(nota4Label);

        nota4TextField = new JTextField(20);
        nota4TextField.setBounds(180, 220, 165, 25);
        panel.add(nota4TextField);
    }
//Creacion de Metodo colocarBotones
    private void colocarBotones() {
 JButton botonCalcularPromedio = new JButton("Calcular Promedio");
        botonCalcularPromedio.setBounds(180, 260, 150, 25);
        panel.add(botonCalcularPromedio); //Creacion de Boton
        
        JButton botonGuardarDatos = new JButton("Guardar Datos");
        botonGuardarDatos.setBounds(180, 340, 150, 25);
        panel.add(botonGuardarDatos);// Otro Boton
        
        resultadoLabel= new JLabel("");
        resultadoLabel.setBounds(10, 300, 400, 25);
         panel.add(resultadoLabel);//Creacion de Linea Resultado
         
          evaluacionLabel = new JLabel("");
        evaluacionLabel.setBounds(10, 320, 400, 25);
        panel.add(evaluacionLabel);
        botonCalcularPromedio.addActionListener(e -> {
            String nombre= nombreTextField.getText();//almacenamiento del Texto en la variable Texto
            int edad = Integer.parseInt(edadTextField.getText());// Se Convierte los Strings en Enteros
             int nota1= Integer.parseInt(nota1TextField.getText());
             int nota2= Integer.parseInt(nota2TextField.getText());
            int nota3= Integer.parseInt(nota3TextField.getText());
            int nota4= Integer.parseInt(nota4TextField.getText());
            notas.setNota1(nota1);//Se Llama a los Metodos usados en Notas
            notas.setNota2(nota2);
            notas.setNota3(nota3);
            notas.setNota4(nota4);
            promedio= notas.calcularPromedio();//Llama al Metodo de Notas
            resultadoLabel.setText("El promedio es:"+promedio);//Impresion del Resultado
            //Se llama al metodo Evaluar Alumno
            String evaluacion= notas.evaluarAlumno();
            evaluacionLabel.setText(evaluacion);
                });
        //Creacion del Boton Guardar Datos
        botonGuardarDatos.addActionListener(e -> {
              String nombre= nombreTextField.getText();
            int edad = Integer.parseInt(edadTextField.getText());
             int nota1= Integer.parseInt(nota1TextField.getText());
             int nota2= Integer.parseInt(nota2TextField.getText());
            int nota3= Integer.parseInt(nota3TextField.getText());
            int nota4= Integer.parseInt(nota4TextField.getText());
            //Se crea el archivo
            Archivo.crearArchivo("datosAlumno.txt");
            Archivo.escribirDatos("datosAlumno.txt", nombre, edad, nota1, nota2, nota3, nota4, promedio);
        
        
        
        
        
        
        
        });
            
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
}