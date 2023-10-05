package vn.edu.iuh.fit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerson {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Person.xml");
        Person ps1 = ctx.getBean(Person.class);
        System.out.println(ps1);
    }
}
