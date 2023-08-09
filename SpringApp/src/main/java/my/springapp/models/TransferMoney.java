package my.springapp.models;

import lombok.Data;

import java.math.BigDecimal;

@Data // lombok создаёт конструктор, геттеры, сеттеры и т.д.
public class TransferMoney {

    private Long from;
    private Long to;
    private BigDecimal amount;


}
