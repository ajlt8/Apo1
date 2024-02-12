import java.util.Scanner;

public class EjercicioClase6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String saborHelado; // Declarar correctamente la variable
        System.out.println("¿Cuál es tu sabor de helado favorito? ");
        saborHelado = in.nextLine();

        System.out.println("Tu sabor elegido fue: " + saborHelado); // Corregir el nombre de la variable

        double porcentajeComision;

        System.out.println("¿Cuál es el porcentaje de comisión en la venta?");

        porcentajeComision = in.nextDouble();

        System.out.println("Tu porcentaje de comisión es " + porcentajeComision);
    }
}
