//this is whole about the if else
public class main {

    public static void main(String[] args){

        /*
           if(condition){
            code
           }
         */

        //  if
        int age = 20;
        if(age > 18 ){
            System.out.println("Age is greater than 18");
        }

        System.out.println("------------");

        //if and else
        int n = 13;
        if(n%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }

        System.out.println("------------");

        //leeap year
        int year = 2024;
        if(((year%4==0) && (year% 100 !=0)) || (year% 400 == 0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Common Year");

        }
        System.out.println("------------");

        // Using Ternary Operator

        int num = 13;
        String output = (num % 2 ==0) ? "even num": "odd num";
        //select by itself
        System.out.println(output);

        System.out.println("------------");

        // Java if-else-if ladder Statement
        // if(condition1){  
        //     //code to be executed if condition1 is true  
        //     }else if(condition2){  
        //     //code to be executed if condition2 is true  
        //     }  
        //     else if(condition3){  
        //     //code to be executed if condition3 is true  
        //     }  
        //     ...  
        //     else{  
        //     //code to be executed if all the conditions are false  
        //     }  


        // ex of ladder

        int marks=65;  
      
        if(marks<50){  
            System.out.println("fail");  
        }  
        else if(marks>=50 && marks<60){  
            System.out.println("D grade");  
        }  
        else if(marks>=60 && marks<70){  
            System.out.println("C grade");  
        }  

        else if(marks>=70 && marks<80){  
            System.out.println("B grade");  
        }

        else if(marks>=80 && marks<90){  
            System.out.println("A grade");  
        }
        else if(marks>=90 && marks<100){  
            System.out.println("A+ grade");  
        }
        else{  
            System.out.println("Invalid!");  
        }  

        if(n > 0){
            System.out.println("POSTIVE");

        }
        else if(n < 0){

            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        System.out.println("------------");

        // Java Nested if statement
    //     if(condition){    
    //         //code to be executed    
    //              if(condition){  
    //                 //code to be executed    
    //        }    
    //    }  

    int wght = 80;
    if(age >= 18){
        if(wght> 50){
            System.out.println("You are eligible to donate blood");
        }
    }


    System.out.println("------------");
    

    }

    
}
