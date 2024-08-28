package org.sajourney.demo_spring;


public class Dev {
    private Laptop laptop;
    private int age;
    public Dev(){
        System.out.println("Dev Constructor");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev1 constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("working on awesome project");

       laptop.compile();

    }
}
