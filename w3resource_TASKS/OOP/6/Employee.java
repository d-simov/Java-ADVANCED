package Online_OOP_Tasks_W3._6;

public class Employee {

    private String name;
    private String jobTitle;
    private double paymentForDay;
    private int workdaysAtWork;
    private int holidayDaysAtWork;

    public Employee(String name, String jobTitle, double paymentForDay) {
        if (name.trim().length() > 1) {
            this.name = name;
        } else {
            this.name = "Unidentified worker";
        }
        if (jobTitle.trim().length() > 1) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "next employee";
        }
        if (paymentForDay >= 10 && paymentForDay <= 100000) {
            this.paymentForDay = paymentForDay;
        } else {
            this.paymentForDay = 100;
        }
    }

    public double getPaymentForDay() {
        return paymentForDay;
    }

    public void setPaymentForDay(double paymentForDay) {
        if (paymentForDay > 10 && paymentForDay < 100000) {
            this.paymentForDay = paymentForDay;
        } else {
            this.paymentForDay = 100;
        }
    }

    public int getWorkdaysAtWork() {
        return workdaysAtWork;
    }

    public void setWorkdaysAtWork(int workdaysAtWork) {
        if (workdaysAtWork >= 0 && workdaysAtWork <= 22) {
            this.workdaysAtWork = workdaysAtWork;
        } else {
            this.workdaysAtWork = 20;
        }
    }

    public int getHolidayDaysAtWork() {
        return holidayDaysAtWork;
    }

    public void setHolidayDaysAtWork(int holidayDaysAtWork) {
        if (holidayDaysAtWork >= 0 && holidayDaysAtWork <= 10) {
            this.holidayDaysAtWork = holidayDaysAtWork;
        } else {
            this.holidayDaysAtWork = 0;
        }
    }
    double calculateMonthSalary() {
        return (this.workdaysAtWork * this.paymentForDay + this.holidayDaysAtWork * this.paymentForDay * 2);
    }

    @Override
    public String toString() {
        return "Employee, named " +
                name + '\'' +
                ", with jobTitle: '" + jobTitle + '\'' +
                ", worked " + workdaysAtWork +
                ", workdays and " + holidayDaysAtWork +
                ", days in holidays for " + paymentForDay +
                " lv. per day.";
    }

    public String getName() {
        return name;
    }

    void raiseSalary (int percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.setPaymentForDay(this.getPaymentForDay() + this.getPaymentForDay() * percentage / 100);
            System.out.println(this.getName() + "'s salary is raised by " + percentage + "%.");
        } else {
            this.setPaymentForDay(this.getPaymentForDay() * 1.1);
            System.out.println(this.getName() + "'s salary is raised by 10 %.");
        }
    }
}
