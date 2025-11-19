import java.util.Scanner;

public class Main {
    public class MostrarNumeros{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor ingresa el primer numero: ");
            double numero1 = sc.nextDouble();
            System.out.println("Ahora, ingresa el segundo numero:");
            double numero2 = sc.nextDouble();
            System.out.println("Los números ingresados son:");
            System.out.println("Número 1: " + numero1);
            System.out.println("Numero 2:" + numero2);
            sc.close();
        }
    }
}
