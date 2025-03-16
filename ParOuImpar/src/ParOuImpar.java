import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Par ou Ímpar (Digite 0 para sair)");

        while(true){
            System.out.print("Digite um número: ");
            number = sc.nextInt();
            
            if(number == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            if(ehPar(number)){
                System.out.println("O número digitado é par.");
            } else {
                System.out.println("O número digitado é ímpar.");
            }
        }
            
        sc.close();
    }

    //Método para determinar se o número é par
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}
