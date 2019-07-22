import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Maria", "76543", 120000, "Management", 50000.50);
    }

    @Test
    public void hasName(){
        assertEquals("Maria", director.getName());
    }

    @Test
    public void hasNI_number(){
        assertEquals("76543", director.getNI_number());
    }

    @Test
    public void hasSalary(){
        assertEquals(120000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(50000.50, director.getBudget(), 0.0);
    }

    @Test
    public void getBonus(){
        assertEquals(1200, director.getBonus());
    }

    @Test
    public void getSalaryRaise(){
        assertEquals(126000, director.getSalaryRaise(0.05));
    }


}
