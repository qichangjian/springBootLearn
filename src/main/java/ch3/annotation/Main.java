package ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 组合注解（元注解）被注解的注解
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
