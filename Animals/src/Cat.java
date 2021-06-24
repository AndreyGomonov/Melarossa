public class Cat extends Animal{
    private long toothLength;

    public Cat(String food, String location, long toothLength) {
        super(food, location);
        this.toothLength=toothLength;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");;
    }

    @Override
    public void east() {
        super.east();
    }

    public long getToothLength() {
        return toothLength;
    }

    public void setToothLength(long toothLength) {
        this.toothLength = toothLength;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", toothLength=" + toothLength +
                '}';
    }
}
