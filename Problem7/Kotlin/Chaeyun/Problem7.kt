package main

/**
 * Created by CY on 2017. 4. 29..
 */
fun main(args: Array<String>) {
    var count = 0
    var num = 2
    while(count < 10001) {
        for(divider in 2..num) {
            if(num % divider == 0 && num == divider)
                count++
            if(num % divider == 0)
                break
        }
        num++
    }
    println(num - 1)
}