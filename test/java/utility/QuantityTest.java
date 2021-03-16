package utility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    public void testTrueIfOneCentimeterIsEqualToOneCentimeter(){
        Quantity quantity = new Quantity(1,QuantityType.CENTIMETER);
        Quantity otherQuantity = new Quantity(1, QuantityType.CENTIMETER);

        assertTrue(quantity.equals(otherQuantity));
    }

    @Test
    void testFalseIfOneCentimeterIsNotEqualToTwoCentimeter() {
        Quantity quantity = new Quantity(1, QuantityType.CENTIMETER);
        Quantity otherQuantity = new Quantity(2, QuantityType.CENTIMETER);

        assertFalse(quantity.equals(otherQuantity));
    }

    @Test
    void testThrowsExceptionIfCentimeterValueIsZero(){
        Quantity quantity = new Quantity(0,QuantityType.CENTIMETER);
        Quantity otherQuantity = new Quantity(4,QuantityType.CENTIMETER);

        Exception exception = assertThrows(IllegalArgumentException.class,() ->{
            quantity.equals(otherQuantity);
        });

        assertEquals("Not allowed", exception.getMessage());
    }

    @Test
    void testThrowsExceptionIfCentimeterValueIsLessThanZero(){
        Quantity quantity = new Quantity(-4,QuantityType.CENTIMETER);
        Quantity otherQuantity = new Quantity(4,QuantityType.CENTIMETER);

        Exception exception = assertThrows(IllegalArgumentException.class,() ->{
            quantity.equals(otherQuantity);
        });
        assertEquals("Not allowed", exception.getMessage());
    }
    @Test
    void testTrueIf1MeterIsEqualTo100Centimeter(){
        Quantity meter = new Quantity(1,QuantityType.METER);
        Quantity centimeter = new Quantity(100,QuantityType.CENTIMETER);

        assertTrue(meter.equals(centimeter));
    }
}
