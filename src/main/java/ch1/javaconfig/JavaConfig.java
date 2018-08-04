package ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
    //注入Bean的依赖性
    @Bean
    public UseFunctionService useFunctionService(){
        return new UseFunctionService(functionService());
    }
}
