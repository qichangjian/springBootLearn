package ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
//把配置文件中的东西提取出来放在这个类中（测试）
@Service
@PropertySource("classpath:ch2/el/test.properties")
public class TestDemoService {
    /**
     * @Value("#{}") 表示SpEl表达式通常用来获取bean的属性，或者调用bean的某个方法。当然还有可以表示常量
     * 通过@Value("${}") 可以获取对应属性文件中定义的属性值。properties文件
     */
    @Value("I LOVE YOU！")//注入字符串
    private String normal;

    @Value("#{systemProperties['os.name']}")//获取操作系统名
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0}")//注入表达式结果
    private double randomNumber;

    @Value("#{demoService.another}")//注入其他Bean的属性
    private String fromAnother;

    @Value("classpath:ch2/el/test.txt")//注入文件内容
    private Resource testFile; //注意这个Resource是org.springframework.core.io.Resource;

    @Value("http://www.baidu.com")//注入网络资源内容
    private Resource testUrl;

    @Value("${book.name}")//注入属性文件
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean   //注入配置文件
    public static PropertySourcesPlaceholderConfigurer propertypeConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    //注入配置配件需要使用@PropertySource指定文件地址，
    // 若使用@Value注入，则要配置一个PropertySourcesPlaceholderConfigurer的Bean。
    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
