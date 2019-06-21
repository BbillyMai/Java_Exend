package model;

public class Cat extends Animal {

    public Cat(int age, double weight) {
        super(age, weight);
    }

    public void say(){
        System.out.println("喵喵叫。。。");
    }
}
