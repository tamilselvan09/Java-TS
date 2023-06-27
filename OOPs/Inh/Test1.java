class parent{
    public void m1(){}
    public void m2(){}
}
class child extends parent{
    public void m3(){}
}

public class Test1{
     public static void main(String[] args){
        child c1=new child();

              c1.m1();
              c1.m2();
              c1.m3();
        
     }
}


//creating child class obj