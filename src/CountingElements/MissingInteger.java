package CountingElements;
// Task : https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
// 100 % correctness and performance

public class MissingInteger {

    public int solution(int [] A){
        if(A.length == 1){
            return A[0] == 1 ? 2 : 1;
        }

        boolean [] positions = new boolean[A.length];
        positions[0] = true;
        for (int n : A){
            if(n > 0 && n < A.length){
                positions[n] = true;
            }
        }

        for (int i = 1; i < positions.length ; i++) {
            if(!positions[i]){
                return i;
            }
        }
        return A.length + 1;
    }

}
