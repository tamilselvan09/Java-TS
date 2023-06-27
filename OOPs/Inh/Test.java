class parent {
      
      public void m1(){}
      public void m2(){}
      
}

class child extends parent{

       public void m3(){}
}

public class Test{
       public static void main(String[] args){
        parent p1=new parent();  //creating parent obj
        p1.m1();
        p1.m2();
        //p1.m3();  //method not found
      } 
}


//due to inheritance parent has only 2 method , child has 3 method 