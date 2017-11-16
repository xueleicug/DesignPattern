package example.pattern.responsibilitychain;

public class Chain {

    private LogFilter headNode;

    private LogFilter lastNode;

    public Chain() {

    }

    public void process(Message msg) {
        this.headNode.logPrint(msg);
    }

    public void addNode(LogFilter filter) {
        if (headNode == null) {
            headNode = lastNode = filter;
        } else {
            lastNode.setNext(filter);
            lastNode = lastNode.getNext();
        }
    }
}
