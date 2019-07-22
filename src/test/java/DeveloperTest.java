import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Jonny", "654321", 45000, "Front End");
    }

    @Test
    public void hasName(){
        assertEquals("Jonny", developer.getName());
    }

    @Test
    public void hasNI_number(){
        assertEquals("654321", developer.getNI_number());
    }

    @Test
    public void hasSalary(){
        assertEquals(45000, developer.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Front End", developer.getDeptName());
    }

    @Test
    public void getBonus(){
        assertEquals(450, developer.getBonus());
    }

    @Test
    public void getSalaryRaise(){
        assertEquals(47250, developer.getSalaryRaise(0.05));
    }

}
