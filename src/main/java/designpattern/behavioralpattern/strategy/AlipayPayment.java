package designpattern.behavioralpattern.strategy;

import java.math.BigDecimal;

public class AlipayPayment implements PaymentStrategy{
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用支付宝支付：" + amount);
    }
}
