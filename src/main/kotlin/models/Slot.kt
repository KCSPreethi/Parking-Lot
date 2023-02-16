package models


//individual vehicles
//Vehicle refer to slot class

class Slot( var available: Int,var ratePerTime: MutableMap<Pair<Int,Int>,Int>)
{

        var spotNo: Int = -1
        var ticket: Ticket = Ticket()
        var receipt: Receipt = Receipt()
        val parkingSite = mutableMapOf<Int, Boolean>()
}
