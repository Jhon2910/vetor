import java.util.Scanner;

class jonathan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, q;
        int soma = 0;

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº valor do vetor 1: ", (i + 1));
            while (!sc.hasNext()) {
                System.out.println("Digite um valor inteiro!");
                System.out.printf("Digite o %dº valor do vetor 1: ", (i + 1));
                sc.next();
            }
            vet1[i] = sc.nextInt();
        }
        for (j = 0; j < 10; j++) {
            System.out.printf("Digite o %dº valor do vetor 2: ", (j + 1));
            while (!sc.hasNext()) {
                System.out.println("Digite um valor inteiro!");
                System.out.printf("Digite o %dº valor do vetor 2: ", (j + 1));
                sc.next();
            }
            vet2[j] = sc.nextInt();
        }

        System.out.print("\n----------------------------------------");
        for (k = 0; k <= 9; k++) {
            if (k == 0) {
                System.out.printf("\nvet1 = [ %d ", vet1[0]);
            } else if (k == 9) {
                System.out.printf(" %d ]", vet1[9]);
            } else {
                System.out.printf(" %d ", vet1[k]);
            }

        }
        System.out.print("\n----------------------------------------");
        for (q = 0; q <= 9; q++) {
            if (q == 0) {
                System.out.printf("\nvet2 = [ %d ", vet2[0]);
            }
            else if (q == 9) {
                System.out.printf(" %d ]", vet2[9]);
            }
            else {
                System.out.printf(" %d ", vet2[q]);
            }
        }
        System.out.print("\n----------------------------------------");
        for (){

        }
        sc.close();
    }
}
