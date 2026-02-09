fun main() {
    try {
    print("Введите x: ")
    val x = readLine()!!.toDouble()
    if (x == 0.0) {
        println("x не может быть равен 0")
        return
    }
    if (x * x <= 0) {
        println("x должен быть больше 0")
        return
    }
    val absX = if (x < 0) -x else x
    val xS= x * x
    val lnXS = Math.log(xS)
    val nume = Math.sqrt(absX * lnXS)
    val d = -5.0 / (4 * x) + Math.exp(x / 2)
    if (d== 0.0) {
        println("Ошибка: знаменатель равен 0")
        return
    }
    val result = nume / d
    println("Результат: ${"%.2f".format(result)}")
    }catch (e:NumberFormatException){
        println("ошибка")
    }
}