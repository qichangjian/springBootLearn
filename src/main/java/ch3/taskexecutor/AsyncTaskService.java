package ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
    @Async//注释表明是异步方法，如果注释在类上，类中的方法都是异步方法
    // .而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
    public void executeAsynoTask(Integer i){
        System.out.println("异步执行任务：" + i);
    }

    public void executeAsynoTaskPlus(Integer i){
        System.out.println("异步执行任务+1：" + (i+1));
    }

}
