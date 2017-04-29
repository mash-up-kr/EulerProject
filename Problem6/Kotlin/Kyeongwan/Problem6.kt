/**
 * Created by lk on 2017. 4. 8..
 */

fun main(arg: Array<String>){
    var v1 = 0
    var v2 = 0
    (1..100).forEach {
        v1 += it*it
        v2 += it
    }

    print(v2*v2 - v1)
}