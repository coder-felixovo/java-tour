package designpattern.structuralpattern.strategy;

import java.math.BigDecimal;

public class CreditPayment implements PaymentStrategy{
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用银行卡支付：" + amount);
    }
}
