
package TDA_Escala;
import java.util.Scanner;
/**
 *
 * @author andre
 */

public class PruebaEscala {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera unidad: ");
        String unidad1 = scanner.nextLine();

        System.out.print("Introduce la segunda unidad: ");
        String unidad2 = scanner.nextLine();

        System.out.print("Introduce el factor de equivalencia: ");
        double factorEquivalencia = scanner.nextDouble();

        Escala escala = new Escala(unidad1, unidad2, factorEquivalencia);

        System.out.println("Escala creada:");
        System.out.println(escala.toString());
    }
}
