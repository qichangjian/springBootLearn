package ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    //理解：WindowsCondition.class中条件满足就实例化
    @Bean
    @Conditional(WindowsCondition.class)//通过 @Conditional注解，符合Windows条件就实例化WindowsListService
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)//通过 @Conditional注解，符合linux条件就实例化LinuxListService
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
