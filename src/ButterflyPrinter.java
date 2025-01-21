public class ButterflyPrinter {
    private final Validator validator;
    private final Builder builder;

    public ButterflyPrinter(Validator validator, Builder builder) {
        this.validator = validator;
        this.builder = builder;
    }

    public String print(int size) {
        if (validator.isValidInput(size) && validator.isEven(size)) {
            return builder.buildShape(size);
        } else {
            return "Invalid input";
        }
    }
}
