package CountingElements;
// Task : https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
// 100% correctness and performance

public class PermCheck {
    public int solution(int [] A){

        boolean [] numbers = new boolean[A.length +1];
        numbers[0] = true;
        for (int i = 0; i < A.length; i++) {
            if(A[i] <= A.length){
                numbers[A[i]] = !numbers[A[i]];
            }
        }
        for(boolean val : numbers){
            if(!val)
                return 0;
        }

        return 1;
    }
}
