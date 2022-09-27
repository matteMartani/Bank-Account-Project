case class BankAccount(userName: String, password: String, balance: Double, accountType: String){

    Scanner sc = new Scanner(System.in);

    def insertData(): Unit = {
        println("Enter the username: ");
        userName = sc.next();
        println("Enter the password: ");
        password = sc.next();
    }

    def showData(): Unit = {
        println("Username: " + userName);
        println("Balance: " + balance);
        println("Account Type: " + accountType);
    }

    def deposit(amount: Double): BankAccount = {
        println("Enter the amount to deposit: ");
        amount = sc.nextDouble();
        if(amount > 0){
            balance += amount;
        }
        else{
            println("Invalid amount");
        }
    }

    def withdraw(amount: Double): BankAccount = {
        println("Enter the amount to withdraw: ");
        amount = sc.nextDouble();
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
        else{
            println("Invalid amount");
        }
    }

    def transfer(amount: Double, to: BankAccount): (BankAccount, BankAccount) = {
        (withdraw(amount), to.deposit(amount))
    }

    def checkBalance(): Double = {
        balance
    }
}