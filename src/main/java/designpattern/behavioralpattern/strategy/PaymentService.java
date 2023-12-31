package designpattern.behavioralpattern.strategy;

import java.math.BigDecimal;

public class PaymentService {
    public void payment(PaymentStrategy strategy, BigDecimal amount) {
        strategy.payment(amount);
    }
}
