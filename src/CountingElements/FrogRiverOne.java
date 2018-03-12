package CountingElements;
// Task : https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
// 100% correctness and performance

public class FrogRiverOne {
    private int lastPosition = 0;
    public int solution(int X, int [] A){
        int seconds = -1;

        boolean [] positions = new boolean[X + 1];
        positions[0] = true;

        for (int i = 0; i < A.length; i++) {
            positions[A[i]] = true;
            if (canCross(positions)){
                seconds = i;
                break;
            }

        }

        return seconds;
    }

    private boolean canCross(boolean [] pos){
        for (int i = lastPosition + 1; i < pos.length; i++) {
            if(!pos[i])
                return false;
            lastPosition = i;
        }
        return true;
    }

}
