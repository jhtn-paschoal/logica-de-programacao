import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double n1 = 0.;
        double n2 = 0.;
        double n3 = 0.;
        double media = 0.;
        boolean repetir = true;

        System.out.println("Média do Aluno");

        while (repetir) {
            System.out.println("Digite as 3 notas do aluno abaixo:");
            
            System.out.print("Nota 1: ");
            n1 = sc.nextDouble();
            while (n1 > 10 || n1 < 0) {
                System.out.println("O valor digitado é inválido, digite novamente.");
                System.out.print("Nota 1: ");
                n1 = sc.nextDouble();
            }
            
            System.out.print("Nota 2: ");
            n2 = sc.nextDouble();
            while (n2 > 10 || n2 < 0) {
                System.out.println("O valor digitado é inválido, digite novamente.");
                System.out.print("Nota 2: ");
                n2 = sc.nextDouble();
            }


            System.out.print("Nota 3: ");
            n3 = sc.nextDouble();
            while (n3 > 10 || n3 < 0) {
                System.out.println("O valor digitado é inválido, digite novamente.");
                System.out.print("Nota 3: ");
                n3 = sc.nextDouble();
            }

            media = (n1 + n2 + n3) / 3;

            System.out.printf("Média do aluno: %.2f%n",  media);

            if(media >= 7.0){
                System.out.println("Aprovado");
            } else if(media >= 5.0) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }

            sc.nextLine();

            System.out.println("Deseja inserir a nota de outro aluno? (S/N)");
            String resposta = sc.nextLine().trim().toLowerCase();
            if(!resposta.equals("s")) {
                repetir = false;
            } else {
                repetir = true;
            }
        }

    }
}
