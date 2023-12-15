public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person();
        person1.name = "Gibran";
        person1.address = "Yogyakarta";
//        person1.country = "Indonesia"; karna sudah dikasih nilai variable di class Person

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Ibrahim");

        Person person2 = new Person();

        Person person3;
        person3 = new Person();
        person3.name = "Berti";
        person3.sayHello("Wahyu");


    }
}
