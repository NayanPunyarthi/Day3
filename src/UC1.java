//Check Employee is Present or Absent
public class UC1 {
        public static void main(String[] args) {
            double empCheck = Math.floor(Math.random()*10)%2;
            if(empCheck == 1)
                System.out.println("employee is present");
            else
                System.out.println("employee is absent");
        }

}