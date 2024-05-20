package org.example;
import org.example.Pilas.PilaLineal;

public class Main {

    public static void palindromo(String p) {
        PilaLineal pila = new PilaLineal();

        //convierte a minúsculas y luego elimina cualquier caracter que no sea una letra minúscula del alfabeto
        String palabra = p.toLowerCase().replaceAll("[^a-z]", "");
        String palabraInvertida = "";

        //creamos la pila con la palabra
        for (int i = 0; i < palabra.length(); i++) {
            try {
                pila.insertar(palabra.charAt(i));
            } catch (Exception ex) {
                System.out.println("problema al insertar!" + ex.getMessage());
            }
        }

        //se comprueba si es palindromo
        while (!pila.pilaVacia()) {
            try {
                palabraInvertida += pila.quitar();
            } catch (Exception ex) {
                System.out.println("error comprobando!");
            }
        }

        if (palabraInvertida.equals(palabra)) {
            System.out.println("simon, es un palindromo");
        } else {
            System.out.println("nel, no lo es");
        }


    }

    public static void main(String[] args) {
        palindromo("Anita lava la tina");
    }


}