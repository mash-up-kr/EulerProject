/**
 * Created by lk on 2017. 4. 8..
 */

fun main(arg: Array<String>){
    var v = 2
    while (!v.checkNum())v++
    println(v)
}

fun Int.checkNum() = (2..20).filter { this%it==0 }.size==19