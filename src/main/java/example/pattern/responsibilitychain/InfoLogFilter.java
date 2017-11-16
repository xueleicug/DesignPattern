package example.pattern.responsibilitychain;

public class InfoLogFilter extends LogFilter {

    private final static int LEVEL = 1;

    public InfoLogFilter() {

    }

    public void logPrint(Message msg) {
        int msgLevel = msg.getLevel();
        if(LEVEL < msgLevel) {
            if (this.getNext() != null) {
                this.getNext().logPrint(msg);
            }
        } else if(LEVEL == msgLevel) {
            System.out.println("InfoLogFilter:\t");
            msg.printMsg();
        }
    }
}
