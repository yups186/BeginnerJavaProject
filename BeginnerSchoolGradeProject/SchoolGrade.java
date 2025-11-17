import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many subjects do you do?");

        int subjects = scanner.nextInt();

        if ((subjects > 3) || (subjects < 1)) {

            System.out.println("Unfortunately your request cannot be processed. We can only do 3 subjects.");

        }

        else {
        scanner.nextLine();

        String[] type = {"A", "B", "C"};

        int[] grades = new int[subjects];


        for (int i = 0; i < subjects; i++) {

            System.out.println("Please enter the grade for subject " + type[i]);

            grades[i] = scanner.nextInt();
            scanner.nextLine();


            }
            for (int i = 0; i < subjects; i++) {
                System.out.println("The grades for subject " + type[i] + " is " + grades[i]);
            }
        }
    }
}

