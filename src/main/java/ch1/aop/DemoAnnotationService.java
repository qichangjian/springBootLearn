package ch1.aop;
import org.springframework.stereotype.Service;

//编写  使用注解的  被拦截类
/**
 * @service
 * 是有用的相当于 xml配置中得bean  id = service
 * 也可以不指定 不指定相当于 bean id =  com. service.service 就是这个类的全限定名,
 * 表示给当前类命名一个别名，方便注入到其他需要用到的类中；
 * 不加的话，默认别名就是当前类名，但是首字母小写
 *
 * 在持久层、业务层和控制层分别采用 @Repository、@Service 和 @Controller 对分层中的类进行注释，
 * 而用 @Component 对那些比较中立的类进行注释。
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("[注解式拦截的add方法输出]");
    }
    public void delete(){
        System.out.println("[注解式拦截的delete方法输出]");
    }
}
