package ru.borisova;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");

       TestBean testBeanObj =  context.getBean("testBean", TestBean.class);

        System.out.println(testBeanObj.getName());


        Resource BeanMap = context.getResource("AdditionalParams");

        BeanMap beanMapd = new BeanMap();






      System.out.println(beanMapd.getMyMap(context.getResource("AdditionalParams")).containsKey(key));



     // System.out.println(BeanMap.get('key')});

     //   context.close();

    }

}
