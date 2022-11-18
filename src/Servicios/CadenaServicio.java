package Servicios;

import Entidades.Cadena;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CadenaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {

        Cadena c1 = new Cadena();

        System.out.println("Ingresa una frase");
        c1.setFrase(sc.next());
        c1.setLongitud(c1.getFrase().length());

        return c1;
    }

    public int mostrarVocales(Cadena c1) {
        int cantidadVocales = 0;

        List<String> vocales = Arrays.asList("a", "e", "i", "o", "u");

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (vocales.contains(c1.getFrase().substring(i, i + 1).toLowerCase())) {
                cantidadVocales++;
            }
        }
        System.out.println("La cantidad de vocales que hay en la frase ingresada es: " + cantidadVocales);

        return cantidadVocales;

    }

    public void invertirFrase(Cadena c1) {

        String[] cadena = new String[c1.getLongitud()];

        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            cadena[i] = c1.getFrase().substring(i, i + 1);
            System.out.print(cadena[i]);
        }
        System.out.println();

    }

    public int vecesRepetido(Cadena c1) {
        int contador = 0;

        System.out.println("Ingresa la letra que quieras buscar");
        String letra = sc.next();

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }

        System.out.println("La cantidad de veces que se repite la letra '" + letra + "' es: " + contador);

        return contador;
    }

    public void compararLongitud(Cadena c1) {
        System.out.println("Ingresa una nueva frase");
        c1.setNuevaFrase(sc.next());
        c1.setLongitudNuevaFrase(c1.getNuevaFrase().length());

        if (c1.getLongitud() == c1.getLongitudNuevaFrase()) {
            System.out.println("Ambas frases tienen la misma longitud");
        } else {
            System.out.println("Ambas frases no tienen la misma longitud");
        }

    }

    public void unirFrases(Cadena c1) {

        String frasesUnidas = c1.getFrase().concat(" - " + c1.getNuevaFrase());
        System.out.println(frasesUnidas);

    }

    public String reemplazar(Cadena c1) {

        System.out.println("¿Por cual letra quieres reemplazar la 'a'?");
        String reemplazoLetraA = sc.next();

        String letraReemplazada = c1.getFrase().replace("a", reemplazoLetraA);

        System.out.println(letraReemplazada);


        return letraReemplazada;
    }

    public boolean contiene(Cadena c1){

        boolean contiene = false;

        System.out.println("Ingresa una letra y te diré si la frase la contiene");
        String letraContenida = sc.next();

        if (c1.getFrase().contains(letraContenida)) {
            contiene = true;
            System.out.println("La frase contiene la letra '" + letraContenida + "'");
        } else {
            System.out.println("La frase no contiene la letra '" + letraContenida + "'");
        }

        return contiene;
    }

}
