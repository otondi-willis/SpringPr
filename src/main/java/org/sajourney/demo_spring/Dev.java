package org.sajourney.demo_spring;


public class Dev {
    private Computer comp;

    public Dev(){
        System.out.println("Dev Constructor");
    }





    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        System.out.println("working on awesome project");

       comp.compile();

    }
}
