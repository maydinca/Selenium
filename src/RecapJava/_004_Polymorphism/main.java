package RecapJava._004_Polymorphism;

class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Hayvan konusuyor");
    }
}

class Bird extends Animal {


    public Bird(String name) {
        super(name);
    }


    @Override
    public void speak() {
        System.out.println(getName() + "otuyor...");
    }
}
class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "havliyor...");
    }
}
class Horse extends Animal {


    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "kisniyor...");
    }
}

public class main {
    public static void main(String[] args) {

        Animal animal =new Animal("Hayvan ");
        Bird bird=new Bird("Limon ");
        Dog dog=new Dog("barbar ");
        Horse horse =new Horse("gulbatur ");

        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();
        System.out.println("-------------------------------------------");
        Animal animal2 =new Bird("Limon");
        animal2.speak();

    }

}
