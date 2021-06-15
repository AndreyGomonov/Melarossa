public class Solution {
    public static void main(String[] args) {
        Person person1 = new Person("Andrey", 23);
        Person person2 = new Person ();

        person2.talk(person2.getFullName());
        person1.move(person1.getFullName());
    }
}
