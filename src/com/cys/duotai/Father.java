package com.cys.duotai;

public class Father {
    private String name;
    private int age;
    public Father(){}

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("I am father !!!!");
    }
    private void sayTow(){
        System.out.println("Fuck");
    }
}
