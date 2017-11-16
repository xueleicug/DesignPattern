package example.pattern.responsibilitychain;

public abstract class LogFilter {

    private LogFilter next;

    public abstract void logPrint(Message msg);

    public void setNext(LogFilter next) {
        this.next = next;
    }

    public LogFilter getNext() {
        return this.next;
    }
}
