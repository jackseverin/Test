// 定义Animal接口
interface Animal {
    void cry();
    String getAnimalName();
}

// 实现Dog类，实现Animal接口
class Dog implements Animal {
    @Override
    public void cry() {
        System.out.println("狗在汪汪叫");
    }

    @Override
    public String getAnimalName() {
        return "狗";
    }
}

// 实现Cat类，实现Animal接口
class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("猫在喵喵叫");
    }

    @Override
    public String getAnimalName() {
        return "猫";
    }
}

// 实现Simulator类，用于播放动物的叫声和显示种类名称
class Simulator {
    public void playSound(Animal animal) {
        System.out.print("这是一只" + animal.getAnimalName() + "，叫声是：");
        animal.cry();
    }
}

public class Test {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();

        // 模拟狗叫声
        Animal dog = new Dog();
        simulator.playSound(dog);

        // 模拟猫叫声
        Animal cat = new Cat();
        simulator.playSound(cat);
    }
}
