import CountingElements.FrogRiverOne
import TimeComplexity.PermMissingElem
import java.util.*


fun main(args: Array<String>) {
    val sol = FrogRiverOne()
    val array = arrayOf(2,2,2,2,2)
    println(Arrays.toString(array))
    println("Solution = ${sol.solution( 2 ,array.toIntArray())}")

}