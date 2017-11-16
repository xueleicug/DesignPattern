package example.pattern.responsibilitychain;

public class WarnLogFilter extends LogFilter {

    private final static int LEVEL = 2;

    public WarnLogFilter() {

    }

    public void logPrint(Message msg) {
        int msgLevel = msg.getLevel();
        if(LEVEL < msgLevel) {
            if (this.getNext() != null) {
                this.getNext().logPrint(msg);
            }
        } else if(LEVEL == msgLevel) {
            System.out.println("WarnLogFilter:\t");
            msg.printMsg();
        }
    }
}
