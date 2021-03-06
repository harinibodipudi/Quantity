package utility;

public class Quantity{
    public double value;
    public QuantityType type;

    public Quantity(double value, QuantityType type) {
        this.value = value;
        this.type= type;
    }
    public static double convertingCentimeterToMeter(double centimeter){
        return centimeter*0.01;
    }
    public static double meterToKilometer(double meter){
        return meter*0.001;
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
                return this.value==convertingCentimeterToMeter(quantity.value);
            }
            if(this.type==QuantityType.CENTIMETER && quantity.type==QuantityType.KILOMETER){
                return meterToKilometer(convertingCentimeterToMeter(this.value))==quantity.value;
            }
        }
        return quantity.value==this.value;
    }

    public static double sumOfMeterAndCentimeterInCentimeter(double meter, double centimeter){
        double centimeterInMeter = convertingCentimeterToMeter(centimeter);
        return (meter);

    }

    public static double sumOfKilometerAndCentimeterInCentimeter(double centimeter, double kilometer){
        return (kilometer)+centimeter;
    }

    public static double differenceOfMeterAndCentimeterInMeter(double meter, double centimeter){

        return (meter)-(0.01*centimeter);
    }

    public static double differenceOfCentimeterAndMeterInCentimeter(double centimeter, double meter){
        return (centimeter)-(100*meter);
    }

}
