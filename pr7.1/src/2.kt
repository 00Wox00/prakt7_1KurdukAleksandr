fun main() {
    try {

        print("Введите M: ")
        val m = readLine()!!.toInt()
        print("Введите a_M: ")
        val aM = readLine()!!.toDouble()
        print("Введите N: ")
        val n = readLine()!!.toInt()
        print("Введите a_N: ")
        val aN = readLine()!!.toDouble()
        if (m > n) {
            println("M должно быть меньше N")
            return
        }
        val d = (aN - aM) / (n - m)
        val sum = (aM + aN) * (n - m + 1) / 21
        println("Сумма от $m до $n: ${"%.2f".format(sum)}")
    }catch (e:NumberFormatException){
        println("ошибка")
    }
}