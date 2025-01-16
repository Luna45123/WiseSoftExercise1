public class Butterfly {
    private final int number;

    Butterfly(int number) {
        this.number = number;
    }

    public void printButterfly() {
        if ((number > 0 && number <= 50) && (number % 2 == 0)) {
            print(number);
        } else {
            System.out.println("Input value is incorrect. Please enter it again.");
        }
    }

    private void print(int number) {
        // Variables to store number of spaces and numberOfPlus
        int spaces = (2 * number) + 1;
        int numberOfPlus = 0;

        for (int i = 1; i <= 2 * number - 1; i++) {
            //upper part
            if (i <= number) {
                spaces = spaces - 2;
                numberOfPlus++;
            }
            //lower part
            else {
                spaces = spaces + 2;
                numberOfPlus--;
            }
            // Print Plus
            for (int j = 1; j <= numberOfPlus; j++) {
                System.out.print("+ ");
            }
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                if (i != number) {
                    System.out.print("  ");
                }
            }
            if (i == number) {
                System.out.print("- ");
            }
            // Print Plus
            for (int j = 1; j <= numberOfPlus; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
