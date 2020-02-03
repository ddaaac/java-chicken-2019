package view;

import exceptions.Validator;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputService() {
        OutputView.printService();
        String input = scanner.nextLine();
        try {
            Validator.validateInputService(input);
        } catch (Exception e) {
            OutputView.printError(e);
            return inputService();
        }
        return input;
    }

    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }
}
