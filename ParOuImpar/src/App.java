import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int number = 0;

        System.out.println("Par ou Ímpar");
        System.out.print("Digite um número: ");
        number = sc.nextInt();

        if(number%2==0){
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
    }
}
