fun main() {
    println(comissionTransfer())
    }
fun comissionTransfer(){
    val sumTransfer = 100000
    val procent = 100
    val commisVisaMir: Double = (sumTransfer/procent)*0.75
    val min = 350
    val transfersUpto=0
    val card= "Vk Pay"
    when(true){
        card=="Vk Pay" -> println("Перевод без комиссии")
        card=="MasterCard"|| card=="Maestro" -> if (transfersUpto<750000)
            println("Перевод без комиссии") else println("Сумма комиссии ${(sumTransfer/procent)*0.6}")
        card=="Visa" || card == "Мир" -> if(commisVisaMir<min)
            println("Cумма комиссии: ${min} копеек") else println("Сумма комиссии: ${commisVisaMir.toInt()} копеек")
}


}