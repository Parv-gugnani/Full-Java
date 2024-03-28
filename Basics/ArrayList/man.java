package Basics.ArrayList;


import java.util.ArrayList;




public class man{

    public static void main(String[] args){

        
        // ArrayList<DataType> arrayListInstance = new ArrayList<DataType>();
        ArrayList<String> arr = new ArrayList<>();

        System.out.println(arr);

        arr.add("Hey");
        arr.add("this");

        System.out.println(arr);

        arr.remove("Hey");

        System.out.println(arr.size());
        
        arr.clear();


        System.out.println(arr);
        
        
        
        


        
        
    }
}
