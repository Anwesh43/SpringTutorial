package com.demos.anwesh;

/**
 * Hello world!
 *
 */
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CourtRoom courtRoom = (CourtRoom)context.getBean("courtRoom");
        courtRoom.decide();
        courtRoom.maintainOrder();
    }
}
