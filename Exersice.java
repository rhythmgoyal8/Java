import java.util.*;

class Exersice{
    public static int minExercisesToTired(int E,int N,int[] A,int e){
        Arrays.sort(A); // Sort in ascending order first
        int count = 0;  
        
        // Iterate from the largest value downwards
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < 2; j++) { // Each exercise can be performed at most twice
                if (E <= e) return count; // Stop when energy reaches e or below
                E -= A[i]; // Reduce energy
                count++;   // Increment exercise count
            }
        }
        return (E > e) ? -1 : count; // If energy is still above e, return -1
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();  // Initial energy
        int N = sc.nextInt();  // Number of exercises
        int[] A = new int[N];  
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // Energy required for each exercise
        }
        int e = sc.nextInt();   // Threshold for tiredness

        // Function call and output
        int result = minExercisesToTired(E, N, A, e);
        System.out.println(result);

    }
}