package ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //使用AnnotationConfigApplicationContext作为spring容器，接受输入一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        //获取声明配置的UserFunctionService的Bean
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();//调用注解式拦截的add方法
        demoAnnotationService.delete();
        demoMethodService.add();//调用方法规则式拦截的add方法
        demoMethodService.delete();

        context.close();

    }
}
