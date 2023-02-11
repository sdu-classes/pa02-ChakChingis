
public class Main {
    public static void main(String[] args){
        Animal x = new Animal("Elephant");
        Mammal q = new Mammal("Elephant");
        Cat e = new Cat("Mursik");
        Dog a = new Dog("Barsik");
        Dog dog = new Dog("China");
        System.out.println(x);
        System.out.println(q);
        System.out.println(e);
        System.out.println(a);
        e.greets();
        a.greets();
        a.greets(dog);
    }
}
