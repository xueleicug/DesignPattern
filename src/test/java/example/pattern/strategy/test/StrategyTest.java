package example.pattern.strategy.test;

import example.pattern.strategy.CashNormal;
import example.pattern.strategy.CashRebate;
import example.pattern.strategy.CashReturn;
import example.pattern.strategy.Context;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void testStrategy() {
        // TODO Auto-generated method stub
        CashNormal cashNormal = new CashNormal();
        Context context0 = new Context(cashNormal);
        context0.cashAlgorithm();

        CashRebate cashRebate = new CashRebate(0.8f);
        Context context1 = new Context(cashRebate);
        context1.cashAlgorithm();

        CashReturn cashReturn = new CashReturn(200);
        Context context2 = new Context(cashReturn);
        context2.cashAlgorithm();
    }
}
