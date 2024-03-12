import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public int solve(ArrayList<Integer> A) {
        
        Collections.sort(A);
        
        int sum = 0, ans = 0;
        
        for(int i=0;i<A.size();i++) 
        {
            sum += (A.size()-i)*A.get(i);
        }
        
        return sum;
    }
}