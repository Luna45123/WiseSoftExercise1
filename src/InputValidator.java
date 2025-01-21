public class InputValidator implements Validator {
    @Override
    public boolean isValidInput(int size) {
        return size > 0;
    }

    @Override
    public boolean isEven(int size) {
        return size % 2 == 0;
    }
}