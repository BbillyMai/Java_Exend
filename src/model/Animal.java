package model;

public class Animal {
    private int age;
    private double weight;

    public Animal(int age,double weight){
        this.age = age ;
        this.weight = weight;
    }

    public void run(){
        System.out.println("正在跑。。。。");
    }

    public void eat(){
        System.out.println("正在吃东西。。。。");
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
}
