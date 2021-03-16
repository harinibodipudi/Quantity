package utility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityTest {
    @Test
    public void testIfTwoQuantitiesAreEqual(){
        Quantity newQuantity = new Quantity(QuantityValues.VALUEASONE.value, QuantityValues.VALUEASONE.value);

        assertTrue(newQuantity.equals(newQuantity));
    }

}
