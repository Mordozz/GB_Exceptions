import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {

    public void savePersonData(Person person) throws IOException {
        String filename = person.lastName() + ".txt";

        try (FileWriter fileWriter = new FileWriter(filename, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.println(person);
        } catch (IOException e) {

            throw new IOException("Ошибка при записи в файл: " + filename, e);
        }
    }
}
