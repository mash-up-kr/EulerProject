/**
 * @auther Lee, Chae Eun
 * @since 2017-04-08
 */

fun main(args: Array<String>) {
    var sumOfSquare = 0
    var sum = 0
    for (i in 1..100) {
        sumOfSquare += i*i
        sum += i
    }
    val squareOfSum = sum * sum
    println(squareOfSum - sumOfSquare)

}
