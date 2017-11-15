package example.pattern.facade;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月23日 下午6:52:58
 **/
public class DataOperation
{

    public DataOperation()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * 查找一条记录
     */
    public void selectRecord()
    {
        System.out.println("get a record from database");
    }
    
    /**
     * 删除一条记录
     */
    public void deleteRecord()
    {
        System.out.println("delete a record from database");
    }
    
    /**
     * 更新一条记录
     */
    public void updateRecord()
    {
        System.out.println("update the record in database");
    }
}