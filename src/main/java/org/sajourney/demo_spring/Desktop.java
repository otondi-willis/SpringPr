package org.sajourney.demo_spring;

public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop Constructor");
    }
    public void compile(){
        System.out.println("compiling in desktop");
    }
}
