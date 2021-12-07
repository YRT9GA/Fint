package com.coresystems.fint.dbnew.models

object TransactionsContract {

    const val TABLE_NAME = "Transactions"


    object Columns {
        const val ID = "ID"
        const val account = "account"
        const val balance = "balance"
        const val incomeOutcome = "incomeOutcome"
        const val category = "category"
        const val sum = "sum"
        const val date = "date"
        const val commentary = "commentary"
    }

}