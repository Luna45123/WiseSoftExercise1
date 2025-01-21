public class Butterfly extends PrintPattern {
    private final int size;
    private final ButterflyPrinter printer;

    public Butterfly(int size) {
        this.size = size;
        Validator validator = new InputValidator();
        Builder builder = new BuildButterfly();
        this.printer = new ButterflyPrinter(validator, builder);
    }

    @Override
    public void printShape() {
        System.out.println(printer.print(size));
    }
}