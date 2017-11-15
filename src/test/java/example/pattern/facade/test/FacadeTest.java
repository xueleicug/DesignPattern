package example.pattern.facade.test;

import example.pattern.facade.BusinessLogic;
import org.junit.Test;

public class FacadeTest {

    @Test
    public void testFacade() {

        BusinessLogic businessLogic = new BusinessLogic();
        System.out.println("Query a record:");
        businessLogic.getRecord();
        System.out.println();
        System.out.println("Delete a record:");
        businessLogic.deleteRecord();
        System.out.println();
        System.out.println("Update a record:");
        businessLogic.updateRecord();
    }
}
