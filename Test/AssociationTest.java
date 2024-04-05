import org.junit.Test;
import static org.junit.Assert.*;

public class AssociationTest {

    @Test
    public void testAssociationConstructor() {
        Association<String, String> association = new Association<>("house", "casa");
        assertEquals("house", association.key);
        assertEquals("casa", association.value);
    }
}
