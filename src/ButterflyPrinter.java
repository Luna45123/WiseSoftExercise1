public class ButterflyPrinter extends Printer {
    public ButterflyPrinter(Validator validator, Builder builder) {
        super(validator, builder);
    }

    @Override
    public String getText(int size) {
        if (getValidator().isValidInput(size) && getValidator().isEven(size)) {
            return getBuilder().buildShape(size);
        } else {
            return "Invalid input";
        }
    }
}