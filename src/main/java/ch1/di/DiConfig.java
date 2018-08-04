package ch1.di;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable  //声明当前类是一个配置类 相当于spring配置的xml
@ComponentScan("ch1.di")  //自动扫描包名下所有使用@Service,@Component @Repository @Controller并注册为Bean
public class DiConfig {

}
