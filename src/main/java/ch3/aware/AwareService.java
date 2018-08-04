package ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

//实现BeanNameAware, ResourceLoaderAware接口，并获得Bean名称和资源加载的服务
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    //实现BeanNameAware需要重写setBeanName方法
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    //实现ResourceLoaderAware需要重写setResourceLoader方法
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = loader.getResource("classpath:ch3/aware/test.txt");
        try{
            System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
