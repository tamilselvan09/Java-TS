//method signature is same that mean overriding--m1

class Test{
    public void m1(){
        System.out.println("m1() method with zero argument");
    }
    public void m1(int a){
        System.out.println("m1() method with integer argument");
    }
    public void m1(String s){
        System.out.println("m1() method with string argument");
    }
    public static void main(String[] args) {
        Test a1=new Test();
        a1.m1();  //m1() method with zero argument
        a1.m1(1);  //m1() method with integer argument
        a1.m1("Tamil");   //m1() method with string argument

    }
}