//Leer datos del usuario con scanner
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Bienvenido a la calculadora.");
            System.out.println("Seleccione una opción para continuar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Seleccione el primer número");
                    double numero1 = scanner.nextInt();
                    System.out.println("Seleccione el segundo número");
                    double numero2 = scanner.nextInt();
                    double suma = numero1+numero2;
                    System.out.println("La suma es: "+ suma);
                    break;

                case 2:
                    System.out.println("Seleccione el primer número");
                    double minuendo = scanner.nextInt();
                    System.out.println("Seleccione el segundo número");
                    double sustraendo = scanner.nextInt();
                    double resta = minuendo - sustraendo;
                    System.out.println("La resta es: "+ resta);
                    break;
                case 3:
                    System.out.println("Seleccione el primer número");
                    double multi1 = scanner.nextInt();
                    System.out.println("Seleccione el segundo número");
                    double multi2 = scanner.nextInt();
                    double mult = multi1*multi2;
                    System.out.println("La multiplicación es: "+ mult);
                    break;
                case 4:
                    System.out.println("Seleccione el primer número");
                    double dividendo = scanner.nextInt();
                    System.out.println("Seleccione el segundo número");
                    double divisor = scanner.nextInt();
                    double dividir = dividendo / divisor;
                    System.out.println("La división es: "+ dividir);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                default:
                    System.out.println("Seleccione una opción válida");
            }


        } while(opcion !=5);
    }

    }
