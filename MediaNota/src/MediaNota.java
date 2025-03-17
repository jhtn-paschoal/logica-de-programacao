import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        System.out.println("Média do Aluno");

        while (repetir) {
            double[] notas = new double[3]; //Array para armazenar as 3 notas

            System.out.println("\nDigite as 3 notas do aluno:");

            //Loop para capturar e validar as notas
            for(int i = 0; i < 3; i++) {
                notas[i] = lerNota(sc,i + 1);
            }

            //Cálculo da média
            double media = (notas[0] + notas[1] + notas[2]) / 3;

            //Exibição dos resultados
            System.out.printf("Média do aluno: %.2f%n", media);
            exibirSituacao(media);
            
            //Consumir ENTER do nextdouble()
            sc.nextLine();

            //Inserir novas notas
            System.out.println("\nDeseja inserir a nota de outro aluno? (S/N)");
            repetir = sc.nextLine().trim().equalsIgnoreCase("s");
        }

        sc.close();
    }

    //Método para ler notas do aluno e validação dos dados
    private static double lerNota(Scanner sc, int numeroNota) {
        double nota;
        while (true) {
            System.out.println("Nota " + numeroNota + ": ");
            if (sc.hasNextDouble()) {
                nota = sc.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    return nota;
                }
                System.out.println("O valor digitado é inválido, digite novamente.");
            } else {
                System.out.println("Entrada inválida! Digite um número entre 0 e 10.");
                sc.next(); //Descarta a entrada inválida
            }
        }
    }

    //Método para exibir status do aluno
    private static void exibirSituacao(double media) {
        if(media >= 7.0) {
            System.out.println("Aprovado");
        } else if(media >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
