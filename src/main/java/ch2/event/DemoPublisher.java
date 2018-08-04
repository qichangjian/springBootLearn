package ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//再次使用容器对事件进行发布
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;//注入ApplicationContext用来发布 事件

    public void publish(String msg){
        //使用ApplicationContext的publishEvent来发布
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
