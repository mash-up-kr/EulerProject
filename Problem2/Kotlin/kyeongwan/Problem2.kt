
fun main(arg: Array<String>){
    var sum = 2
    var s1 = 1
    var s2 = 2
    var currentVar = 0
    var range: Int = if(arg.size == 0) 4000000 else arg[1].toInt()

    while(currentVar <= range){
        currentVar = s1 + s2
        if(currentVar.and(1) == 0)
            sum += currentVar
        s1 = s2
        s2 = currentVar
    }
    println(sum)
}
