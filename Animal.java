
package extrainterface2;

public interface Animal {
      void bark();
}
class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking!");
    }
}

 class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.bark();
    }
}