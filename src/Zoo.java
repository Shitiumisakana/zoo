package animal_part;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    // 添加动物
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // 删除动物
    public void removeAnimal(String name) {
        animals.removeIf(animal -> animal.getName().equals(name));
    }

    // 修改动物信息
    public void updateAnimal(String name, Animal updatedAnimal) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getName().equals(name)) {
                animals.set(i, updatedAnimal);
                break;
            }
        }
    }
    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}