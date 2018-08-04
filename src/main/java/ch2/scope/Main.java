package ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * scope描述的是spring容器，怎样新建Bean实例的
 * Singleton:一个容器只有一个Bean容器，默认配置
 * Prototype：每次调用新建一个Bean的实例
 * Request:Web项目中，给每一个HTTP request新建一个Bean实例
 * Session：    ...,给每个HTTP session新建一个Bean实例
 * GlobalSession,这个只有portal应用中有，给每一个global http session新建一个实例
 *
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService demoSingletonService = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService demoPrototypeService = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);

        System.out.println("单例singleton是否相等：" + demoSingletonService.equals(demoSingletonService1));
        System.out.println("prototype是否相等：" + demoPrototypeService.equals(demoPrototypeService1));

        context.close();
    }
}
