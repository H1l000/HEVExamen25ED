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

        public static double restar (double a, double b){
            return a - b;
        }

        public static double dividir (double a, double b) {
            if (b != 0) {
                return a/b;
            }else{
                throw new IllegalArgumentException("No se puede dividir por cero");
            }

        }
        public static double raizCuadrada(double a){
            if (a>=0){
                return Math.sqrt(a);
            }else{
                throw new IllegalArgumentException("No se puede calcular la raiz cuadrada de " +
                        "un numero negativo");
            }
        }
    }
}
