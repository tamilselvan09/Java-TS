package Variable2;
                //instant only
public class Test {
    int a = 100;
    int b = 200;
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        System.out.println(t1);  //@
        System.out.println(t2);  //@


        System.out.println(t1.a);  //100
        System.out.println(t2.a);  //100


        System.out.println(t1.b);  //200
        System.out.println(t2.b);  //200

       t1.a = 1000;

        System.out.println(t1.a);  //1000
        System.out.println(t2.b);  //200
    }
 }

