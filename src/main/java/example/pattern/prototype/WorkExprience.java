package example.pattern.prototype;

import java.util.ArrayList;

/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月17日 下午1:53:55
 **/
public class WorkExprience implements Cloneable
{
    /**　
     * 公司名称列表　
     **/
    private ArrayList<String> companyArrayList;

    public WorkExprience(ArrayList<String> companyArrayList)
    {
        // TODO Auto-generated constructor stub
        this.setCompanyArrayList(companyArrayList);
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
    public ArrayList<String> getCompanyArrayList()
    {
        return companyArrayList;
    }
    
    public void setCompanyArrayList(ArrayList<String> companyArrayList)
    {
        this.companyArrayList = companyArrayList;
    }
}