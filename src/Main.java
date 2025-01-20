import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Enter 1 to run printDiamond, 2 to run printButterfly, 3 to exit: ");
            try {
                int choice = sc.nextInt();
                ShapePattern pattern = null;

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter number of rows (odd value only 1-50): ");
                        int numberDiamond = sc.nextInt();
                        pattern = new Diamond(numberDiamond);
                    }
                    case 2 -> {
                        System.out.print("Enter number of rows (even value only 1-50): ");
                        int numberButterfly = sc.nextInt();
                        pattern = new Butterfly(numberButterfly);
                    }
                    case 3 -> exit = true;
                    default -> System.out.println("No options found");
                }

                if (pattern != null) {
                    pattern.printPattern();
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine(); // Clear invalid input
            }
        }

        sc.close();
    }
}