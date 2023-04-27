package Employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = (this.salary < 1000) ? 0 : this.salary * 0.03;
        return tax;
    }

    double bonus() {
        if (workHours >= 40) {
            double bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    double raiseSalary() {
        double raise;
        if (2021 - hireYear < 10) {
            raise = this.salary * 0.05;
        } else if (2021 - hireYear > 9 && 2021 -hireYear < 20) {
            raise = this.salary * 0.1;
        } else {
            raise = this.salary * 0.15;
        }
        return raise;
    }

    void printEmployee() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Vergi : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam maaş : " + (this.salary + raiseSalary()));
    }
}
