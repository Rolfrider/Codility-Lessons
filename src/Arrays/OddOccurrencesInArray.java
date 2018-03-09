package Arrays;
// Task : https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
// 100% correctness and performance
import java.util.HashSet;


public class OddOccurrencesInArray {

    public int solution(int [] A ){
            HashSet<Integer> numbers = new HashSet<>(A.length/2);
            for (int num :A) {
                if(numbers.contains(num))
                    numbers.remove(num);
                else
                    numbers.add(num);
            }

            return (int)numbers.toArray()[0];
    }


}
