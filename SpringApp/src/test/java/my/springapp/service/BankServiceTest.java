package my.springapp.service;

import my.springapp.repository.BalanceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


class BankServiceTest {
    private BalanceRepository balanceRepository = new BalanceRepository();
    private BankService bankService = new BankService(balanceRepository);

    @Test
    void getBalance() {
    final BigDecimal balance = bankService.getBalance(1l);
    assertEquals(balance, BigDecimal.TEN);
    }

    @Test
    void addMoney() {
        final BigDecimal balance = bankService.addMoney(1l, BigDecimal.ONE);
        assertEquals(balance, BigDecimal.valueOf(11));
    }

}


