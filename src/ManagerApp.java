public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Ibrahim");
        manager.sayHello("Gibran");

        var vp = new VicePresident("El");
        vp.sayHello("Gibran");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
