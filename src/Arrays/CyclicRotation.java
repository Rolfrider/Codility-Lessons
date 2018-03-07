package Arrays;
// Task : https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/


public class CyclicRotation {
    public int [] solution(int [] A , int K){
        if(A == null || A.length <= 1 )
            return A;

        int [] result = new int[A.length];

        if(K > A.length)
            K = K%A.length;

        for (int i = 0; i < A.length; i++) {
            if(K + i >= A.length)
                result[K + i - A.length] = A[i];
            else
                result[K + i] = A[i];

        }


        return result;
    }
}
