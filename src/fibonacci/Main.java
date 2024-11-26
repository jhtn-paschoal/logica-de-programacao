package fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        int numero = 0;

        System.out.println("Fibonacci");

        //Loop para inserir novos valores
        while (continuar) {
            boolean validarNumero = false;

            //Loop para garantir que o número digitado pelo usuário seja válido
            while (!validarNumero) {  
                //Tratamento para valores double  
                try {
                    System.out.print("Digite um número: ");
                    numero = sc.nextInt();
                    
                    //Condição para aceitar apenas valores positivos
                    if(numero <= 0){
                        System.out.println("Número inválido. Tente um número positivo.");
                    } else {
                        validarNumero = true;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Apenas números positivos são válidos. Tente outro.");
                    sc.nextLine();
                }
            }

            //Chamar método sequenciaFibonacci
            gerarSequenciaFibonacci(numero);

            System.out.print("Deseja inserir um novo número? (s/n): ");
            sc.nextLine();
            String repetir = sc.nextLine().trim().toLowerCase();

            if(!repetir.equals("s")){
                continuar = false;
            }
        }

        System.out.println("Operação finalizada.");
        sc.close();
    }

    //Método para exibir a sequência Fibonacci
    private static void gerarSequenciaFibonacci(int numero) {
        int a = 1, b = 1, soma = 0;

        System.out.print("Sequência de Fibonacci {1, 1");
        for(int i = 3; i<=numero; i++){
            soma = a + b;
            System.out.print(", " + soma);
            a = b;
            b = soma;
        }
        System.out.println("}");
    }
}