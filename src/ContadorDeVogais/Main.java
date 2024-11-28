package contadorDeVogais;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("Contador de Vogais");

        // Loop para repetir o programa
        while (continuar) {
            
            System.out.print("Digite uma palavra ou frase: ");
            String palavra = sc.nextLine().trim();

            if(palavra.isEmpty()){
                System.out.println("Entrada inválida! Insira uma palavra.");
                continue;
            }

            int contador = contadorDeVogais(palavra);

            if(contador == 0) {
                System.out.println("A palavra ou frase digitada não possui vogal.");
            } else if(contador == 1) {
                System.out.println("A palavra ou frase digitada possui 1 vogal.");
            } else {
                System.out.println("A palavra digitada possui " + contador + " vogais.");
            }

            System.out.print("Deseja executar novamente? (s/n): ");
            String repetir = sc.nextLine().trim().toLowerCase();

            if(!repetir.equals("s")){
                continuar = false;
            }
        }

        System.out.println("Fim da execução.");
        sc.close();
    }

    private static int contadorDeVogais(String palavra) {
        // Lista de todas vogais válidas
        String vogais = "aeiouáéíóúâêîôûãõàèìòù";
        
        int contador = 0;
        for(char charAtual : palavra.toLowerCase().toCharArray()) {
            if(vogais.indexOf(charAtual) != -1) {
                contador ++;
            }
        }

        return contador;
    }
}