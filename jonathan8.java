import java.util.Scanner;

public class jonathan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j, valor;
        int notaDoAluno[] = new int[22];
        int absoluta[] = new int[11];
        double relativa[] = new double[11];
        boolean erro = true;

        while (true) {
            for (i = 0; i < notaDoAluno.length; i++) {
                System.out.printf("\nDigite a nota do aluno %d: ", i + 1);
                while (!sc.hasNextInt()) {
                    System.out.print("\nDigite apenas numeros inteiros! ");
                    System.out.printf("\nDigite a nota do aluno %d: ", i + 1);
                    sc.next();
                }
                notaDoAluno[i] = sc.nextInt();
                valor = notaDoAluno[i];

                if (valor < 0 || valor > 10) {
                    System.out.print("\nErro!Digite uma nota entre e 0 e 10! ");
                    i--;
                    erro = false;
                } else {
                    for (j = 0; j <= 10; j++) {
                        if (valor == j) {
                            absoluta[j] += 1;
                        }
                    }
                }
            }
            for (i = 0; i <= 10; i++) {
                relativa[i] = (double) absoluta[i] / (double) notaDoAluno.length;
            }
            System.out.println("--------------------------------TABELA--------------------------------------");
            System.out.println("Nota                    Frequência Absoluta              Frequência Relativa");
            for (i = 0; i <= 10; i++) {
                System.out.println("\n------------------------------------------------------------------------");
                System.out.printf("\n%d                         %d                                 %d", i, absoluta[i], (int) (relativa[i] * 100));
            }
            System.out.println("\n-------------------------------------------------------------------------");
            return;
        }

    }
}
