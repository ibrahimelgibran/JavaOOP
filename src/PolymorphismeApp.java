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
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
                System.out.println("Hallo VP " + vicePresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hallo Manager " + manager.name);
        } else {
            System.out.println("Hallo " + employee.name);
        }
    }
}
