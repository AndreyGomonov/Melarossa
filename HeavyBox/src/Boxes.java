import java.util.ArrayList;
import java.util.List;

public class Boxes {
    public static void main(String[] args) {
        HeavyBox heavyBoxOne = new HeavyBox(10, "guitar");
        HeavyBox heavyBoxTwo = new HeavyBox(8, "car");
        HeavyBox heavyBoxThree = new HeavyBox(7, "cat");
        HeavyBox heavyBoxFour = new HeavyBox(7, "laptop");
        HeavyBox heavyBoxFive = new HeavyBox(9, "dog");
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(heavyBoxOne);
        boxes.add(heavyBoxTwo);
        boxes.add(heavyBoxThree);
        boxes.add(heavyBoxFour);
        boxes.add(heavyBoxFive);

        for (HeavyBox box : boxes) {
        System.out.println(box);
        }
        boxes.get(0).setWeight(boxes.get(0).getWeight() - 1);
        System.out.println("The weight of heavyBoxOne now is " + heavyBoxOne.weight);

        boxes.remove(boxes.size() - 1);
        System.out.println(boxes);

        boxes.clear();
        System.out.println(boxes.size());
    }
}
