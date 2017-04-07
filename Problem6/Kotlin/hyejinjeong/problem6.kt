/*프로젝트 오일러(http://euler.synap.co.kr/) 6번 문제 
 1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).

12 + 22 + ... + 102 = 385
1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).

(1 + 2 + ... + 10)2 = 552 = 3025
따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.

그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
*/

fun main(args : Array<String>){
	println(squareOfSum(100)-sumOfSquares(100)) //25164150
}

fun sumOfSquares(num: Int): Int = (1..num).map{ it * it }.sum()
fun squareOfSum(num: Int) = (1..num).sum() * (1..num).sum()