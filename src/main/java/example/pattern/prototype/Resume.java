package example.pattern.prototype;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月17日 下午1:51:21
 **/
public class Resume implements Cloneable
{
    /** 
     * 姓名
     **/
    private String name;
    /**
     * 年龄
     **/
    private int age;
    /** 
     * 性别 
     **/
    private String gender;
    /** 
     * 工作经历 
     **/
    private WorkExprience workExprience;
    
    public Resume(String name, int age, String gender, WorkExprience workExprience)
    {
        // TODO Auto-generated constructor stub
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setWorkExprience(workExprience);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        // TODO Auto-generated method stub
        Resume resume = (Resume)super.clone();
        resume.setWorkExprience((WorkExprience)this.workExprience.clone());
        return (Object)resume;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public WorkExprience getWorkExprience()
    {
        return workExprience;
    }

    public void setWorkExprience(WorkExprience workExprience)
    {
        this.workExprience = workExprience;
    }
    
    /**
     * 输出简历
     */
    public void printResum()
    {
        System.out.print("name: ");
        System.out.println(this.getName());
        System.out.print("age: ");
        System.out.println(this.getAge());
        System.out.print("gender: ");
        System.out.println(this.getGender());
        System.out.println("Work Exprience: ");
        int count = this.workExprience.getCompanyArrayList().size();
        for(int i = 0; i < count; i++)
        {
            String companyString = (String)this.workExprience.getCompanyArrayList().get(i);
            System.out.print(companyString);
            System.out.print("   ");
        }
        System.out.println();
    }
}