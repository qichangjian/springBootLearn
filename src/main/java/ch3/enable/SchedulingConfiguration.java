package ch3.enable;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.config.TaskManagementConfigUtils;

/**
 * 这个类注解了@Configuration，且注册了一个scheduledAnnotationProcessor的Bean
 */
@Configuration
@Role(BeanDefinition.ROLE_INFRASTRUCTURE)//注册了一个scheduledAnnotationProcessor的Bean
public class SchedulingConfiguration {

    @Bean(name = TaskManagementConfigUtils.SCHEDULED_ANNOTATION_PROCESSOR_BEAN_NAME)
    @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
    public ScheduledAnnotationBeanPostProcessor scheduledAnnotationBeanPostProcessor(){
        return new ScheduledAnnotationBeanPostProcessor();
    }
}
