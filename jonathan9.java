
import java.util.Scanner;

public class jonathan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fichas[] = new int[5];
        double altura[] = new double[5];
        int sexo[] = new int[5];
        int i;
        int codigo[] = new int[5];
        double x = 0, y = 0;
        double media = 0, mediaH = 0, mediaM = 0;
        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        int quantM = 0;
        int quantH = 0;
        double acima = 0;
        double abaixo = 0;
        double soma = 0;

        for (i = 0; i < altura.length; i++) {
            System.out.printf("\nDigite a altura do aluno %d em metros : ", i + 1);
            while (!sc.hasNextDouble()) {
                System.out.println("\nDigite um numero valido! ");
                System.out.printf("\nDigite a altura do aluno %d em metros : ", i + 1);
                sc.next();
            }
            altura[i] = sc.nextDouble();

            if (altura[i] > maior) {
                maior = altura[i];
            }
            if (altura[i] < menor) {
                menor = altura[i];
            }

            if (altura[i] < 0) {
                System.out.print("Digite um numero positivo!");
                i--;
            } else {
                System.out.print("Digite o sexo (1 para masculino e 2 para feminino): ");
                while (!sc.hasNextInt()) {
                    System.out.print("Digite um numero inteiro!");
                    System.out.print("Digite o sexo (1 para masculino e 2 para feminino): ");
                    sc.next();
                }
                sexo[i] = sc.nextInt();

                if (sexo[i] < 1 || sexo[i] > 2) {
                    System.out.print("Digite apenas 1 ou 2!");
                    i--;
                } else {
                    if (sexo[i] == 1) {
                        quantH += 1;
                    } else {
                        quantM += 1;
                    }
                }
            }
            soma = altura[i] + altura[i++];
            media = soma / altura.length;

            mediaH = altura[i] / quantH;
            mediaM = altura[i] / quantM;

            acima = mediaM / quantH;
            abaixo = mediaH / quantH;

            if (sexo[i] > media) {
            }

        }

        System.out.printf("A maior altura é : %.2f", maior);
        System.out.printf("\nA menor altura é : %.2f", menor);
        System.out.printf("\nA média é :%.2f: ", media);
        System.out.printf("\nAs mulheres com a altura acima da media da altura dos homens: %.2f", acima);
        System.out.printf("\nOs homens com a altura abaixo da media das mulheres: %.2f", abaixo);

        sc.close();
    }
}
