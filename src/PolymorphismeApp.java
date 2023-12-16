public class PolymorphismeApp {
    public static void main(String[] args) {

        Employee employee =  new Employee("Ibrahim");
        employee.sayHello("Gibran");

        employee = new Manager("Ibrahim");
        employee.sayHello("Gibran");

        employee = new VicePresident("Ibrahim");
        employee.sayHello("Gibran");

        // menggunakan method polymorphismeApp
        sayHello(new Employee("Ibrahim"));
        sayHello(new Manager("El"));
        sayHello(new VicePresident("Gibran"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hallo " + employee.name);
    }
}
