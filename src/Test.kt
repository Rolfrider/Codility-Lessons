import Arrays.CyclicRotation
import java.util.*


fun main(args: Array<String>) {
    val sol = CyclicRotation()
    val A = emptyArray<Int>()
    println("Start data ${Arrays.toString(A)}")
    val result = sol.solution(A.toIntArray(), 5)
    println("Moved by 2")
    println("Result ${Arrays.toString(result)}")

}