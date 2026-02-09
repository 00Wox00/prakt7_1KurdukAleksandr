fun main() {
    try {
    println("Введите сторону a: ")
    val a = readLine()!!.toDouble()
    println("Введите сторону b: ")
    val b = readLine()!!.toDouble()
    println("Введите сторону c: ")
    val c = readLine()!!.toDouble()
    if (a <= 0 || b <= 0 || c <= 0) {
        println("стороны должны быть положительными")
        return
    }
    if (a + b <= c || a + c <= b || b + c <= a) {
        println("треугольник не существует")
        return
    }
    val p = (a + b + c) / 2
    val r = Math.sqrt((p - a) * (p - b) * (p - c) / p)
    val R = (a * b * c) / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c)))
    println("Радиус вписанной: ${"%.2f".format(r)}")
    println("Радиус описанной: ${"%.2f".format(R)}")
    }catch (e:NumberFormatException){
        println("ошибка")
    }
}