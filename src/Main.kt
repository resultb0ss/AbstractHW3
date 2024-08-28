fun main() {

    var numOperation = 2
    var num: Double = 10.0

    when(numOperation){
        1 -> println("${num * 10} дециметров")
        2 -> println("${num / 1000} километров")
        3 -> println("${num} метров")
        4 -> println("${num * 1000} милимметров")
        5 -> println("${num * 100} сантиметров")
    }
}