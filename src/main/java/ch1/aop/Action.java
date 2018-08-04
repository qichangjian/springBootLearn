package ch1.aop;

import java.lang.annotation.*;

//编写拦截规则的注解，也就是定义了一个注解，@Action

/**注解本身没有功能的，和xml一样。注解和xml都是一种元数据，uejiushi解释数据的数据，这就是所谓的配置
 *注解的注解成为元注解。
 * 注解说明：元注解是指注解的注解，包括@Retention @Target @Document @Inherited四种。
 *
 *Target:
 * 而Target也搭配ElementType表示这注解可以修饰哪些目标
 ANNOTATION_TYPE: 注解只能修饰注解，不能修饰其他的东西
 CONSTRUCTOR: 注解只能修饰构造方法
 FIELD: 注解只能修饰属性(成员变量)
 LOCAL_VARIABLE: 注解只能修饰局部变量
 METHOD: 注解只能修饰方法
 PACKAGE: 注解只能修饰包
 PARAMETER: 注解只能修饰方法的参数
 TYPE: 注解只能修饰类、接口、枚举
 *Rentention:
 * 告诉这个注解在使用的时候即可以用到.Class文件，
 又能在运行过程中通过反射的方式读取出来
 *Doucumente:
 *表示带@Documented修饰的东西会添加到生成文档的API中去

 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Documented
public @interface Action {
    String name();
}
