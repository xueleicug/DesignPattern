package example.pattern.facade;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月23日 下午6:50:09
 **/
public class DataBaseConnection
{

    public DataBaseConnection()
    {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * 连接数据库
     */
    public void connectDataBase()
    {
        System.out.println("connect to the database");
    }
    
    /**
     * 断开数据库连接
     */
    public void closeConnection()
    {
        System.out.println("close connection to the database");
    }
}