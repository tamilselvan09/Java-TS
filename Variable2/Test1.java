package Variable2;
          //instant & variable
public class Test1 {

       int a = 100;
       int b = 200;
static int c = 300;

   public static void main(String[] args) {
    Test1 t1 = new Test1();
    Test1 t2 = new Test1();

    System.out.println(Test1.c);   //300

    System.out.println(c);    //300
    System.out.println(t1.a);  //100
    System.out.println(t2.b);  //200
  //  t2.c = 10000;
    //System.out.println(t1.c);  //10000
    System.out.println(c);  //10000

    
   }


    
}
