public abstract class PrintPattern implements ShapePattern {
    protected final int number;
    StringBuilder pattern = new StringBuilder();
    public PrintPattern(int number) {
        this.number = number;
    }

    protected String printChars(String character, int count) {
        String temp;
        pattern.append(String.valueOf(character).repeat(Math.max(0, count)));
        temp = pattern.toString();
        pattern.delete(0, pattern.length());
        return temp;
    }

    @Override
    public boolean isValidInput() {
        return number > 0 && number <= 50;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }
}