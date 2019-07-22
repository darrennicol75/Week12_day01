import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;

    @Before
    public void setUp(){
        databaseadmin = new DatabaseAdmin("Darren", "98765", 100000,"Database");
    }

    @Test
    public void hasName(){
        assertEquals("Darren", databaseadmin.getName());
    }

    @Test
    public void hasNI_number(){
        assertEquals("98765", databaseadmin.getNI_number());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, databaseadmin.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Database", databaseadmin.getDeptName());
    }

    @Test
    public void getBonus(){
        assertEquals(1000, databaseadmin.getBonus());
    }

    @Test
    public void getSalaryRaise(){
        assertEquals(105000, databaseadmin.getSalaryRaise(0.05));
    }

}
