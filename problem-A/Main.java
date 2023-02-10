public class Main {
    public static void main(String[] args){
        Dog a = new Dog("Barsik");
        System.out.println(a);
        
        Animal x = new Animal("Elephant");
        Mammal q = new Mammal("Elephant");
        Cat e = new Cat("Mursik");
        System.out.println(x);
        System.out.println(q);
        System.out.println(e);
        
        e.greets();
        a.greets();
        Dog p = new Dog("AKtose");
        a.greets(a);

    }
}
