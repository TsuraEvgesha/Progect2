package ru.netology

import comissionTransfer
import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun comissionTransfer_NotDiscount() {
        val sumTransfer = 100000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =0
        val card = "MasterCard"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(0, result)

    }
    @Test
    fun comissionTransfer_DiscountMasterCard() {
        val sumTransfer = 1450000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =900000
        val card = "MasterCard"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(8700, result)

    }
    @Test
    fun comissionTransfer_DiscountMCLimit() {
        val sumTransfer = 1600000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =0
        val card = "MasterCard"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(1, result)

    }
    @Test
    fun comissionTransfer_DiscountMaestro() {
        val sumTransfer = 1400000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =800000
        val card = "Maestro"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(8400, result)

    }



    @Test
    fun comissionTransfer_DiscountMir() {
        val sumTransfer = 100000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =0
        val card = "Мир"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(750, result)

    }
    @Test
    fun comissionTransfer_DiscountVisaMin() {
        val sumTransfer = 10000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =0
        val card = "Visa"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(350, result)

    }
    @Test
    fun comissionTransfer_DiscountVisaMirLimit() {
        val sumTransfer = 1700000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =0
        val card = "Visa"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(1, result)

    }
    @Test
    fun comissionTransfer_error() {
        val sumTransfer = 100000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =0
        val card = "Тинькоф"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(-1, result)

    }
    @Test
    fun comissionTransfer_Limit() {
        val sumTransfer = 200000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =0
        val card = "Vk Pay"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(1, result)

    }
    @Test
    fun comissionTransfer_VK() {
        val sumTransfer = 100000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =100000
        val card = "Vk Pay"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(0, result)

    }
    @Test
    fun comissionTransfer_VKLimit() {
        val sumTransfer = 100000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =500000
        val card = "Vk Pay"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(1, result)

    }
    @Test
    fun comissionTransfer_MaestroLimit() {
        val sumTransfer = 1400000
        val procent= 100
        val discount = 0.75
        val discount2 = 0.6
        val min = 350
        val transfersUpto =6500000
        val card = "Maestro"
        val result = comissionTransfer(
            sumTransfer=sumTransfer,
            procent=procent,
            discount=discount,
            discount2=discount2,
            min=min,
            transfersUpto=transfersUpto,
            card=card
        )

        assertEquals(1, result)

    }

}