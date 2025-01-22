public abstract class Printer {
    private final Validator validator;
    private final Builder builder;

    public Printer(Validator validator, Builder builder) {
        this.validator = validator;
        this.builder = builder;
    }

    protected Validator getValidator() {
        return validator;
    }

    protected Builder getBuilder() {
        return builder;
    }

    public abstract String getText(int size);
}
