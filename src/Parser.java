public class Parser {
    public Person parse(String input) throws DataFormatException {
        String[] parts = input.split("\\s+");
        if (parts.length != 6) {
            throw new DataFormatException("Неверное количество аргументов. Ожидалось 6, получено " + parts.length);
        }


        String lastName = parts[0];
        String firstName = parts[1];
        String middleName = parts[2];
        String birthDate = parts[3];
        long phoneNumber;
        char gender;

        if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new DataFormatException("Неверный формат даты рождения. Ожидается dd.mm.yyyy");
        }

        try {
            phoneNumber = Long.parseLong(parts[4]);
        } catch (NumberFormatException e) {
            throw new DataFormatException("Неверный формат номера телефона");
        }

        if (!parts[5].matches("[fm]")) {
            throw new DataFormatException("Пол должен быть указан как 'f' или 'm'");
        }
        gender = parts[5].charAt(0);

        return new Person(lastName, firstName, middleName, birthDate, phoneNumber, gender);
    }
}
