package ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Bean是一个方法级别上的注解，主要用在@Configuration注解的类里，
 * 也可以用在@Component注解的类里。添加的bean的id为方法名
 *
 * Spring的@Bean注解用于告诉方法，产生一个Bean对象，然后这个Bean对象交给Spring管理。
 * 产生这个Bean对象的方法Spring只会调用一次，随后这个Spring将会将这个Bean对象放在自己的IOC容器中。
 *
 * 为什么bean要在这里注释，这个方法的用处是什么？什么时候调用的bean
 */
@Configuration
@ComponentScan("ch2.prepost")
public class PrePostConfig {

    //initMethod 和 destroyMethod 指定 BeanWayService的init和destroy方法在构造之后，Bean销毁之前执行
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }//加不加public都行

    //这里的代码相当于在JSR250WayService类中上部分加入@Service ，作用都是用于创建Bean
//    @Bean
//    public JSR250WayService jsr250WayService(){
//        return new JSR250WayService();
//    }
}
