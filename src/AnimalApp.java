import annotation.Fancy;
import iegcode.java.data.Animal;
import iegcode.java.data.Cat;

@Fancy(name = "AnimalApp", tags = {"Application", "Java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puas";
        animal.run();
    }
}
