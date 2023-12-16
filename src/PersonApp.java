public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Gibran", "Yogyakarta");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Ibrahim");

        Person person2 = new Person("Berti");

        Person person3;
        person3 = new Person();
        person3.name = "Wahyu";
        person3.sayHello("Santoasa");
    }
}
