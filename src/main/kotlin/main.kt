fun main() {
    if(comissionTransfer()==0)
    println("Перевод без комиссии")
    else if (comissionTransfer()==-1)
        println("Перевод не возможен")
    else if (comissionTransfer()==1)
        println("Превышена максимальная сумма перевода")
    else println("Комиссия ${comissionTransfer()} копеек")
}

fun comissionTransfer(
    sumTransfer: Int = 10000,
    procent:Int = 100,
    min: Int = 350,
    transfersUpto:Int=0,
    discount: Double = 0.75,
    discount2: Double= 0.6,
    card:String= "Visa"
    ):Int {
    val commisVisaMir = (sumTransfer/procent)*discount
    val commisdis2 =(sumTransfer/procent)*discount2

    return when (card) {
        "Vk Pay" -> if (sumTransfer<150000 && transfersUpto<400000)
            0 else 1
        "MasterCard", "Maestro" -> if (transfersUpto<750000 && sumTransfer<1500000 && transfersUpto<6000000)
            0 else if (transfersUpto<750000 || sumTransfer>1500000 || transfersUpto>6000000)
                1 else commisdis2.toInt()
        "Visa", "Мир" ->  if (commisVisaMir<min && sumTransfer<1500000 && transfersUpto<6000000)
            min else if (sumTransfer<1500000 && transfersUpto<6000000) commisVisaMir.toInt() else 1
        else -> -1
    }
}
