import java.io.IOException;

public class DataManager {
    private final Parser parser = new Parser();
    private final FileService fileService = new FileService();

    public void processInput(String input) throws DataFormatException, FileWriteException {
        try {
            Person person = parser.parse(input);
            fileService.savePersonData(person);
        } catch (IOException e) {
            throw new FileWriteException("Ошибка при записи данных в файл", e);
        }
    }
}
