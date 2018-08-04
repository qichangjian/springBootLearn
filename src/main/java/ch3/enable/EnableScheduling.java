package ch3.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;
//第一类直接导入配置类
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(SchedulingConfiguration.class) //导入配置类SchedulingConfiguration这个类注解了@Configuration
@Documented
public @interface EnableScheduling {
}
