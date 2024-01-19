import java.time.LocalDate;
import java.time.Month;

public class MainProgram {
    public enum Holiday {
        NONE, NEW_YEAR, WOMENS_DAY, MENS_DAY
    }

    public static void main(String[] args) {
        Customer[] customers = new Customer[]{
                new Customer("John Doe", 30, "123-456-7890", Gender.MALE),
                new Customer("Jane Smith", 25, "987-654-3210", Gender.FEMALE)
        };

        LocalDate currentDate = LocalDate.now();
        Holiday currentHoliday = determineCurrentHoliday(currentDate);
        congratulateEmployees(customers, currentHoliday);
    }

    private static Holiday determineCurrentHoliday(LocalDate currentDate) {
        Month currentMonth = currentDate.getMonth();
        int currentDay = currentDate.getDayOfMonth();

        if (currentMonth == Month.DECEMBER && currentDay == 31) {
            return Holiday.NEW_YEAR;
        } else if (currentMonth == Month.MARCH && currentDay == 8) {
            return Holiday.WOMENS_DAY;
        } else if (currentMonth == Month.FEBRUARY && currentDay == 23) {
            return Holiday.MENS_DAY;
        } else {
            return Holiday.NONE;
        }
    }

    private static void congratulateEmployees(Customer[] customers, Holiday currentHoliday) {
        for (Customer customer : customers) {
            switch (currentHoliday) {
                case NEW_YEAR:
                    System.out.println("Happy New Year, " + customer.getFio() + "!");
                    break;
                case WOMENS_DAY:
                    if (customer.getGender() == Gender.FEMALE) {
                        System.out.println("Happy Women's Day, " + customer.getFio() + "!");
                    }
                    break;
                case MENS_DAY:
                    if (customer.getGender() == Gender.MALE) {
                        System.out.println("Happy Men's Day, " + customer.getFio() + "!");
                    }
                    break;
                default:
                    // Нет поздравлений
                    break;
            }
        }
    }
}
