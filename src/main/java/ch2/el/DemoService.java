package ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
//需要被注入的Bean
@Service
public class DemoService {
    @Value("其他属性的值") //注入普通字符串
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
