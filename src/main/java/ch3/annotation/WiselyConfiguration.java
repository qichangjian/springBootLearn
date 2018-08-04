package ch3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;
//组合Configuration ComponentScan注解
@Target(ElementType.TYPE)  //而Target也搭配ElementType表示这注解可以修饰哪些目标
@Retention(RetentionPolicy.RUNTIME) //告诉这个注解在使用的时候即可以用到.Class文件，又能在运行过程中通过反射的方式读取出来
@Documented   //表示带@Documented修饰的东西会添加到生成文档的API中去
@Configuration //组合@Configuration 注解
@ComponentScan //组合@ComponentScan 注解
public @interface WiselyConfiguration {
    String[] value() default {};//覆盖value值
}
