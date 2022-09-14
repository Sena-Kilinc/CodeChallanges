public class Employee {
    String name;
    double salary;
    int workHours,hireYear;
    double tax;
    double bonus;
    double raise;

    public Employee(String name, double salary, int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        tax();
        bonus();
        raiseSalary();
    }

    public double tax(){
        if (this.salary<=1000){
            return 0;
        }else {
            this.tax = this.salary*0.03;
            return this.tax;
        }
    }

    public void bonus(){
        if (this.hireYear>=40){
            this.bonus = (this.workHours -40) *30;
        }
    }

    public double raiseSalary(){

        int totalYear= 2021-this.hireYear;
        if (totalYear<=10){
            this.raise = this.salary * 0.05;

        }else if(totalYear>10 && totalYear<=19){
            this.raise = this.salary * 0.1;

        }else{
            this.raise = this.salary * 0.15;
        }
        return this.raise;
    }

    @Override
    public String toString() {
        return "Name : "+ this.name +"\n"+
                "Salary : "+ this.salary +"\n"+
                "Work Hours : "+ this.workHours +"\n"+
                "Start Date : "+ this.hireYear +"\n"+
                "Tax : "+ this.tax +"\n"+
                "Bonus : "+ this.bonus +"\n"+
                "Raise : "+ this.raise +"\n"+
                "Tax and Bonus with Salary: "+ (this.salary+this.bonus-this.tax) +"\n"+
                "Total Salary : "+ (this.salary+this.raise+this.bonus-this.tax) +"\n";
    }
}
