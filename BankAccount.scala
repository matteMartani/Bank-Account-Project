case class BankAccount(id: Int, userName: String, password: String, balance: Double){

    def deposit(amount: Double): BankAccount = {
        BankAccount(id, userName, password, balance + amount)
    }

    def withdraw(amount: Double): BankAccount = {
        BankAccount(id, userName, password, balance - amount)
    }

    def transfer(amount: Double, to: BankAccount): (BankAccount, BankAccount) = {
        (withdraw(amount), to.deposit(amount))
    }

    def checkBalance(): Double = {
        balance
    }
}