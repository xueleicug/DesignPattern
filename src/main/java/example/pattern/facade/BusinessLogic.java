package example.pattern.facade;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月23日 下午6:46:38
 **/
public class BusinessLogic
{
    /**
     * 数据库连接对象
     */
    private DataBaseConnection dbConnection;
    /**
     * 数据操作对象
     */
    private DataOperation dataOperation;
    /**
     * 数据缓存池对象
     */
    private BufferPool bufferPool;
    
    public BusinessLogic()
    {
        // TODO Auto-generated constructor stub
        this.dbConnection = new DataBaseConnection();
        this.dataOperation = new DataOperation();
        this.bufferPool = new BufferPool();
    }
    
    /**
     * 获取一条记录
     */
    public void getRecord()
    {
        dbConnection.connectDataBase();
        dataOperation.selectRecord();
        bufferPool.addToBufferPool();
        dbConnection.closeConnection();
    }
    
    /**
     * 删除一条记录
     */
    public void deleteRecord()
    {
        dbConnection.connectDataBase();
        dataOperation.deleteRecord();
        bufferPool.updateBufferPool();
        dbConnection.closeConnection();
    }
    
    /**
     * 更新一条记录
     */
    public void updateRecord()
    {
        dbConnection.connectDataBase();
        dataOperation.updateRecord();
        bufferPool.updateBufferPool();
        dbConnection.closeConnection();
    }
}