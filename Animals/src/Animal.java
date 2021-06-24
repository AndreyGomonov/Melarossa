public class Animal {
    protected String food;
    protected String location;

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("his noise is");
    }

    public void east() {
        System.out.println("his food is");
    }

    public static void sleep() {
        System.out.println("sleep");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }


}
