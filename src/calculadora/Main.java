package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean repetir = true;

        System.out.println("Calculadora");

        //Loop para inserir novos valores
        while (repetir) {
            //Chamada do método getValidDouble
            double numero1 = getValidDouble(sc, "Digite o 1° número: ");
            double numero2 = getValidDouble(sc, "Digite o 2° número: ");
            
            //Escolha de operação para ser realizada
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            
            int escolha = obterEscolha(sc);
            
            double resultado = calcular(numero1, numero2, escolha);
            System.out.println("Resultado = " + resultado);

            System.out.print("Deseja inserir novos valores? (s/n): ");
            sc.nextLine();//Limpando buffer do scanner
            String continuar = sc.nextLine().trim().toLowerCase();

            if(!continuar.equals("s")) {
                repetir = false;
            }
        }

        System.out.println("Aplicação encerrada.");
        sc.close();
    }

    //Método para garantir escolha válida
    private static int obterEscolha(Scanner scanner){
        int escolha;
        while (true) {
            System.out.print("Escolha uma operação (1-4): ");
            escolha = scanner.nextInt();
            if(escolha >= 1 && escolha <= 4) {
                break;
            }
            System.out.println("Opção inválida, tente novamente.");
        }

        return escolha;
    }

    //Método para fazer a operação escolhida
    private static double calcular(double numero1, double numero2, int escolha) {
        switch (escolha) {
            case 1:
                return numero1 + numero2;
            case 2:
                return numero1 - numero2;
            case 3:
                return numero1 * numero2;
            case 4:
                if(numero2 == 0) {
                    System.out.println("Divisão por zero não é permitida!");
                    return Double.NaN;
                }
                return numero1/numero2;
            default:
                throw new IllegalArgumentException("Operação inválida");
        }
    }

    //Método para não aceitar letras como dados de entrada
    private static double getValidDouble(Scanner scanner, String mensagem){
        double numero;
        while (true) {
            System.out.print(mensagem);
            if(scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                break;
            } else {
                System.out.println("Valor inválido, digite outro número.");
                scanner.next();
            }
        }
        return numero;
    }
}
