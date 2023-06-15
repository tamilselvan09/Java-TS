package Iterative;

public class Two {
    public static void main(String[] args) {
        int[] ids = {101,102,103,104,};  //4

        String[ ]  enames = {"Rahul", "Sonia", "Priya", "Modi"};


            
       System.out.println(ids);   //@
       System.out.println (enames);   //@
    
       System.out.println(ids[0]);  //101


       //Iterative using for loop

       for (int i = 0; i< ids.length; i++) {  //if u add = that mean arrayindexoutofbounds exception so dont use =
        System.out.println(ids[i]);  //101,102,103,104
       }


    }


}


