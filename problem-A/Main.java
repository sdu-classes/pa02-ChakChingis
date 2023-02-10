public class Animal {
     String name;
     public Animal(String name){
         this.name = name;
     }
     public  String toString(){
         return "Animal[name ="  + name+"]";
     }

 }
 class Mammal extends Animal {
     public Mammal(String name) {
         super(name);
     }

     public String toString() {
         return "Mammal[" + super.toString() + "]";
     }
 }
 class Cat extends Mammal{
    public Cat(String name){
        super(name);
    }
    public static void greets(){
        System.out.println("Meow");
    }
    public String toString(){
        return "Cat["+ super.toString()+"]";
    }
 }
 class Dog extends Cat{
    public Dog(String name){
        super(name);
    }
    public static void greets(){
        System.out.println("Woof");
    }
    public static void greets(Dog another){
        System.out.println("Woooof");
    }

    public String toString(){
        return "Dog["+super.toString()+"]";
    }
 }
public class Main {
    public static void main(String[] args){
        Animal x = new Animal("Elephant");
        Mammal q = new Mammal("Elephant");
        Cat e = new Cat("Mursik");
        Dog a = new Dog("Barsik");
        System.out.println(x);
        System.out.println(q);
        System.out.println(e);
        System.out.println(a);
        e.greets();
        a.greets();
    }
}
