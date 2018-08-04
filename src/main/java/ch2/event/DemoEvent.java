package ch2.event;

import org.springframework.context.ApplicationEvent;

//自定义事件，集成ApplicationEvent
public class DemoEvent extends ApplicationEvent {
    //Java的序列化机制是通过在运行时判断类的serialVersionUID来验证版本一致性的
    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
