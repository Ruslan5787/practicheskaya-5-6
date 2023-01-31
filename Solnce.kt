fun main() {
    println("Введите два числа через Enter");

    var num1 = readLine()!!.toDouble();
    var num2 = readLine()!!.toDouble();

    if(num1 > num2) {
        num1++;
    } else if(num1 < num2) {
        num2++;
    } else {
        num1 = Math.pow(num1, 3.0);
    }

    println("Результат $num1 $num2")
}
