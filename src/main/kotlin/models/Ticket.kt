package models

class Ticket {
    private var ticketNo:Int =0

    fun generateTicketNo(): Int {
        ticketNo++
        return ticketNo
    }



}