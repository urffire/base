
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hu.bme.mit.train.tacho.Tacho;

public class TestTacho {

    Tacho tacho;

    @Before
    public void before() {
        tacho = new Tacho();
    }

    @Test
    public void checkTacho() {
        tacho.addElement(1,2,3);
        Assert.assertFalse(tacho.table.isEmpty());
    }

}
