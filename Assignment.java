import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose: ");
        int Task = sc.nextInt();

        switch (Task) {
            case 1:
                Question.a();
                break;
            case 2:
                Question.b();
                break;
            case 3:
                Question.c();
                break;
            case 4:
                Question.d();
                break;
            default:
                System.out.println("Invalid!");
                ;
        }

    }
}

class Question {
    static void a () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (minimum 3): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }

    static void b () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (minimum 5): ");
        int N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    static void c (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (minimum 3): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(N + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    static void d () {
         Map<String, String[]> sports = new TreeMap<>();

        sports.put("Badminton", new String[]{"Sky", "OhmThi", "Tawan", "Tawinan", "Pakin"});
        sports.put("Basketball", new String[]{"Pond", "Phuwin", "Joss", "Gawin", "Jimmy"});
        sports.put("Table Tennis", new String[]{"Namtan", "Film", "View", "June", "Emy"});
        sports.put("Volleyball", new String[]{"Gemini", "Fourth", "Dew", "Tee", "Nani"});

        System.out.println("POLSEN National PORSENI 2024 Athletes:");
        for (String sport : sports.keySet()) {
            System.out.println("\n" + sport + ":");
            for (String athlete : sports.get(sport)) {
                System.out.println(" - " + athlete);
            }
        }
    }
}