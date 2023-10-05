package vn.edu.iuh.fit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        Student st1 = ctx.getBean("st1", Student.class);
        System.out.println(st1);

        Student st2 = ctx.getBean("st2", Student.class);
        System.out.println(st2);
    }
}