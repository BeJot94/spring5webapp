package pl.bejot.dependencyinjection.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean,
        DisposableBean {

    public LifeCycleDemoBean() {
        System.out.println("## 1. step of Creation - instantiation");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## 2. step of Creation - BeanNameAware.setBeanName(" + name + ")");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3. step of Creation - BeanFactoryAware.setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4. step of Creation - ApplicationContextAware.setApplicationContext");
    }

    public void beforeInit() {
        System.out.println("## 5. step of Creation - BeanPostProcessor.postProcessBeforeInitialization");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## 6. step of Creation - @PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 7. step of Creation - InitializingBean.afterPropertiesSet");
    }

    public void afterInit() {
        System.out.println("## 8. step of Creation - BeanPostProcessor.postProcessAfterInitialization");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 1. step of Destroy - @PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 2. step of Destroy - DisposableBean.destroy");
    }
}
