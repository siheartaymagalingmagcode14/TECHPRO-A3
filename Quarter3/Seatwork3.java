package Quarter3;

class Animal {
    private String name;
    private int age;

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }
    public int getAge() { return age; }

    void sound() {
        System.out.println("sounds here...");
    }

    void sound(int times) {
        for (int i = 0; i < times; i++) {
            sound();
        }
    }
}

class Unicorn extends Animal {
    @Override
    void sound() {
        System.out.println("Neighhh!");
    }
}

class Cryptid extends Animal {
    @Override
    void sound() {
        System.out.println("Woof woof!");
    }
}

class Mermicorn extends Animal {
    @Override
    void sound() {
        System.out.println("Bluuub blub!");
    }
}

class Goose extends Animal {
    @Override
    void sound() {
        System.out.println("Quack quack.");
    }
}

public class Seatwork3 {
    public static void main(String[] args) {
        Unicorn unicorn = new Unicorn();
        Cryptid cryptid = new Cryptid();
        Mermicorn mermicorn = new Mermicorn();
        Goose goose = new Goose();

        unicorn.setName("Uniboy");
        unicorn.setAge(12);
        
        cryptid.setName("Uniboy");
        cryptid.setAge(300);

        mermicorn.setName("Uniboy");
        mermicorn.setAge(1);

        goose.setName("Uniboy");
        goose.setAge(15);

        unicorn.sound(20);
        cryptid.sound(2);
        mermicorn.sound(1);
        mermicorn.sound(3);
    }
}