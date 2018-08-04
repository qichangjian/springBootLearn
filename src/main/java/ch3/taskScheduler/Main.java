package ch3.taskScheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring3.1开始，计划任务变的简单
 * 首先通过在配置类注解@EnableScheduling来开启对计划任务的支持
 * 然后再要执行任务的方法上注解@Scheduled,声明这是一个计划任务
 * spring通过@Scheduled支持多种类型的计划任务：包括cron,fixDelay,fixRate等
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
