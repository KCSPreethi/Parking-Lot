package models 
class Receipt {
    private var receiptNo:Int =-1
    fun generateReceiptNumber():Int{
        return receiptNo++
    }
}
