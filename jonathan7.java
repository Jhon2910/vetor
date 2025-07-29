import java.util.Scanner;

public class jonathan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, par = 0, impar = 0;
        int i = 0;
        double div;

        while (i < Integer.MAX_VALUE) {

            System.out.print("Digite quantos numeros gostaria de digitar: ");
            while (!sc.hasNextInt()) {
                System.out.print("Digite apenas números inteiros!");
                System.out.print("Digite quantos numeros gostaria de digitar: ");
                sc.next();
            }
            n = sc.nextInt();

            int vet[] = new int[n];
            int vet1[] = new int[n];
            int vet2[] = new int[n];

            for (i = 0; i < n; i++) {
                System.out.printf("Digite o %d° numero até 100: ", i + 1);
                vet[i] = sc.nextInt();

                if (vet[i] <= 100) {

                    if (vet[i] % 2 == 0 || vet[i] >= 0) {
                        vet1[i] = vet[i];
                        if (i < n - 2) {
                            par = vet1[i] + vet1[i + 1];
                        }
                    } else {
                        vet2[i] = vet[i];
                        if (i < n - 2) {
                            impar = vet2[i] + vet2[i + 1];
                        }
                    }

                    div = (double) par / (double) impar;

                    System.out.print(div);
                }
                else{
                    System.out.println("Digite um número até 100!");
                    sc.next();
                }
            }
            sc.close();
        }
    }
}
