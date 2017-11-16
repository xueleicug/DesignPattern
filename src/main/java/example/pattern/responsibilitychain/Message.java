package example.pattern.responsibilitychain;

public class Message {

    private int level;

    private String msgStr;

    public Message(int level, String msgStr) {
        this.level = level;
        this.msgStr = msgStr;
    }

    public void printMsg() {
        System.out.println("日志级别: " + this.level + "\t日志内容：" + this.msgStr);
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
