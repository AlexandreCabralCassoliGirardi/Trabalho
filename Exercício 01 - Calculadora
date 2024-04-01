import java.util.Scanner;

public class Calculadora {
    
    public static double adi(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double sub(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double mul(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Adição: " + adi(num1, num2));
        System.out.println("Subtração: " + sub(num1, num2));
        System.out.println("Multiplicação: " + mul(num1, num2));
        System.out.println("Divisão: " + div(num1, num2));
        
        scanner.close();
    }
}
