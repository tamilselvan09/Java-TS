class parent{
    public void m1(){}
    public void m2(){}
}

class child extends parent{
    public void m3(){}
}
public class Test2{
    public static void main(String[] args){
        parent c2=new child ();  //parent can hold child
        c2.m1();
        c2.m2();
       // c2.m3();  //we can declare parent so we cant access child class member
    }
}