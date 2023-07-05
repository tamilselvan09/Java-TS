class Test{
    private double min_Bal; 
    //we can't private method outside the class so we want public method
    //so we generate or create the setter and getter

    public double get_Min_Bal(){
        return this.min_Bal;
    }
    public void set_Min_Bal(double bal){
        this.min_Bal = bal;
    }

//public class Test1{
    public static void main(String[] args){
        Test a1 = new Test();
       // Account a2 = new Account();

        a1.set_Min_Bal(1000.00);
        System.out.println(a1.get_Min_Bal());
    }
}