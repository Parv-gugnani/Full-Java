package Basics.ArrayList;


import java.util.ArrayList;




public class man{

    public static void main(String[] args){

        
        // ArrayList<DataType> arrayListInstance = new ArrayList<DataType>();
        ArrayList<String> arrl = new ArrayList<>();

        System.out.println(arrl);

        arrl.add("Hey");
        arrl.add("this");

        System.out.println(arrl);

        arrl.remove("Hey");

        System.out.println(arrl.size());
        
        arrl.clear();


        System.out.println(arrl);
        
        
        
        


        
        
    }
}
