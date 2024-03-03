//For Loop
public class main {
    public static void main(String[] args){

        //for loop
        // for(initialization; condition; increment/decrement){    
        //     //statement or code to be executed    
        //     }    

        //ex - 1

        for (int i = 0; i < 10; i++) {
                System.out.println(i);
        }
        System.out.println("------------");
        
        //printing 1 - 10 one by one

        for (int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                System.out.println(i+" "+j);
            }
        } 

        System.out.println("------------");
        


        // praymid example

        for (int i = 1; i <=5; i++){
            for (int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        System.out.println("------------");
        

        // Pyramid Example 2:
        int term = 5;
        for(int i=1;i<=term;i++){  
            for(int j=term;j>=i;j--){  
                    System.out.print("* ");  
            }  
            System.out.println();
        }

        System.out.println("------------");
        
        int arr[] = {12,10,16,85,100,42};
        for(int i : arr){
            System.out.println(i);
        }

        // Java Labeled For Loop

        System.out.println("------------");
        
        aa:
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break aa;  
                    }  
                System.out.println(i + " " + j);
            }
        }



    }
    
}
