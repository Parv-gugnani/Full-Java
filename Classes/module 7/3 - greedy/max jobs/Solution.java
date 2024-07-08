
public class Solution {
    public int solve(int[] A, int[] B) {
        int n = A.length;
        Job[] jobs = new Job[n];
        
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(A[i], B[i]);
        }
        
        Arrays.sort(jobs, Comparator.comparingInt(job -> job.end));
        
        int count = 1;
        int lastEndTime = jobs[0].end;
        
        for (int i = 1; i < n; i++) {
            if (jobs[i].start >= lastEndTime) {
                count++;
                lastEndTime = jobs[i].end;
            }
        }
        
        return count;
    }
    
    class Job {
        int start;
        int end;
        
        Job(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
