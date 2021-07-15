import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class TestPerson {

    @DataProvider(name = "age")
    Object[][] dataProvider(){
        return new Object[][] {
                {19, true},
                {18, true},
                {20, false},
                {12, false},
                {13, true},
                {0, false},

        };
    }
    @Test (dataProvider = "age")
    public void isTeenagerCorrect (int age, boolean b) throws Exception {
        boolean result = Person.isTeenager(age);
        assertEquals(result, b);
    }

}
