/**
 * Created by Tak on 2017. 4. 7..
 */

fun main(args: Array<String>) {
    val input: Int = 100

    // 합의 제곱 - 제곱의 합
    println( getSquareOfSum(input) - getSumOfSquares(input) )
}

// 합의 제곱
fun getSquareOfSum(input: Int): Int {
    var result = IntRange(1, input).sum()

    return result*result;
}

// 제곱의 합
fun getSumOfSquares(input: Int): Int {
    var result = generateSequence(1, {it -> it + 1}).takeWhile { it <= input }.map { it -> it*it }.sum()

    return result;
}
