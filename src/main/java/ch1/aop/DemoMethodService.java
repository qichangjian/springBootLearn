package ch1.aop;

import org.springframework.stereotype.Service;
//编写 使用方法规则  被拦截类
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("[方法规则式拦截的add方法]");
    }
    public void delete(){
        System.out.println("[方法规则式拦截的delete方法]");
    }
}
