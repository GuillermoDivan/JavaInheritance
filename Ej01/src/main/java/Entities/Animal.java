package Entities;

public abstract class Animal {
    protected String name;
    protected String foodSource;
    protected int age;
    protected String race;

    public Animal() {
    }

    public Animal(String name, String foodSource, int age, String race) {
        this.name = name;
        this.foodSource = foodSource;
        this.age = age;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodSource() {
        return foodSource;
    }

    public void setFoodSource(String foodSource) {
        this.foodSource = foodSource;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", foodSource='" + foodSource + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                '}';
    }

    public void showFoodSource(){
        System.out.println(getFoodSource());
    };
}

