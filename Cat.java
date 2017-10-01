package HomeWorkLessonOneTaskOne;

public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;
    private String food;

    public Cat(String name, String color, int age, double weight, String food) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }

    public Cat() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", food='" + food + '\'' +
                '}';
    }

    public void feedMe(String food) {
        this.weight = getWeight() * 1.1;
        System.out.println("Cats weight has been increased for 10% and equal is " + weight);
    }

    public void play(String name) {
        System.out.println(name + " wants to play with you!");
    }


}

