package services

import models.Slot

class BookSlot(private var slot: Slot) {

        private fun isAvailable(): Boolean {
            if (slot.available == 0)
                return false
            return true
        }

        private fun generateSpotNo(): Int {
            return slot.spotNo++
        }

        private fun bookSpot(): Int {
            if (isAvailable()) {
                slot.available--
                for (slotToCheck in slot.parkingSite.entries.iterator()) {
                    if (!slotToCheck.value) {
                        slot.spotNo = slotToCheck.key
                        slot.parkingSite[slotToCheck.key] = true
                        return slot.spotNo
                    }
                }
                generateSpotNo()
                slot.parkingSite[slot.spotNo] = true
                return slot.spotNo
            }
            return -1
        }

        fun generateParkingSpot(): Int {
            if (isAvailable()) {
                slot.spotNo = bookSpot()
                slot.parkingSite[slot.spotNo] = true
                slot.ticket.generateTicketNo()
            }
            return slot.spotNo
        }

        fun unParkSlot(spotNo: Int) {
            unBookSpot(slot.spotNo)
            //generate fees
        }

        private fun unBookSpot(spotNo: Int): Int {
            if (slot.parkingSite[spotNo] == true) {
                slot.available++
                slot.parkingSite[spotNo] = false
                return slot.receipt.generateReceiptNumber()
            }
            return 0
        }

}