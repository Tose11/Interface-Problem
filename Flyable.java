
package extrainterface3;

public interface Flyable {

    void fly_obj();
}

class Spacecraft implements Flyable {

    public void fly_obj() {
        System.out.println("Spacecraft is flying");
    }
}

class Airplane implements Flyable {

    public void fly_obj() {
        System.out.println("Airplane is flying");
    }
}

class Helicopter implements Flyable {

    public void fly_obj() {
        System.out.println("Helicopter is flying");
    }
}
class Main {
    public static void main(String[] args) {
        new Spacecraft().fly_obj();
        new Airplane().fly_obj();
        new Helicopter().fly_obj();
    }
}