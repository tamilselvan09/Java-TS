package Variable2;

public class Emp {
    int emp_Id = 101;
    String emp_Names = "Rahul";
    static String emp_Org = "TCS";

    public static void main(String[] args) {
        Emp e1 = new Emp();
        Emp e2 = new Emp();

        System.out.println(e1);   //@
        System.out.println(e2);   //@

        System.out.println(emp_Org);   //TCS
       // System.out.println(e1.emp_Org);  //TCS
        System.out.println(Emp.emp_Org);   //TCS


        System.out.println(e1.emp_Id);   //101
        System.out.println(e2.emp_Names);   //Rahul
    }

    
}
