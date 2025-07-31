import java.util.Scanner;

public class jonathan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int alunos[] = new int[5];
        int i, j;
        double altura[] = new double[5];
        int sexo[] = new int[5];
        double maior, menor, aux;
        double soma = 0;

        for (i = 0; i < altura.length; i++) {
            System.out.printf("\nDigite a altura do aluno %d em metros : ", i + 1);
            while (!sc.hasNextDouble()) {
                System.out.println("\nDigite um numero valido! ");
                System.out.printf("\nDigite a altura do aluno %d em metros : ", i + 1);
                sc.next();
            }
            altura[i] = sc.nextDouble();
            if (altura[i] < 0) {
                System.out.print("Digite um valor positivo!");
                i--;
            }
        }

        for (i = 0; i < sexo.length; i++) {
            System.out.printf("\nDigite o sexo do aluno %d(1 para masculino e 2 para feminino): ", i + 1);
            while (!sc.hasNextInt()) {
                System.out.print("\nDigite um numero inteiro!");
                System.out.printf("\nDigite o sexo do aluno %d(1 para masculino e 2 para feminino): ", i + 1);
                sc.next();
            }
            sexo[i] = sc.nextInt();
            if (sexo[i] < 1 && sexo[i] > 2) {
                System.out.print("\nDigite apenas 1 ou 2!");
                i--;
            }
        }

        for (i = 0; i < alunos.length - 1; i++) {
            for (j = 0; j < alunos.length - 1 - i; j++) {
                if (altura[j] > altura[j + 1]) {
                    aux = altura[j];
                    altura[j] = altura[j + 1];
                    altura[j + 1] = aux;
                }
            }
        }

        for (i = 0; i < alunos.length; i++) {
            soma += alunos[i];
        }

        double media = soma/args.length;

        alturas(altura,media);
    }

    public static void alturas(double []altura,double media){
        System.out.printf("\nA menor altura e : %.2f", altura[0]);
        System.out.printf("\nA maior altura e : %.2f", altura[altura.length - 1]);
        System.out.printf("\nA media e : %.2f", media);
    }
}
