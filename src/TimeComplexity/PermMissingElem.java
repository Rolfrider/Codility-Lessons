package TimeComplexity;
// Task : https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
// 100 % performance and correctness

public class PermMissingElem {
    public int solution(int [] A){
        int expectedSum = 0;
        int actualSum = 0;
        int i;
        for (i = 0; i < A.length; i++) {
            expectedSum+= i + 1;
            actualSum += A[i];
        }
        expectedSum += i + 1;
        return expectedSum - actualSum;
    }
}
