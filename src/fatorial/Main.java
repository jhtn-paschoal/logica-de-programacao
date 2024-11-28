package fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("Fatorial");

        //Loop para repetir aplicação
        while (continuar) {
            boolean numeroValido = false;
            int numero = 0;
            
            //Loop para verificar o número digitado
            while (!numeroValido) {
                //Tratamento para valor do tipo double
                try {                    
                    System.out.print("Digite um número inteiro: ");
                    numero = sc.nextInt();
                    
                    //Verificando se o número é positivo
                    if(numero < 0) {
                        System.out.println("Número inválido. Digite um número positivo.");
                    } else {
                        numeroValido = true;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Erro. O número digitado deve ser inteiro.");
                    sc.nextLine(); //Limpando buffer
                }
            }

            exibirFatorial(numero);

            System.out.print("Deseja inserir novos valores? (s/n): ");
            sc.nextLine();
            String repetir = sc.nextLine().trim().toLowerCase();

            if(!repetir.equals("s")) {
                continuar = false;
            }
        }

        System.out.println("Aplicação encerrada!");
        sc.close();
    }

    //Método para exibir o fatorial
    private static void exibirFatorial(int numero) {
        System.out.print("Cálculo: ");
        int resultado = calcularFatorial(numero);
        System.out.println("= " + resultado);
    }

    //Método para calcular o fatorial
    private static int calcularFatorial(int numero) {
        int fatorial = 1;

        if(numero == 0) {
            return fatorial;
        }

        for(int i = numero; i > 0; i--) {
            fatorial *= i;

            System.out.print(i);

            if(i != 1) {
                System.out.print(" x ");
            }
        }
        return fatorial;
    }
}