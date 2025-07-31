
import java.util.Scanner;

public class jonathan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fichas[] = new int[5];
        double alturageral[] = new double[5];
        double alturaH = 0;
        double alturaM = 0;
        int sexo[] = new int[5];
        int i;
        int codigo[] = new int[5];
        double x = 0, y = 0;
        double media = 0, mediaH = 0, mediaM = 0;
        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        int quantM = 0;
        int quantH = 0;
        double soma = 0;

        for (i = 0; i < alturageral.length; i++) {
            System.out.printf("\nDigite a alturageral do aluno %d em metros : ", i + 1);
            while (!sc.hasNextDouble()) {
                System.out.println("\nDigite um numero valido! ");
                System.out.printf("\nDigite a alturageral do aluno %d em metros : ", i + 1);
                sc.next();
            }
            alturageral[i] = sc.nextDouble();

            if (alturageral[i] > maior) {
                maior = alturageral[i];
            }
            if (alturageral[i] < menor) {
                menor = alturageral[i];
            }

            if (alturageral[i] < 0) {
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
                        alturaH += alturageral[i];
                        mediaH = alturaH / quantH;
                        if (alturageral[i] < mediaM) {
                            double abaixo[] = new double[quantH];
                            for (int j = 0; j < quantH; j++) {
                                abaixo[j] = alturageral[i];
                            }
                        }
                    } else {
                        quantM += 1;
                        alturaM += alturageral[i];
                        if (alturaM[i] > mediaH) {
                            
                        }
                    }
                   
                    mediaM = alturaM / quantM;
                }
            }
            soma += alturageral[i];
        }

        media = soma / alturageral.length;
        
        System.out.printf("A maior alturageral é : %.2f", maior);
        System.out.printf("\nA menor alturageral é : %.2f", menor);
        System.out.printf("\nA média é :%.2f: ", media);
        System.out.printf("\nAs mulheres com a alturageral acima da media da alturageral dos homens: %.2f", acima);
        System.out.printf("\nOs homens com a alturageral abaixo da media das mulheres: %.2f", abaixo[j]);

        sc.close();
    }
}
