package ch3.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("ch3.taskScheduler")
@EnableScheduling //注释开启计划任务的支持
public class TaskSchedulerConfig {
}
