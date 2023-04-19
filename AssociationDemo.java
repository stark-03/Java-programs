import java.util.Scanner;

class SmartCard{
    int emp_idn;
    public void MarkAttendance(Employee e){
        emp_idn = e.getEmpid(); //instructions to mark present for empid
        System.out.println("Employee " + emp_idn + " is Marked present!");
    }


public int getEmpidn(Employee e){
    return e.empid;
}
}

class Employee{
    int empid;
    Employee(){
        System.out.println("Enter employee id: ");
        Scanner sc = new Scanner(System.in);
        this.empid = sc.nextInt();
        sc.close();
    }
    int getEmpid()
    {
        return empid;
    }
    public void Login(SmartCard sc)
    {
        int eid = sc.getEmpidn(this);
        System.out.println("Login Successfull for employee: "+eid);
    }
}

public class AssociationDemo {
    public static void main(String[] args){
        System.out.println("***ASSOCIATION BETWEEN EMPLOYEE AND SMARTCARD***");
        Employee e = new Employee();
        System.out.println("New Employee is created!");
        SmartCard scd = new SmartCard();
        scd.MarkAttendance(e);
        e.Login(scd);
        
    }
}
