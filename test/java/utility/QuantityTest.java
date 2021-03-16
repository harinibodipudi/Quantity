package utility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityTest {
    @Test
    public void testIfTwoQuantitiesAreEqual(){
        Quantity newQuantity = new Quantity(1, QuantityValues.VALUEASONE.value);

        assertTrue(newQuantity.equals(newQuantity));
    }
    @Test
    public void testFalseIFTwoQuantitiesAreNotEqual(){

        Quantity newQuantity = new Quantity(1,QuantityValues.VALUEASTWO.value);

        assertFalse(newQuantity.equals(newQuantity));
    }

}
