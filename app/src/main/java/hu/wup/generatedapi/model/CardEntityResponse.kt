package hu.wup.generatedapi.model

class CardEntityResponse(
    val cardId: String,
    val issuer: String,
    val cardNumber: String,
    val expirationDate: String,
    val cardHolderName: String,
    val friendlyName: String,
    val currency: String,
    val cvv: String,
    val availableBalance: Int,
    val currentBalance: Int,
    val minPayment: Int,
    val dueDate: String,
    val reservations: Int,
    val balanceCarriedOverFromLastStatement: Int,
    val spendingsSinceLastStatement: Int,
    val yourLastRepayment: String,
    val status: String,
    val cardImage: String,
    val accountDetails: AccountDetails
)