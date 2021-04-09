package com.cg.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start" );
        
        // Annotation based configuration
        //Its like Bean factory
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Employee obj = context.getBean(Employee.class);
        
        obj.work();
        
        context.close();
        System.out.println("End");
    }
}
