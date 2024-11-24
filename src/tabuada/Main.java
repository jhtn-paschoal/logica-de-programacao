package tabuada;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        
        System.out.println("Tabuada");
        
        //Loop para repetir execução
        while (continuar) {    
            System.out.print("Digite um número inteiro para calcularmos a tabuada: ");
            int numero = sc.nextInt();
            
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