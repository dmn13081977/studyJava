package my.springapp.service;

import lombok.AllArgsConstructor;
import my.springapp.models.TransferMoney;
import my.springapp.repository.BalanceRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class BankService {

    private final BalanceRepository repository;

    public BigDecimal getBalance(Long accountId){
        BigDecimal balance = repository.getBalanceForId(accountId);
        if (balance == null) {
            throw new IllegalArgumentException();
        }
        return balance;
    }

    public BigDecimal addMoney(Long to, BigDecimal amount){
        BigDecimal currentBalance = repository.getBalanceForId(to);
        if (currentBalance == null){
            repository.save(to, amount);
            return amount;
        } else {
            BigDecimal updatedBalance = currentBalance.add(amount);
            repository.save(to, updatedBalance);
            return updatedBalance;
        }
    }

    public void makeTransfer(TransferMoney transferMoney){
       BigDecimal fromBalance = repository.getBalanceForId(transferMoney.getFrom());
        BigDecimal toBalance = repository.getBalanceForId(transferMoney.getTo());
        if (fromBalance == null || toBalance == null) {
            throw new IllegalArgumentException("No id");
        } else if (transferMoney.getAmount().compareTo(fromBalance) > 0){
            throw new IllegalArgumentException("No money");
        } else {
            fromBalance.subtract(transferMoney.getAmount());
        }
        BigDecimal updatedFromBalance = fromBalance.subtract(transferMoney.getAmount());
        BigDecimal updatedToBalance = toBalance.add(transferMoney.getAmount());
        repository.save(transferMoney.getFrom(), updatedFromBalance);
        repository.save(transferMoney.getTo(), updatedToBalance);

    }

}
