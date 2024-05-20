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

        pila.limpiarPila();
    }

    public static void main(String[] args) {


        palindromo("Anita lava la tina");
        palindromo("A luna ese anula.");
        palindromo("Anita ");
        palindromo("Anita atina mal");
        palindromo("Anita atina mal, a la tina");
        palindromo("Anita atina mal, a la tina, y a la tina, mal atina Anita.");
        palindromo("A Mercedes, ese de crema");
        palindromo("bateria");
        palindromo("bateria de cocina");
        palindromo("bateria de cocina, con aceite");
        palindromo("bateria de cocina, con aceite, y con arroz");
        palindromo("Hola");
        palindromo("Hola, ¿cómo estás?");
        palindromo("Hola, ¿cómo estás? ¿Todo bien?");
        palindromo("casa");
        ;
    }


}