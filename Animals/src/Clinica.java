import java.util.ArrayList;
import java.util.List;

public class Clinica {
    public static void main(String[] args) {
        Animal pushok = new Dog("meat", "budka", 11);
        Animal snow = new Cat("meat", "budka", 8);
        Animal rose = new Horse("meat", "budka", 15);
        Animal simba = new Dog("vegetables", "home", 8);
        List<Animal> animals = new ArrayList<>();
        animals.add(pushok);
        animals.add(snow);
        animals.add(rose);
        animals.add(simba);
        Veterinarian veterinarian = new Veterinarian("Andrey");
        for (Animal a : animals) {
            veterinarian.treatAnimal(a);
        }
    }
}
