import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Ally", "123456", 50000, "UX");
    }

    @Test
    public void hasName(){
        assertEquals("Ally", manager.getName());
    }

    @Test
    public void hasNI_number(){
        assertEquals("123456", manager.getNI_number());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("UX", manager.getDeptName());
    }

    @Test
    public void getBonus(){
        assertEquals(500, manager.getBonus());
    }

    @Test
    public void getSalaryRaise(){
        assertEquals(52500, manager.getSalaryRaise(0.05));
    }

}
