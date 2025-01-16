public class Diamond {
    private final int number;

    Diamond(int number) {
        this.number = number;
    }

    public void PrintDiamond() {
        if ((number > 0 && number <= 50) && (number % 2 != 0)) {
            print(number);
        } else {
            System.out.println("Input value is incorrect. Please enter it again.");
        }
    }

    private void print(int number) {
        int i, row, spaces;
        number = number / 2 + 1;
        spaces = number - 1;
        // Upper part
        for (row = 1; row <= number; row++) {
            for (i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }
            spaces--;
            for (i = 1; i <= 2 * row - 1; i++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        spaces = 1;

        // Lower part
        for (row = 1; row <= number - 1; row++) {
            for (i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }
            spaces++;
            for (i = 1; i <= 2 * (number - row) - 1; i++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

}
