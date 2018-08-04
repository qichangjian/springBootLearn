package ch2.prepost;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Service
public class JSR250WayService {
    @PostConstruct // @PostConstruct在构造器执行完后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy //@PreDestroy 在Bean销毁之前执行
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }
}
