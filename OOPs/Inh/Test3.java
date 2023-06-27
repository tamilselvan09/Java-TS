class parent{
    public void m1(){}
    public void m2(){}
}
class child extends parent{
    public void m3(){}
}
public class Test3{
    public static void main(string[] args){
        child obj=new parent(); //child can't hold parent 
        obj.m1();               // so we can't excicute, incompatible type
    }
}