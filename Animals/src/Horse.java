public class Horse extends Animal {
    private long tailLength;


    public Horse(String food, String location,long tailLength) {
        super(food, location);
        this.tailLength=tailLength;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void east() {
        super.east();
    }

    public long getTailLength() {
        return tailLength;
    }

    public void setTailLength(long tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", tailLength=" + tailLength +
                '}';
    }
}
