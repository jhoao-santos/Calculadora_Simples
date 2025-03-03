import java.util.Scanner;

public class calculadoraSimples { // Nome da classe corrigido

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operacao");
        System.out.println("1) Adicao (+)");
        System.out.println("2) Subtracao (-)");
        System.out.println("3) Multiplicacao (*)");
        System.out.println("4) Divisao (/)");

        int operacao = scanner.nextInt();
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = adicionar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break; 
            case 3:
                resultado = multiplicar(num1, num2);
                break; 
            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                } else {
                    System.out.println("Divisao por 0 nao permitida!");
                    break;
                }
                break;     
            default:
                System.out.println("Operacao invalida!");
                scanner.close();
                return;
        }

        // Exibir o resultado se a operação for válida
        System.out.println("O resultado da operacao e: " + resultado);

        scanner.close();
    }

    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
