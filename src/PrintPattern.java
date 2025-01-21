public abstract class PrintPattern implements ShapePattern {
//    protected final int number;
    StringBuilder pattern = new StringBuilder();

    protected boolean isEven(int size) {
        return size % 2 == 0;
    }
    @Override
    public boolean isValidInput(int size) {
        return size > 0 && size <= 50;
    }
}