package org.sajourney.demo_spring;


public class Dev {
    private Computer comp;
    private int age;
    public Dev(){
        System.out.println("Dev Constructor");
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        System.out.println("working on awesome project");

       laptop.compile();

    }
}
