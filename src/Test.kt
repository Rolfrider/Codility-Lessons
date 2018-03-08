import Arrays.CyclicRotation
import java.util.*
import Arrays.OddOccurrencesInArray


fun main(args: Array<String>) {
    val sol = OddOccurrencesInArray()
    val A = arrayOf(9,3,9,3,9,7,9)
    println("Start data ${Arrays.toString(A)}")
    val result = sol.solution(A.toIntArray())
    println("Result $result")

}