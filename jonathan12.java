import java.util.Scanner;//terminar

public class jonathan12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int i, j;

        System.out.print("Digite até quando voce quer digitar: ");
        while (!sc.hasNextInt()) {
            System.out.print("Digíte apenas numeros inteiros!");
            System.out.print("Digite até quando voce quer digitar: ");
            sc.next();
        }
        j = sc.nextInt();

        int vet[] = new int[j];

        for (i = 0; i < j; i++) {
            System.out.printf("Digite o %dº numero: ", i + 1);
            while (!sc.hasNextInt()) {
                System.out.println("Digite apenas numeros inteiros! ");
                System.out.printf("Digite o %dº numero: ", i + 1);
            }
            vet[i] = sc.nextInt();
        }

        for (i = 0; i < j; i++) {
            for (int c = 0; c < i; c++) {
                if (vet[i] < vet[i + 1]) {
                    int aux = vet[i + 1];
                    vet[i] = aux;

                }
            }
        }

        sc.close();
    }
}
