public abstract class PrintPattern implements ShapePattern {
    protected final int number;

    public PrintPattern(int number) {
        this.number = number;
    }

    protected void printChars(String character, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(character);
        }
    }

    @Override
    public boolean isValidInput() {
        return number > 0 && number <= 50;
    }
}