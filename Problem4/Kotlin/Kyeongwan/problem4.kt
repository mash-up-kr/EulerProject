

fun main(arg: Array<String>){

//    println((100..999).forEach { i-> (100..999).filter { j-> (i*j).check() } } })

    var max = 0
    for(i in 100..999){
        for(j in 100..999){
            if((i*j).check())
               max = if(i*j > max) i*j else max
        }
    }
    println(max)

}

fun Int.check() = toString().run {
    length%2 == 0 && substring(0, length / 2) == substring(length/2, length).reversed()
}
