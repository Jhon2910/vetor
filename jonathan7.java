import java.util.Scanner;

public class jonathan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nulo = 0, par = 0, impar = 0;
        int i;
        double div;

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

            if (vet[i] <= 100 && sc.hasNextInt()) {
                if (vet[i] == 0) {
                    vet1[i] = nulo;
                } else if (vet1[i] % 2 != 0 || vet1[i] < 0) {
                    vet2[i] = vet[i];
                }else {
                    vet1[i] = vet[i];
                }

            } else {
                if (!sc.hasNextInt()) {
                    System.out.println("Digite apenas numeros inteiros!");
                } else {
                    System.out.println("Digite um número até 100!");
                }
                sc.next();
                i--;
            }
        }
        for (i=0;i < n-1;i++){
            par = vet1[i] + vet1[i+1];
            impar = vet2[i] + vet2[i+1];
        }
        div = (double) par / (double) impar;

        System.out.print(div);
        sc.close();
    }
}
