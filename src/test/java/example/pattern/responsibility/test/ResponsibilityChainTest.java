package example.pattern.responsibility.test;

import example.pattern.responsibilitychain.*;
import org.junit.Test;

public class ResponsibilityChainTest {

    @Test
    public void testResponsibilityChain() {

        InfoLogFilter infoLogFilter = new InfoLogFilter();
        WarnLogFilter warnLogFilter = new WarnLogFilter();
        DebugLogFilter debugLogFilter = new DebugLogFilter();
        ErrorLogFilter errorLogFilter = new ErrorLogFilter();
        Chain chain = new Chain();
        chain.addNode(infoLogFilter);
        chain.addNode(warnLogFilter);
        chain.addNode(debugLogFilter);
        chain.addNode(errorLogFilter);

        Message m1 = new Message(1, "InfoMessage");
        Message m2 = new Message(2, "WarnMessage");
        Message m3 = new Message(3, "DebugMessage");
        Message m4 = new Message(8, "Not Print");
        Message m5 = new Message(4, "ErrorMessage");
        Message m6 = new Message(2, "WarnMessage");

        chain.process(m1);
        chain.process(m2);
        chain.process(m3);
        chain.process(m4);
        chain.process(m5);
        chain.process(m6);
    }
}
