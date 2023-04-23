package com.scienta.cs.nowpayments.models;

public enum TransactionStatus {

    CREATED,
    WAITING,// - waiting for the customer to send the payment. The initial status of each payment.
    CONFIRMING,// - the transaction is being processed on the blockchain. Appears when NOWPayments detect the funds from the user on the blockchain.
    CONFIRMED,// - the process is confirmed by the blockchain. Customer’s funds have accumulated enough confirmations.
    SENDING,// - the funds are being sent to your personal wallet. We are in the process of sending the funds to you.
    PARTIALLY_PAID,// - it shows that the customer sent the less than the actual price. Appears when the funds have arrived in your wallet.
    FINISHED,// - the funds have reached your personal address and the payment is finished.
    FAILED,// - the payment wasn't completed due to the error of some kind.
    REFUNDED,// - the funds were refunded back to the user.
    EXPIRED,// - the user didn't send the funds to the specified address in the 24 hour time window.

}
