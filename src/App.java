import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double primerNumero, segundoNumero;

        System.out.println("Ingrese el primer número:");
        primerNumero = sc.nextDouble();

        System.out.println("Ingrese el segundo número:");
        segundoNumero = sc.nextDouble();

        if (primerNumero > segundoNumero) {
            System.out.println("El primer número (" + primerNumero + ") es mayor.");
        } else if (primerNumero < segundoNumero) {
            System.out.println("El segundo número (" + segundoNumero + ") es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
         sc.close();

    }
}

