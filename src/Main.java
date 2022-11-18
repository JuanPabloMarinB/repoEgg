import Entidades.Cadena;
import Servicios.CadenaServicio;

public class Main {

    public static void main(String[] args) {

        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.crearCadena();
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1);
        cs.compararLongitud(c1);
        cs.unirFrases(c1);
        cs.reemplazar(c1);
        cs.contiene(c1);

    }
}