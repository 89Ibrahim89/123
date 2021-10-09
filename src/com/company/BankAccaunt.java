package com.company;

class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return (int) amount;
    }
    public void deposit(double sum){
        amount += sum;
    }

    public void withdraw(int sum) throws LimitException {
        if (amount < sum ) {
           throw new LimitException ("Requested amount is more than remaining funds. Available funds: "
                    + amount, amount);
        } else
            amount -= sum;
    }
}
