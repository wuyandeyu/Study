package cn.gao.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;


public class BeanFactory {
    private static Properties properties;
    private static Map<String,Object> beans;
    static {
        properties = new Properties();
        InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("初始化出错");
        }
    }
    public static Object getBean(String beanName){
        Object bean = null;
        String beanPath = properties.getProperty(beanName);
        try {
            bean = Class.forName(beanPath).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
