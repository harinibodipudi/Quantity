package utility;

public class Quantity{
    public double value;
    public QuantityType type;

    public Quantity(double value, QuantityType type) {
        this.value = value;
        this.type= type;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass())return false;
        Quantity quantity=(Quantity)obj;
        if(quantity.value<=0 || value<=0){
            throw new IllegalArgumentException("Not allowed");
        }
        if(this.type!= quantity.type){
            if(this.type==QuantityType.METER && quantity.type==QuantityType.CENTIMETER){
                return 100*this.value==quantity.value;
            }
            if(this.type==QuantityType.CENTIMETER && quantity.type==QuantityType.KILOMETER){
                return this.value==1000*quantity.value;
            }
        }
        return quantity.value==this.value;
    }

    public static double sumOfMeterAndCentimeter(double meter, double centimeter){
        return (meter*100)+centimeter;
    }

    public static double sumOfKilometerAndCentimeter(double centimeter, double kilometer){
        return (kilometer*100000)+centimeter;
    }

}
