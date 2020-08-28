package Trabajoenclase;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        // Determinamos el tamaño del Arreglo
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(" digite el tamaño del arreglo"));

        int numero1[] = new int[tamaño]; //definimos el tamaño ingresado

        for (int i = 0; i < tamaño; i++) { // rellenamos el arreglo

            numero1[i] = Integer.parseInt(JOptionPane.showInputDialog(" ingrese" + (i + 1) + "numero"));

        }

        Atributos_Metodos ob1 = new Atributos_Metodos(numero1);

        ob1.ImprimirArreglo(); //invocamos al metodo para validar hay numeros repetidos
        
        ob1.validar(); // mostramos si gano el premio o siga participando
        
         
    }

}
