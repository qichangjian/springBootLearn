package ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring是通过任务执行器（TaskExecutor）l来实现多线程和并发编程。
 * 使用ThreadPoolTaskExecutor可实现一个基于线程池的TaskExecutor。
 * 实际开发中任务一般是非阻碍的，也就是异步的，
 * 所以我们要在配置类中通过@EnableAsync开启对异步任务的支持，
 * 并通过在实际执行的Bean的方法中使用@Async注解来声明其是一个异步任务
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsynoTask(i);
            asyncTaskService.executeAsynoTaskPlus(i);
        }
        context.close();
    }
}
