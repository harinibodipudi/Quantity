package utility;

public enum QuantityValues {
    VALUEASONE(1);
    public int value;

    QuantityValues(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
