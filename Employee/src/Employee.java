public class Employee {
    String name;
    int salary, workHours, hireYear, workingYear =0;
    double tax = 0 , bonus = 0, raiseSalary;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){ // Maaşa uygulanan vergiyi hesaplayacaktır.
       if (this.salary > 1000){
           this.tax = this.salary * 0.03;
       }
        return this.tax;
    }

    public double bonus(){
        if (this.workHours > 40){
            this.bonus = (this.workHours - 40 ) * 30;
        }
        return this.bonus;
    }

    public double raiseSalary(){

       this.workingYear = 2021 - this.salary;

        if (this.workingYear > 0 && this.workingYear < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (this.workingYear > 9 && this.workingYear < 20) {
            this.raiseSalary = this.salary * 0.1;
        } else if (this.workingYear > 19) {
            this.raiseSalary = this.salary * 0.15;
        }
        return this.raiseSalary;
    }

    public void toStr(){
        System.out.println("Adi : " + this.name);
        System.out.println("Maaşi : " + this.salary);
        System.out.println("Çalişma Saati : " + this.workHours);
        System.out.println("Başlangiç Yili : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Artişi : " + this.raiseSalary());
        System.out.println("Vergi Ve Bonuslar ile Birlikte Maaş : " + (this.salary + this.bonus - this.tax) );//
        System.out.println("Toplam Maas : " + (this.salary + this.raiseSalary));//
    }


}
