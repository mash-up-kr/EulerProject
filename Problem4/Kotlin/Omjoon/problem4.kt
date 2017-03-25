/**
 * Created by Omjoon on 2016. 7. 18..
 */
fun main(args: Array<String>) {
    answer()
}

fun answer() =
    (100..999).flatMap(::order).max().run { println(this) }


fun order(number : Int) : List<Int> =
    (100..999).mapNotNull {
        (it * number).toString().run {
              if(length > 5  && substring(0,3) == substring(3).reversed())
                  return@run toInt()
              else
                  null
        }
    }
