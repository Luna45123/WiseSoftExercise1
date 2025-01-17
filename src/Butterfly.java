public class Butterfly extends PrintPattern {

    public Butterfly(int number) {
        super(number);
    }

    @Override
    public void printPattern() {
        if (isValidInput() && number % 2 == 0) {
            int spaces = (2 * number) + 1;
            int numberOfPlus = 0;

            for (int i = 1; i <= 2 * number - 1; i++) {
                if (i <= number) {
                    spaces -= 2;
                    numberOfPlus++;
                } else {
                    spaces += 2;
                    numberOfPlus--;
                }

                // Print Plus
                printChars("+ ", numberOfPlus);

                // Print spaces or central "-"
                if (i == number) {
                    printChars("- ", 1); // Add "-" in the middle
                } else {
                    printChars("  ", spaces);
                }

                // Print Plus
                printChars("+ ", numberOfPlus);
                System.out.println();
            }
        } else {
            System.out.println("Input value is incorrect. Please enter it again.");
        }
    }
}