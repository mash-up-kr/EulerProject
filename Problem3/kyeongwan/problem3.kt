fun main(args: Array<String>) {
	print(calc())
}
var num = 600851475143;

fun calc():Long {
	var num :Long = 600851475143
	for (i in 3..num step 2) {
		if (i == num) return num
		while (num % i == 0.toLong())
			num = num / i
	}
	return -1
}

