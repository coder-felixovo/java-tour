package designpattern.structuralpattern.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    public void payment(BigDecimal amount);
}
