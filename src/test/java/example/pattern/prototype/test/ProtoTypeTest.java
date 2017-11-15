package example.pattern.prototype.test;

import example.pattern.prototype.Resume;
import example.pattern.prototype.WorkExprience;
import org.junit.Test;

import java.util.ArrayList;

public class ProtoTypeTest {

    @Test
    public void testProtoType() throws Exception {

        ArrayList<String> companies = new ArrayList<String>();
        companies.add("Baidu");
        companies.add("Tencent");
        companies.add("Ali");
        WorkExprience workExprience = new WorkExprience(companies);
        String nameString = new String("Tom");
        String genderString = new String("male");
        Resume resume = new Resume(nameString, 23, genderString, workExprience);
        System.out.println("Source Resume");
        resume.printResum();

        ArrayList<String> companies1 = new ArrayList<String>();
        companies1.add("Google");
        companies1.add("Microsoft");
        companies1.add("Oracle");
        Resume copyResume = (Resume)resume.clone();
        String nameString1 = new String("Jerry");
        String genderString1 = new String("Fmale");
        copyResume.setName(nameString1);
        copyResume.setAge(20);
        copyResume.setGender(genderString1);
        copyResume.getWorkExprience().setCompanyArrayList(companies1);
        System.out.println();
        System.out.println("Source Resume");
        resume.printResum();
        System.out.println();
        System.out.println("Copy Resume");
        copyResume.printResum();
    }
}
