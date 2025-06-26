import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Calculadora Básica");
        System.out.println("------------------");
        System.out.println("Operaciones disponibles:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
       
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
       
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
       
        System.out.print("Seleccione la operación (1-4): ");
        int operacion = scanner.nextInt();
       
        double resultado = 0;
        String operador = "";
       
        switch(operacion) {
            case 1:
                resultado = num1 + num2;
                operador = "+";
                break;
            case 2:
                resultado = num1 - num2;
                operador = "-";
                break;
            case 3:
                resultado = num1 * num2;
                operador = "*";
                break;
            case 4:
                if(num2 != 0) {
                    resultado = num1 / num2;
                    operador = "/";
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }
       
        System.out.println("Resultado: " + num1 + " " + operador + " " + num2 + " = " + resultado);
       
        scanner.close();
    }
}
