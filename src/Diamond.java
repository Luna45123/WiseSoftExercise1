public class Diamond extends PrintPattern {
    private final int size;
    private final DiamondPrinter printer;

    public Diamond(int size) {
        this.size = size;
        Validator validator = new InputValidator();
        Builder builder = new BuildDiamond();
        this.printer = new DiamondPrinter(validator, builder);
    }

    @Override
    public void printShape() {
        System.out.println(printer.getText(size));
    }
}