package Trabajoenclase;

  // Mora Gonzalez Kevin Daniel

import java.util.Random;

import javax.swing.JOptionPane;

public class Atributos_Metodos {
        // atributos
    private  int[] num;

    public Atributos_Metodos(int[] num) {// metodo constructor
        this.num = num;
    }

    public void ImprimirArreglo() { // validamos si los numeros ingrsados no se repitan 
                                        //(si recorremos el for (j) y encontramos numeros repetidos los cambiamos )
            //12324
        for (int i = 0; i < num.length; i++) { // i=0,
            System.out.println("aray ingresado" + num[i]);//j=0,j=2
            for (int j = 0; j < num.length - 1; j++) {
                if (i != j) {
                    if (num[i] == num[j]) {// i=2 j=2
                        JOptionPane.showMessageDialog(null, "hay un Numero(s) repetido Cambielo");

                        num[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero"));

                    } else {
                        
                    }
                }
            }

        }

    }

    public void validar() { // generamos el numero randon y con las condiciones 
                                // mostramos el mensaje si es igual a random gano un premio sino siga participando

        Random r = new Random();
        int ram = r.nextInt(15 + 1);

        System.out.println("randon" + ram);

        for (int i = 0; i < num.length; i++) {
            System.out.print("->" + num[i]);
            if (num[i] == ram) {
                System.out.println("-------Felicisades gaste el premio ");

            } else {
                System.out.println("---------Sigue participando");
            }

        }

    }

}
