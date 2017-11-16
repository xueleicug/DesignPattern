package example.pattern.responsibilitychain;

public class ErrorLogFilter extends LogFilter {

    private final static int LEVEL = 4;

    public ErrorLogFilter() {

    }

    public void logPrint(Message msg) {
        int msgLevel = msg.getLevel();
        if(LEVEL < msgLevel) {
            if (this.getNext() != null) {
                this.getNext().logPrint(msg);
            }
        } else if(LEVEL == msgLevel) {
            System.out.println("ErrorLogFilter:\t");
            msg.printMsg();
        }
    }
}
