public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        UserInterface ui = new UserInterface(dataManager);
        ui.start();
    }
}
