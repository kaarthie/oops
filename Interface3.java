package Interface;
interface Flying {
    void fly();
}
interface Swimming {
    void swim();
}
class Bird implements Flying {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}
class Fish implements Swimming {
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}
class FlyingFish implements Flying, Swimming {
    public void fly() {
        System.out.println("Flying fish is flying.");
    }
    public void swim() {
        System.out.println("Flying fish is swimming.");
    }
}
class Main1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        Fish fish = new Fish();
        fish.swim();
        FlyingFish flyingFish = new FlyingFish();
        flyingFish.fly();
        flyingFish.swim();
    }
}

