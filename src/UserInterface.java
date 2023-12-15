import java.util.Scanner;

public class UserInterface {
    private final DataManager dataManager;

    public UserInterface(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные (Фамилия Имя Отчество Дата рождения Номер телефона Пол):");
        String input = scanner.nextLine();

        try {
            dataManager.processInput(input);
        } catch (DataFormatException e) {
            System.out.println("Ошибка формата данных: " + e.getMessage());
        } catch (FileWriteException e) {
            e.printStackTrace();
        }
    }
}
