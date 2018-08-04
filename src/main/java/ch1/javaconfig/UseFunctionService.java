package ch1.javaconfig;

public class UseFunctionService {
    FunctionService functionService;
    //加入构造方法
    public UseFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
