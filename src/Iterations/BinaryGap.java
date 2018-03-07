package Iterations;
// Task : https://app.codility.com/programmers/lessons/1-iterations/binary_gap/

public class BinaryGap {
    int solution(int N){
        String num = Integer.toString(N, 2);
        int maxSlice = 0;
        int currentSlice = 0;
        for (int i = 0 ; i < num.length(); i++){
            if(num.charAt(i) == '0')
                currentSlice++;
            else {
                maxSlice = Math.max(currentSlice, maxSlice);
                currentSlice = 0;
            }
        }
        return maxSlice;
    }
}
