package TimeComplexity;
// Task : https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
// 100% correctness and performance

public class FrogJmp {
    public int solution(int X, int Y, int D){
        if(X == Y )
            return 0;

        int jumps = 0;
        jumps = (Y - X) / D;
        if((Y - X) % D != 0)
            jumps += 1;

        return jumps;

    }
}
