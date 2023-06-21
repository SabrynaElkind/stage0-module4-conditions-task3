package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        if (salary < 10000) {
            double tax = (salary / 100) * 15;
            double salary2 = salary - tax;
            System.out.println(salary2);
        }
        else if (salary > 10000 && salary <= 20000) {
            double tax2 = (salary / 100) * 18;
            double salary3 = salary - tax2;
            System.out.println(salary3);
        }
        else if (salary > 20000) {
                double tax3 = (salary / 100) * 20;
                double salary4 = salary - tax3;
                System.out.println(salary4);
            }
        else if (salary<=0){

                    System.out.println("wrong input!");

                }

            }


            }



