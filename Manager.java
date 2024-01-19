public class Manager extends Employee {
    public static void increaseSalaryForAllEmployees(Employee[] employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                // Повышение зарплаты для всех, кроме руководителей
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percentage / 100);
                employee.setSalary(newSalary);
            }
        }
    }
}