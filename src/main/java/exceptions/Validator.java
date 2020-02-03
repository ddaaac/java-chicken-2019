package exceptions;

public class Validator {
    private static final String VALID_INPUT_SERVICE = "^[1-3]";

    public static void validateInputService(String input) throws Exception {
        if(!input.matches(VALID_INPUT_SERVICE)) {
            CustomException.NOT_VALID_INPUT_SERVICE.throwException();
        }
    }
}
