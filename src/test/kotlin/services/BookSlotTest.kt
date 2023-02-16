package services
import models.Slot
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test
class BookSlotTest{


    @Test
    fun `generate appropriate slotNumber`()
    {
        val rateTime= mutableMapOf<Pair<Int,Int>,Int>()
        rateTime[Pair(0,4)]=2
        val slot= Slot(20,rateTime)
        val bookSlot=BookSlot(slot)
        Assertions.assertEquals(0,bookSlot.generateParkingSpot())
    }

    @Test
    fun `generate receipt number during unParking`() {

    }
}