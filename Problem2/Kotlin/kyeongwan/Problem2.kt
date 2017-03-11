fun(arg: Array<String>){

	var sum = 2
	var s1 = 1
	var s2 = 2
	var currentVar = 0

	while(currentVar < 4000000){
		currentVar = s1 + s2
		if(currentVar%2 == 0) currentVar += sum
			s1 = s2
		s2 = currentVar
	}
	println(sum)
}
