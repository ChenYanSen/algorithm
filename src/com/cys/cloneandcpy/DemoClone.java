package com.cys.cloneandcpy;

public class DemoClone {
    public static void main(String[] args) throws CloneNotSupportedException {
       Person person=new Person("张三",13);
        Person clone =(Person) person.clone();
      Person  person2=person;
      person.age=20;
        System.out.println("person:"+person.age);
        System.out.println("clone:"+clone.age);
        System.out.println("person2:"+person2.age   );
    }
}
