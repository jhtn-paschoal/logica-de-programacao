package somaDosNumeros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("Soma dos números");
        
        // Loop para inserir novo número
        while (continuar) {
            
            int numero = 0;
            boolean numeroValido = false;
            
            // Loop para garantir uma entrada válida de dados
            while (numeroValido == false) {
                try {
                    System.out.print("Digite um número inteiro positivo: ");
                    numero = sc.nextInt();// Tenta ler um número válido
                    
                    // Validação do número positivo
                    if(numero < 0) {
                        System.out.println("Número inválido! Digite um número positivo.");
                    } else {
                        numeroValido = true;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Número inválido! Digite um número inteiro.");
                    sc.nextLine();// Limpa a entrada inválida do scanner
                }
            }
            
            int soma = calcularSoma(numero);
            System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
        
            System.out.println("Inserir novo número? (s/n)");
            sc.nextLine();// Limpa o buffer do scanner
            String resposta = sc.nextLine().trim().toLowerCase();

            if(!resposta.equals("s")) {
                continuar = false;
            }
        }
        sc.close();
    }

    // Método para calcular a soma do número 1 até o valor fornecido
    private static int calcularSoma(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i; // Adiciona valor de i à soma
        }
        return soma;
    }
}