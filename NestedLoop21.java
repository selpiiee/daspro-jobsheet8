import java.util.Scanner;

public class NestedLoop21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + (i + 1));
            for (int j = 0; j < temps[0].length; j ++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i< temps.length; i++) {
            double total = 0;
            System.out.println("City: " + (i +1));
            for (double t : temps[i]) {
                System.out.print(t + " ");
                total += t;
            }
            double avg = total / temps[i].length;
            System.out.println("\nAverage temperature for city " + i + ": " + avg);
            System.out.println();
        }

        scanner.close();
    }
} 