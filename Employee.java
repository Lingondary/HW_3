import java.util.Comparator;

public class Employee {
    private String name;
    private String dateOfBirth;
    public static Comparator<Employee> dateComparator = (employee1, employee2) -> {
        String[] date1 = employee1.getDateOfBirth().split("-");
        String[] date2 = employee2.getDateOfBirth().split("-");

        // Сравнение по годам
        int year1 = Integer.parseInt(date1[0]);
        int year2 = Integer.parseInt(date2[0]);
        if (year1 != year2) {
            return Integer.compare(year1, year2);
        }

        // Сравнение по месяцам
        int month1 = Integer.parseInt(date1[1]);
        int month2 = Integer.parseInt(date2[1]);
        if (month1 != month2) {
            return Integer.compare(month1, month2);
        }

        // Сравнение по дням
        int day1 = Integer.parseInt(date1[2]);
        int day2 = Integer.parseInt(date2[2]);
        return Integer.compare(day1, day2);
    };

    public String getDateOfBirth() {
        return dateOfBirth;
    }

}