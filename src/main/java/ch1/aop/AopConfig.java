package ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//配置类
@Configuration //声明当前类是一个配置类 相当于spring配置的xml
@ComponentScan("ch1.aop") //自动扫描包名下所有使用@Service,@Component @Repository @Controller并注册为Bean
@EnableAspectJAutoProxy  //使用@EnableAspectJAutoProxy注解开启spring对aspectj代理的支持
public class AopConfig {
}
