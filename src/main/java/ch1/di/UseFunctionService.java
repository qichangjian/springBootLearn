package ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //声明当前类是spring管理的一个Bean
public class UseFunctionService {
    @Autowired  //将Functionservice的实体Bean注入到userFunctionService中
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
