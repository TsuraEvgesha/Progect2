fun main() {
    val amount: Int = 500000
    val procent = 100
    val commission: Double = (amount/procent)*0.75
    val min = 350
    if(commission<min) println("Cумма комиссии: ${min} копеек") else println("Сумма комиссии: ${commission.toInt()} копеек")

}