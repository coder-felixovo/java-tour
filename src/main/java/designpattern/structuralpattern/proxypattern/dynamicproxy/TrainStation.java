package designpattern.structuralpattern.proxypattern.dynamicproxy;

/**
 * Real Subject 真实主题
 */
public class TrainStation  implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
