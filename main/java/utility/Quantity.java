package utility;

public class Quantity{
    public int value;
    public QuantityType type;

    public Quantity(int value, QuantityType type) {
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
        }
        return quantity.value==this.value;
    }
}
