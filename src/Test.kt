import TimeComplexity.TapeEquilibrium
import java.util.*


fun main(args: Array<String>) {
    val sol = TapeEquilibrium()
    val array = arrayOf(3,1,2,4,3)
    println(Arrays.toString(array))
    println("Smallest diff ${sol.solution(array.toIntArray())}")

}