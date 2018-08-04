package ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//定义事件监听器，并实现ApplicationListener接口，并制定监听的事件类型
//@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
@Component //（把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
public class DemoListener implements ApplicationListener<DemoEvent> {

    //使用onApplicationEvent方法对消息进行接受处理
    @Async
    @Override
    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();
        System.out.println("我（bean-demoListener）接收了bean-demoPublisher发布的消息：" + msg);
    }
}
