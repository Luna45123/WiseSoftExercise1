public class Diamond extends PrintPattern {

    public Diamond(int number) {
        super(number);
    }

    @Override
    public void printPattern() {
        if (isValidInput() && number % 2 != 0) {
            int mid = number / 2 + 1;
            for (int row = 1; row <= mid; row++) {
                printChars("  ", mid - row);
                printChars("+ ", 2 * row - 1);
                System.out.println();
            }
            for (int row = mid - 1; row >= 1; row--) {
                printChars("  ", mid - row);
                printChars("+ ", 2 * row - 1);
                System.out.println();
            }
        } else {
            System.out.println("Input value is incorrect. Please enter it again.");
        }
    }
}