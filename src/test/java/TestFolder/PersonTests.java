package TestFolder;

import org.dz9.Man;
import org.dz9.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonTests {

    private Man man;
    private Woman woman;

    @BeforeMethod
    public void creatingPerson(){
        man = new Man("Vasyliy", "Petrov", 70);
        woman = new Woman("Lida", "Akkerman", 33);
    }

    @Test
    public void testGetFirstName(){
        Assert.assertEquals(man.getFirstName(), "Vasyliy", "getting FirstName is incorrect");
    }

    @Test
    public void testGetLastName(){
        Assert.assertEquals(man.getLastName(), "Petrov", "getting LastName is incorrect");
    }

    @Test
    public void testSetLastName(){
        man.setLastName("Ivanov");
        Assert.assertEquals(man.getLastName(), "Ivanov", "setting LastName is incorrect");
    }

    @Test
    public void testGetAge(){
        Assert.assertEquals(man.getAge(), 70, "getting Age is incorrect");
    }

    @Test
    public void testSetAge(){
        man.setAge(30);
        Assert.assertEquals(man.getAge(), 30, "setting Age is incorrect");
    }

    @Test
    public void testGetPartner(){
        Assert.assertEquals(man.getPartner(), null, "getting Partner is incorrect");
    }

    @Test
    public void testSetPartner(){
        man.setPartner(woman);
        Assert.assertEquals(man.getPartner(), woman, "setting Partner is incorrect");
    }

    @Test
    public void testIsRetired(){
        Assert.assertTrue(man.isRetired(), "checking isRetired is failed");
    }

    @Test
    public void testRegisterPartnership(){
        woman.setPartner(man);
        woman.registerPartnership();
        Assert.assertEquals(woman.getLastName(), "Petrov", "checking RegisterPartnership is failed");
    }

    @Test
    public void testDeregisterPartnership(){
        woman.setPartner(man);
        woman.registerPartnership();
        woman.deregisterPartnership();
        Assert.assertEquals(woman.getLastName(), "Akkerman", "checking DeregisterPartnership is failed");
    }

}
