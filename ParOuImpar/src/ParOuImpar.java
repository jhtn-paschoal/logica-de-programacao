import java.util.InputMismatchException;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Par ou Ímpar (Digite 0 para sair)");

        while(true){
            System.out.print("Digite um número: ");
            
            try {    
                number = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida! Digite apenas números inteiros.");
                sc.nextLine(); //Limpa o buffer de entrada
                continue; //Retorna ao início do loop
            }
            
            if(number == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            if(ehPar(number)){
                System.out.println("O número digitado é par.");
            } else {
                System.out.println("O número digitado é ímpar.");
            }

            System.out.println("-----------------------------------");
        }
            
        sc.close();
    }

    //Método para determinar se o número é par
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}
