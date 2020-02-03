package exceptions;

public enum CustomException {
    NOT_VALID_INPUT_SERVICE("올바른 서비스를 선택해 주세요");

    private final Exception e;

    CustomException(String errMessage) {
        e = new Exception(errMessage);
    }

    public void throwException() throws Exception {
        throw e;
    }
}
