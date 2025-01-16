import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter 1 to run printDiamond Enter 2 to run printButterfly Enter 3 to exit: ");
            try {
                int input = sc.nextInt();
                switch (input) {
                    case 1 -> {
                        System.out.print("Enter number of rows (odd value only): ");
                        int numberDiamond = sc.nextInt();
                        Diamond diamond = new Diamond(numberDiamond);
                        diamond.PrintDiamond();
                    }
                    case 2 -> {
                        System.out.print("Enter number of rows (even value only): ");
                        int numberButterfly = sc.nextInt();
                        Butterfly butterfly = new Butterfly(numberButterfly);
                        butterfly.printButterfly();
                    }case 3 -> exit = true;
                    default -> System.out.println("No options found");
                }
            }catch (InputMismatchException e){ 
                System.out.println("Please enter a number.");
                sc.nextLine();
            }

        }
        sc.close();
    }

}