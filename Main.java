

public class Main{
    int salary;
    int workHours;
    int inYear;
    int hireYear;
    public static void main(String[] args){
        
        Employee employee1 = new Employee("Ali", 2500, 45,2018);
        int salary = employee1.salary;
        int workHours = employee1.workHours;
        int hireYear = employee1.hireYear;
        
        System.out.print("Employee information: "+ employee1.name + employee1.salary + employee1.workHours + employee1.hireYear);
        System.out.print("Tax: ");
        tax(salary);
        System.out.print("Bonus: ");
        bonus(workHours);
        System.out.print("Raise: ");
        raiseSalary(hireYear, salary);

        

    }


        public static void tax(int salary){
            if(salary>1000){
                int newSalary = salary *3/100;
                System.out.print(newSalary);
                
            }else{
                System.out.print(salary);
            }
            return ;
        }

        public static void bonus(int workHours){
            if(workHours>40){
                int newBonus = (workHours -40) * 30;
                System.out.print(newBonus);
            }else {
                System.out.print(workHours);
            }
        }


        
        public static void  raiseSalary(int hireYear , int salary){
            int inYear =2021;
            int raise = inYear - hireYear;
            if(raise<10){
                int newSalary = salary + salary*5/100;
                System.out.print(newSalary);
            }
            if (raise>9 & raise<20){
                int newSalary = salary + salary*10/100;
                System.out.print(newSalary);
            }
        }
    

}