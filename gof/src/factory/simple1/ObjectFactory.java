package factory.simple1;

public class ObjectFactory {

    public static Object getObject(Class<Object> clazz) {

        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
