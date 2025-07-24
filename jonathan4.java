import java.util.Scanner;

public class jonathan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        int[] VetorOriginal = new int[10];
        int[] VetorInvertido = new int[10];

        for (i = 0; i <= 9; i++) {
            System.out.printf("Digite %d° numero do Vetor Original: ", (i + 1));
            while (!sc.hasNextInt()) {
                System.out.println("Tente novamente!Digite apenas números inteiros!");
                System.out.printf("Digite %d° numero do Vetor Original: ", (i + 1));
            }
            VetorOriginal[i] = sc.nextInt();
        }

        System.out.println(" ");

        int i1 = 0, j1 = 9 ;

        while (i1<=9 && j1 >= 0){
            VetorInvertido[i1] = VetorOriginal[j1];
            i1++;
            j1--;
        }

        System.out.print("Vetor Original = [ ");
        for (i = 0; i <= 9; i++) {
            System.out.printf(" %d ",VetorOriginal[i]);
        }
        System.out.print(" ]");

        System.out.println(" ");

        System.out.print("Vetor Invertido = [ ");
        for (i = 0; i <= 9; i++) {
            System.out.printf(" %d ",VetorInvertido[i]);
        }
        System.out.print(" ]");
        sc.close();
    }

}
