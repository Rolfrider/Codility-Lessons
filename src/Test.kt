import TimeComplexity.PermMissingElem
import java.util.*


fun main(args: Array<String>) {
    val sol = PermMissingElem()
    val array = arrayOf(2,3,1,5,4,7)
    println(Arrays.toString(array))
    println("Missing element ${sol.solution(array.toIntArray())}")

}