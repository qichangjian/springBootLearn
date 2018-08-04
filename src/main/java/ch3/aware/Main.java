package ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Aware 的目的是为了让Bean获得spring容器的服务。因为ApplicationContext接口继承了MessageSource
 * 的接口，ApplicationEventPublisher接口和ResourceLoader接口。所以Bean继承ApplicationContextAware可以获得spring容器的所有服务，
 * 但原则上我们还是用到什么接口，就实现什么接口
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
