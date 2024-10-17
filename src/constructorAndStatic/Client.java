package constructorAndStatic;

public class Client {
    public static void main(String[] args){
        Employee e = new Employee();
        System.out.println(e.name);
        System.out.println(e.salary);

        e.name = "Deepan";
        e.salary = 200000;

        System.out.println(e.name);
        System.out.println(e.salary);
    }
}
