package example.pattern.responsibilitychain;

public class DebugLogFilter extends LogFilter {

    private final static int LEVEL = 3;

    public DebugLogFilter() {

    }

    public void logPrint(Message msg) {
        int msgLevel = msg.getLevel();
        if(LEVEL < msgLevel) {
            if (this.getNext() != null) {
                this.getNext().logPrint(msg);
            }
        } else if(LEVEL == msgLevel) {
            System.out.println("DebugLogFilter:\t");
            msg.printMsg();
        }
    }
}
