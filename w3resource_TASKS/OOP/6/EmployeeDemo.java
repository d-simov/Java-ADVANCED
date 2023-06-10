package Online_OOP_Tasks_W3._6;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee pesho = new Employee("Petar", " ", 18.5);
        Employee gosho = new Employee("Georgi", "mechanic", 60);
        Employee misho = new Employee("Mihail", "marketing manager", 250);

        pesho.setHolidayDaysAtWork(1);
        pesho.setWorkdaysAtWork(18);
        gosho.setWorkdaysAtWork(12);
        gosho.setHolidayDaysAtWork(5);

        System.out.println();
        System.out.println(pesho);
        System.out.println(gosho);
        System.out.println(misho);
        System.out.println();

        System.out.println(pesho.getName() + " earned " + pesho.calculateMonthSalary() + " leva this month.");
        System.out.println(gosho.getName() + " earned " + gosho.calculateMonthSalary() + " leva this month.");
        System.out.println(misho.getName() + " earned " + misho.calculateMonthSalary() + " leva this month.");

        pesho.raiseSalary(25);
    }
}
