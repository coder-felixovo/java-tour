package designpattern.structuralpattern.strategy;

import java.math.BigDecimal;

public class WechatPayment implements PaymentStrategy{
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用微信支付：" + amount);
    }
}
