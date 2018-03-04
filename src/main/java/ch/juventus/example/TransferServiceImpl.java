package ch.juventus.example;

import java.math.BigDecimal;

public class TransferServiceImpl {

    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void transferMoney(String fromAccountNumber, String toAccountNumber, BigDecimal amount) {

        Account fromAccount = accountRepository.findById(fromAccountNumber);
        Account toAccount = accountRepository.findById(toAccountNumber);

        fromAccount.addToBalance(amount.negate());
        toAccount.addToBalance(amount);

        accountRepository.update(fromAccount);
    }
}
