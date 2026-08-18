class Animal1 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class BabyCat extends Cat {
    void play() {
        System.out.println("Baby Cat plays");
    }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        BabyCat b = new BabyCat();

        b.eat();
        b.meow();
        b.play();
    }
}