package ru.borisova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");

       TestBean testBeanObj =  context.getBean("testBean", TestBean.class);

        System.out.println(testBeanObj.getName());

        context.close();

    }

}
