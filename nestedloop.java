
import java.util.Scanner;

public class nestedloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose: ");
        int Task = sc.nextInt();

        switch (Task) {
            case 1:
                Assignment.A();
                break;
            case 2:
                Assignment.B();
                break;
            case 3:
                Assignment.C();
                break;
        }

    }
}

class Assignment {

    static void A() {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    static void B() {
        char alphabet = 'a';
        int lettersInRow = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= lettersInRow; j++) {
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println();
            lettersInRow += 2;
        }

    }

    static void C() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum n: ");
        int max_n = sc.nextInt();

        for (int n = 1; n <= max_n; n++) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i * i;
            }
            System.out.println("n = " + n + " → sum of squares = " + sum);
        }

        sc.close();
    }
}
