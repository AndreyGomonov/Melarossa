public class Veterinarian {
    private String veterinarianName;
    public Veterinarian(String veterinarianName) {
        this.veterinarianName = veterinarianName;
    }

    public void treatAnimal(Animal animal){
        System.out.println(veterinarianName + " treat this " + animal);
    }

}
