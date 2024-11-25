package tabuada;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        
        System.out.println("Tabuada");
        
        //Loop para repetir execução
        while (continuar) {    
            int numero = 0;
            boolean validarNumero = false;
            
            //Loop para receber apenas valores válidos
            while (!validarNumero) {
                //Tratamento de valores double
                try {    
                    System.out.print("Digite um número inteiro para calcularmos a tabuada: ");
                    numero = sc.nextInt();
                    
                    //Verifica se o número inserido é maior ou igual a 0 
                    if(numero <= 0) {
                        System.out.println("Número inválido! O número digitado não pode ser negativo, tente outro.");
                    } else {
                        validarNumero = true;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Número inválido! Números com decimais não são aceitos, apenas números inteiros, tente outro.");
                    sc.nextLine();
                }
            }
                //Chamada do método para exibir a tabuada escolhida pelo usuário
                exibirTabuada(numero);
                
                System.out.print("Deseja inserir um novo valor? (s/n): ");
                sc.nextLine();
            String repetir = sc.nextLine().trim().toLowerCase();

            if(!repetir.equals("s")){
                continuar = false;
            }
        }

        System.out.println("Execução encerrada.");
        sc.close();
    }

    //Método que calcula e exibe resultado da tabuada
    private static void exibirTabuada(int numero){
        int resultado = 0;
        for (int i = 0; i <= 10; i++){
            resultado = i * numero;
            System.out.println(numero + " x " + i + "= " + resultado);
        }
    }
}