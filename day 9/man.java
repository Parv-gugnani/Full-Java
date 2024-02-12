//hashset
import java.util.*;
// 
// public class man {



// // Q2
//     private static void pinter(HashSet<Integer> hs1,HashSet<Integer> hs2){
//         for(int num:hs1){
//             // num
//             if(hs2.contains(num)==true){
//                 System.out.println(num);
//             }
//         }
//     }
//     public static void main(String[] args){
        // Syntax of HashSet
        // HashSet<DataType> setName = new HashSet<Type>();
        //int
        // it doesn't follow insertion order  or sorting order
        // HashSet<Integer> hs = new HashSet<>();
        //basics operations
        
        //add
        // hs.add(95);
        // hs.add(60);
        // hs.add(75);
        // hs.add(56);
        // hs.add(60);
        // hs.add(60);
        // hs.add(60);
        // this wont be added as it was already added
        // this will get ignored
        
        // System.out.print(hs);

        // searching an element

        // System.out.println(hs.contains(0));
        //if it is is there then it will give ture or it will false

        // Remove
        // hs.remove(60);
        // System.out.println(hs);

        //Size
        // hs.add(null);
        // System.out.println(hs);

        //Iterate Over all the elements
        // for each

        // for(DataType name: sourceDS){

        // }

        // for(Integer num: hs){
        //     System.out.println(num);
        //     //we use this when we think we can add null value
        // }

        // for(int num: hs){
        //     System.out.println(num);
        //     //we use this when wwe are not sure about null
        // }


        //Arraylist vs Hashset

        //arraylist :
        // -- sequential order
        // --
        
        //HashSet:
        // --
        // --


        // Q1 given an int array as input 
        // , its element to the hashset and return hasset
            //inpout:1,2,1,2
            //inpout:1,2

        
        
        //Q2 given two hasset as an input and print their
        // common elemt

        //input: hs1: 1,3,5,6
        //input: hs2: 2,3,4,6

        //output: 3 6

        // int[] arr = {3,4,5,6};


        // HashSet<Integer> hs1 = new HashSet<>();
        // HashSet<Integer> hs2 = new HashSet<>();

        // hs1.add(10);
        // hs1.add(12);
        // hs1.add(11);
        // hs1.add(10);

        // hs2.add(1);
        // hs2.add(2);
        // hs2.add(12);
        // hs2.add(2);

        // pinter(hs1,hs2);


//     }
    
// }




 
public class man {

    public static void main(String[] args){

        //Hashmap<Keytype>,valuetype> name = new Hashmap<>();
        HashMap<String,Integer> map = new HashMap<>();

        //basics operations

        //inserrt-----------

        map.put("Delhi",10);
        map.put("Haryana",15);
        map.put("Goa",10);
        map.put("Haryana",25);

        System.out.println(map);
        
        // no order same as it you put
        
        //check if key is present or not--------
        // System.out.println(map.containsKey("Delhi"));
        //checking

        //fetch coprresponding value associated with key
        // .get(key)

        // System.out.println(map.get("Delhi"));
        // // 
        // System.out.println(map.get("ABC"));
        
        
        //update the value: put()
        
        // map.put("Delhi",15);
        // System.out.println("thi is is after update"+map);


        // System.out.println(map.size());


        //remove:
        // map.remove("Delhi");
        // map.remove("Del");
        // System.out.println(map);

        //all the keys printing

        // System.out.println(map.keySet());

        // for(String str:map.keySet()){
        //     System.out.println("State = "+ str);
        // }

        // Q1
        //given an array as inpuyt return the corresponding frequncey  map

        //input: 1,4,3,-2,1,0,2,1,3,4

        //output: mainly to tell that how many timne occurance





}
    
}
