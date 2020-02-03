import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Application {
    private static final String ORDER = "1";
    private static final String PAY = "2";
    private static final String EXIT = "3";


    public static void main(String[] args) {
        while (true) {
            String service = InputView.inputService();
            if (service.equals(ORDER)) {
                continue;
            }
            if (service.equals(PAY)) {
                continue;
            }
            if (service.equals(EXIT)) {
                return;
            }
        }
//        final List<Table> tables = TableRepository.tables();
//        OutputView.printTables(tables);
//
//        final int tableNumber = InputView.inputTableNumber();
//
//        final List<Menu> menus = MenuRepository.menus();
//        OutputView.printMenus(menus);
    }
}
