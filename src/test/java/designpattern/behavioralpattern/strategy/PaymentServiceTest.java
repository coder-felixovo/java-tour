package designpattern.behavioralpattern.strategy;

import org.junit.Test;

import java.math.BigDecimal;

public class PaymentServiceTest {

    @Test
    public void payment() {
        PaymentService paymentService = new PaymentService();

        paymentService.payment(new CreditPayment(), new BigDecimal(4999));

        paymentService.payment(new WechatPayment(), new BigDecimal("2.4"));

        paymentService.payment(new AlipayPayment(), new BigDecimal(79));
    }
}