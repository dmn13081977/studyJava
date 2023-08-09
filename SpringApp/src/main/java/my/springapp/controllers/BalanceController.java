package my.springapp.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.springapp.models.TransferMoney;
import my.springapp.service.BankService;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

@Slf4j
@RestController()
@AllArgsConstructor // lombok для внедрения зависимостей спринга через конструктор
public class BalanceController {

    private BankService bankService;

    @GetMapping("/{accountId}")
    public BigDecimal getBalance(@PathVariable Long accountId){
       return bankService.getBalance(accountId);

    }

    @GetMapping("/add")
    public BigDecimal addMoney(@RequestBody TransferMoney transferMoney){
        return bankService.addMoney(transferMoney.getTo(), transferMoney.getAmount());

    }


    @GetMapping("/transfer")
    public void transfer(@RequestBody TransferMoney transferMoney){
        bankService.makeTransfer(transferMoney);

    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handle(IllegalArgumentException e){
        log.error(e.getMessage());
        return "Недопустимая операция!";
    }
}
