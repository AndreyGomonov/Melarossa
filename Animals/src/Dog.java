public class Dog extends Animal {
    private long biteStrength;


    public Dog(String food, String location, long biteStrength) {
        super(food, location);
        this.biteStrength = biteStrength;
    }

    public long getBiteStrength() {
        return biteStrength;
    }

    @Override
    public void makeNoise() {
        System.out.println("Gav-Gav");
    }

    @Override
    public void east() {
        System.out.println("Im eating dog food");
    }

    public void setBiteStrength(long biteStrength) {
        this.biteStrength = biteStrength;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", biteStrength=" + biteStrength +
                '}';
    }
}
