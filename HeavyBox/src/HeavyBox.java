import java.util.List;

public class HeavyBox {
    protected int weight;
    protected String someObject;

    public HeavyBox(int weight, String someObject) {
        this.weight = weight;
        this.someObject = someObject;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSomeObject() {
        return someObject;
    }

    public void setSomeObject(String someObject) {
        this.someObject = someObject;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", someObject='" + someObject + '\'' +
                '}';
    }
}

