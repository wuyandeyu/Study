package cn.gao.factoy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
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
            beans = new HashMap<String,Object>();
            Enumeration keys = properties.keys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String beanPath = properties.getProperty(key);
                Object value = Class.forName(beanPath). newInstance();
                beans.put(key,value);
            }
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("初始化出错");
        }
    }
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }
}
