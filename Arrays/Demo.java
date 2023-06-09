package Arrays;

public class Demo {
    public static void main(String[] args) {
        int[ ] ids;
        ids = new int[4];

        System.out.println(ids[0]);  //0
        System.out.println(ids[1]);  //0 
        System.out.println(ids[2]);  //0
        System.out.println(ids[3]);  //0


        ids[0] =101;
        ids[1] =102;
        ids[2] =103;
        ids[3] =104;

        System.out.println(ids[0]);  //101
        System.out.println(ids[1]);  //102 
        System.out.println(ids[2]);  //103
        System.out.println(ids[3]);  //104


    }
    
}
