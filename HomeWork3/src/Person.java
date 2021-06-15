import java.math.BigDecimal;

public class Person {
    private String fullName;
    private long age;

    public Person(String fullName, long age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public void talk() {
        System.out.println(this.fullName + " Hello guys!");
    }

    public void move() {
        System.out.println(this.fullName + " going for a walk with my cat");
    }


    public String getFullName() {
        return fullName;
    }

    public long getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
