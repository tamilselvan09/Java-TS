class parent{
    public void m1(){}
    public void m2(){}
}
class child extends parent{
    public void m3(){}
}
public class Test3{
    public static void main(String[] args){
       child obj1=new child();
        //child obj=new parent(); //child can't hold parent , so we can't create obj 
        obj1.m1();               // so we can't excicute, incompatible type
    }
}