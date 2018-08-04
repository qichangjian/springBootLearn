package ch1.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

//编写切面
@Aspect     //通过@AsPect注解声明一个变量
@Component  //通过@Component让这个切面成为Spring容器管理的Bean
public class LogAspect {

    //通过切点来选择连接点  @annotation,限定匹配带有指定注解的连接点
    ///配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
    @Pointcut("@annotation(ch1.aop.Action)") //注解声明切点 在切面中定义可重用切点
    public void annotationPointCut(){};

    //@After 通知方法会在目标方法返回或抛出异常后调用
    //连接点(Join point)，是在应用执行过程中能够插入切面的一个点
    //配置后置通知,使用在方法aspect()上注册的切入点annotationPointCut(),同时接受JoinPoint切入点对象
    @After("annotationPointCut()") //通过 After注解声明一个建言，并使用@PointCut定义的切点
    public void after(JoinPoint joinPoint){//joinPoint用于获取目标方法相关信息的参数
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();//getSignature() ：获取连接点的方法签名对象；
        Method method = signature.getMethod();//得到拦截的method对象
        Action action = method.getAnnotation(Action.class);//方法如果存在这样的注释，则返回指定类型的元素的注释，否则为null
        System.out.println("注解式拦截:" + action.name());//通过反射可获取注解上的属性，然后做日志记录相关的操作
    }

    //通过@Before注解声明一个建言，此建言直接使用拦截规则作为参数
    @Before("execution(* ch1.aop.DemoMethodService.*(..))") //注意！！！星号后面要有个空格
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则式拦截：" + method.getName());
    }


}
