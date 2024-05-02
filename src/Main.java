
import java.util.ArrayList;
import java.util.List;

// 动物园类


// 主程序
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // 添加一些动物
        zoo.addAnimal(new Animal("Lion", "Mammal", 5));
        zoo.addAnimal(new Animal("Tiger", "Mammal", 6));
        zoo.addAnimal(new Animal("Elephant", "Mammal", 10));

        // 显示所有动物信息
        System.out.println("All Animals:");
        zoo.displayAnimals();

        // 删除一只动物
        zoo.removeAnimal("Tiger");
        System.out.println("\nAfter removing Tiger:");
        zoo.displayAnimals();

        // 修改一只动物信息
        Animal updatedElephant = new Animal("Elephant", "Mammal", 15);
        zoo.updateAnimal("Elephant", updatedElephant);
        System.out.println("\nAfter updating Elephant's age:");
        zoo.displayAnimals();
    }
}