package ch3.enable;

import org.springframework.aop.config.AopConfigUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

class AspectJAutoProxyRegistrar implements ImportBeanDefinitionRegistrar {
    /**这一个文件夹没听理解
     * 出错不会改了？？？？？？？？？？？？？？？？、
     * @param importingClassMetadata
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(
            AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//
//        AopConfigUtils.registerAspectJAnnotationAutoProxyCreatorIfNecessary(registry);
//
//        AnnotationAttributes enableAJAutoProxy =
//                AnnotationConfigUtils.attributesFor(importingClassMetadata, EnableAspectJAutoProxy.class);
//        if (enableAJAutoProxy.getBoolean("proxyTargetClass")) {
//            AopConfigUtils.forceAutoProxyCreatorToUseClassProxying(registry);
//        }
    }

}