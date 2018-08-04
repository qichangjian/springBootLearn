package ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//SpringJUnit4ClassRunner.class在JUnit环境下提供spring TestContext Framework的功能
@ContextConfiguration(classes={TestConfig.class})//@ContextConfiguration用来加载配置ApplicationContext,classes用来加载配置类
@ActiveProfiles("prod")//@ActiveProfiles声明活动的profile
public class DemoBeanTntegrationTest {
    @Autowired//可使用普通的@Autowired注入bean
    private TestBean testBean;

    @Test
    public void prodBeanSchouldInject(){//测试代码通过断言来判断结果是否一致
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
