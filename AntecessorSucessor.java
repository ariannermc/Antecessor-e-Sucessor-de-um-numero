import java.util.Scanner;

public class AntecessorSucessor {

    public static void calculo(int num, int[] antecessor, int[] sucessor) {
        antecessor[0] = num - 1;
        sucessor[0] = num + 1;
    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        
        int num;
        int[] A = new int[1];
        int[] S = new int[1];

        System.out.print("Digite um número: ");
        num = as.nextInt();

        calculo(num, A, S);

        System.out.println("O antecessor do número é: " + A[0]);
        System.out.println("O sucessor do número é: " + S[0]);

        as.close();
    }
}
