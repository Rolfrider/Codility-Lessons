package TimeComplexity;

// Task : https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
// 100% correctness and performance

public class TapeEquilibrium {


    public int solution(int [] A){
        int [] sums = new int[A.length];
        int i = 0;
        int sum = 0;
        for(int num : A){
            sum += num;
            sums[i] = sum;
            i++;
        }

        int lowestDiff = Integer.MAX_VALUE;

        for(i = 0; i < A.length - 1; i++){
            lowestDiff = Math.min(lowestDiff, Math.abs(2 * sums[i] - sums[A.length - 1]));
        }


        return lowestDiff;
    }

}
