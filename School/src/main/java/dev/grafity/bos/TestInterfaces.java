package dev.grafity.bos;

public class TestInterfaces {
    public static void main(String[] args) {
        AccountService as = new AccountService();
        as.withdraw();
        as.deposit();
        as.applyFixedDeposit();
        as.checkBalance();

        Withdrawable withdrawableRef= new AccountService();
        withdrawableRef.withdraw();
        BasicBanking basicBankingRef= new AccountService();
        basicBankingRef.deposit();
        basicBankingRef.withdraw();

    }
}
