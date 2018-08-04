package ch3.taskScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

//计划任务执行类
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//通过@Scheduled声明方法是(fixedRate = 5000)每隔固定五秒执行一次
    public void reportCurrentTime(){
        System.out.println("每个五秒执行一次" + dateFormat.format(new Date()));
    }

    //cron是UNIX和类UNIX（Linux）系统下的定时任务
    @Scheduled(cron = "0 47 15 ? * *")//cron可按照指定时间执行，11点28执行
    public void fixTimExecution(){
        System.out.println("在指定时间" + dateFormat.format(new Date()) + "执行");
    }
}
