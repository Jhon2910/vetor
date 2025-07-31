
import java.util.Scanner;

public class jonathan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fichas[] = new int[50];
        double altura[] = new double[50];
        int sexo[] = new int[50];
        int i;
        int codigo[] = new int[50];
        double x ;
        double media;
        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;

        for (i = 0; i < altura.length; i++) {
            System.out.printf("\nDigite a altura do aluno %d em metros : ", i + 1);
            while (!sc.hasNextDouble()) {
                System.out.println("\nDigite um numero valido! ");
                System.out.printf("\nDigite a altura do aluno %d em metros : ", i + 1);
                sc.next();
            }
            altura[i] = sc.nextDouble();
            x = altura[i];
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
                   
                }
            }
        }
        if (x > maior){
            System.out.printf("O maior valor e %.2f",x);
        }

        sc.close();
    }
}
