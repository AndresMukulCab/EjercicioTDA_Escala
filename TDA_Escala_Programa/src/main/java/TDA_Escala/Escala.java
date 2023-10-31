
package TDA_Escala;

/**  
 *
 * @author andre
 */
import java.util.Scanner;

public class Escala {
    private String unidad1;
    private String unidad2;
    private double factorEquivalencia;

    public Escala(String unidad1, String unidad2, double factorEquivalencia) {
        this.unidad1 = unidad1;
        this.unidad2 = unidad2;
        this.factorEquivalencia = factorEquivalencia;
    }

    public String toString() {
        return "Escala: " + unidad1 + " a " + unidad2 + " (Factor de Equivalencia: " + factorEquivalencia + ")";
    }

    public void imprimirEscalaUnidadPorUnidad() {
        System.out.println("Unidad 1: " + unidad1);
        System.out.println("Unidad 2: " + unidad2);
        System.out.println("Factor de Equivalencia: " + factorEquivalencia);
    }

    public void modificarEscala(String unidad1, String unidad2, double factorEquivalencia) {
        this.unidad1 = unidad1;
        this.unidad2 = unidad2;
        this.factorEquivalencia = factorEquivalencia;
    }

    public double convertirValor(double valor, String unidadOrigen, String unidadDestino) {
        if (unidadOrigen.equals(unidad1) && unidadDestino.equals(unidad2)) {
            return valor * factorEquivalencia;
        } else if (unidadOrigen.equals(unidad2) && unidadDestino.equals(unidad1)) {
            return valor / factorEquivalencia;
        } else {
            throw new IllegalArgumentException("Unidades no compatibles en la escala.");
        }
    }

   
}
