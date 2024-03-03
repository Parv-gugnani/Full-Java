// This is all about the switch statement

public class man {

    
    public static void main(String[] args){
        // switch(expression){    
        //     case value1:    
        //      //code to be executed;    
        //      break;  //optional  
        //     case value2:    
        //      //code to be executed;    
        //      break;  //optional  
        //     ......    
                
        //     default:     
        //       code to be executed if all cases are not matched;  
        //     }    

        //ex - 1

        int n = 20 ;
        switch (n) {
            case 10:System.out.print("10");
            break;
            case 20:System.out.print("20");
            break;
            case 30:System.out.print("30");
            break;

            default:System.out.println("Not in 10 , 20 , 30");
            
        }

        //month example -2
        int month=7;    
    String monthString="";  
    //Switch statement  
    switch(month){    
    //case statements within the switch block  
    case 1: monthString="1 - January";  
    break;    
    case 2: monthString="2 - February";  
    break;    
    case 3: monthString="3 - March";  
    break;    
    case 4: monthString="4 - April";  
    break;    
    case 5: monthString="5 - May";  
    break;    
    case 6: monthString="6 - June";  
    break;    
    case 7: monthString="7 - July";  
    break;    
    case 8: monthString="8 - August";  
    break;    
    case 9: monthString="9 - September";  
    break;    
    case 10: monthString="10 - October";  
    break;    
    case 11: monthString="11 - November";  
    break;    
    case 12: monthString="12 - December";  
    break;    
    default:System.out.println("Invalid Month!");    
    }    
    //Printing month of the given number  
    System.out.println(monthString);  

    System.out.println("------------");

    char ch='O';
    switch (ch) {
        case 'a':   
            System.out.println("Vowel");  
            break;  
        case 'e':   
            System.out.println("Vowel");  
            break;  
        case 'i':   
            System.out.println("Vowel");  
            break;  
        case 'o':   
            System.out.println("Vowel");  
            break;  
        case 'u':   
            System.out.println("Vowel");  
            break;  
        case 'A':   
            System.out.println("Vowel");  
            break;  
        case 'E':   
            System.out.println("Vowel");  
            break;  
        case 'I':   
            System.out.println("Vowel");  
            break;  
        case 'O':   
            System.out.println("Vowel");  
            break;  
        case 'U':   
            System.out.println("Vowel");  
            break;  
        default:   
            System.out.println("Consonant");  
    }
    
    System.out.println("------------");
    


     String levelString = "Expert";
        int level = 0;

        switch(levelString){
            case"Beginner": level = 1; break;
            case"Intermediate": level = 2; break;
            case"Expert": level = 3; break;

            default: level=0;
            break;
        }
        System.out.println("Your level is :" + level);

        System.out.println("------------");
        
        
        char branch = 'C';
        int collegeYear = 4;

        switch( collegeYear )  
        {  
            case 1:  
                System.out.println("English, Maths, Science");  
                break;  
            case 2:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Operating System, Java, Data Structure");  
                        break;  
                    case 'E':  
                        System.out.println("Micro processors, Logic switching theory");  
                        break;  
                    case 'M':  
                        System.out.println("Drawing, Manufacturing Machines");  
                        break;  
                }  
                break;  
            case 3:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }  
                break;  
            case 4:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'M':  
                        System.out.println("Production Technology, Thermal Engineering");  
                        break;  
                }  
                break;  
            }

            // Java Enum in Switch Statement


            // Java Wrapper in Switch Statement

            Integer age = 18;
            switch (age) {
                case (16):System.out.print("You are under 18");break;
                case (18):System.out.print("You are okay to vote");break;
                case (65):System.out.print("You are senior citizen");break;
                default: System.out.println("Please give the valid age");break;
                
            }


        





    }
    
}
