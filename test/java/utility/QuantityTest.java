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
    @Test
    void testExceptionIsThrownIfMeterOrCentimeterIsZero(){
        Quantity meter = new Quantity(0,QuantityType.METER);
        Quantity centimeter = new Quantity(100,QuantityType.CENTIMETER);

        Exception exception = assertThrows(IllegalArgumentException.class,() ->{
            meter.equals(centimeter);
        });
        assertEquals("Not allowed", exception.getMessage());
    }

    @Test
    void testTrueIf100CentimeterIsEqualToOneTenthOfKm(){
        Quantity centimeter = new Quantity(100,QuantityType.CENTIMETER);
        Quantity kilometer = new Quantity(0.1,QuantityType.KILOMETER);

        assertTrue(centimeter.equals(kilometer));
    }

    @Test

    public void testIfSumOfOneMeterAnd100CentimeterIsEqualTwoMeter() {
        Quantity meter = new Quantity(1,QuantityType.METER);
        Quantity centimeter = new Quantity(100, QuantityType.CENTIMETER);
        Quantity resultantMeter = new Quantity(2,QuantityType.METER);

        double sumofmeterandcentimeter=Quantity.sumOfMeterAndCentimeterInCentimeter(meter.value, centimeter.value);
        Quantity newCentimeter = new Quantity(sumofmeterandcentimeter,QuantityType.CENTIMETER);

        assertTrue(resultantMeter.equals(newCentimeter));

    }

    @Test

    public void testIfSumOfOneKmAnd200CentimeterIsEqual100200Meter() {
        Quantity centimeter = new Quantity(200, QuantityType.CENTIMETER);
        Quantity kilometer =  new Quantity(1, QuantityType.KILOMETER);
        Quantity resultantCentimeter = new Quantity(100200,QuantityType.CENTIMETER);

        double sumofKilometerAndCentimeter=Quantity.sumOfKilometerAndCentimeterInCentimeter(centimeter.value,kilometer.value);
        Quantity newCentimeter = new Quantity(sumofKilometerAndCentimeter,QuantityType.CENTIMETER);

        assertTrue(resultantCentimeter.equals(newCentimeter));

    }
    @Test
    public void testIfDifferenceOf1MeterAnd50CmIsEqualToMeter() {
        Quantity meter = new Quantity(1, QuantityType.METER);
        Quantity centimeter =  new Quantity(50, QuantityType.CENTIMETER);
        Quantity resultantMeter = new Quantity(0.5,QuantityType.METER);

        double differenceOfKilometerAndCentimeter=Quantity.differenceOfMeterAndCentimeterInMeter(meter.value,centimeter.value);
        Quantity newMeter = new Quantity(differenceOfKilometerAndCentimeter,QuantityType.METER);

        assertTrue(resultantMeter.equals(newMeter));

    }

    @Test
    public void testIfDifferenceOf2000CentimeterAnd1mIsEqualTo1900Centimeter() {
        Quantity centimeter = new Quantity(2000, QuantityType.CENTIMETER);
        Quantity meter =  new Quantity(1, QuantityType.METER);
        Quantity resultantCentimeter = new Quantity(1900,QuantityType.CENTIMETER);

        double differenceOfCentimeterAndKilometer=Quantity.differenceOfCentimeterAndMeterInCentimeter(centimeter.value,meter.value);
        Quantity newCentimeter = new Quantity(differenceOfCentimeterAndKilometer,QuantityType.CENTIMETER);

        assertTrue(resultantCentimeter.equals(newCentimeter));

    }
}
