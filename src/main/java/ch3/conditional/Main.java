package ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 2.4学到，通过活动profile我们可以获得不同的Bean,
 * spring4提供了更精通的基于条件的Bean的创建，使用@Conditional注解
 *
 * @Conditional根据满足某一个特定条件创建一个特定的Bean。
 * 比方说，只有某个Bean被创建的时候另外一个Bean才会创建
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListCmd());
    }
}
