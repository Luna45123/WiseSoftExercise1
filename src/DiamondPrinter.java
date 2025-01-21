public class DiamondPrinter {
    private final Validator validator;
    private final Builder builder;

    public DiamondPrinter(Validator validator, Builder builder) {
        this.validator = validator;
        this.builder = builder;
    }

    public String getText(int size) {
        if (validator.isValidInput(size) && !validator.isEven(size)) {
            return builder.buildShape(size);
        } else {
            return "Invalid input";
        }
    }
}