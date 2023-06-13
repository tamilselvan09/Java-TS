package Operators;

public class Test1 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
//this expecting int but we declare byte so its  incompatiable type error
    
        //byte c = a + b ;  // max(int, byte ,bytr )

        int c = a + b;  //30
        System.out.println(c);
    }
}
