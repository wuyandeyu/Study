package cn.gao.oop.extendschapter;

/**语法Grammar  定义definition
 * 所有自定义类默认继承了JDK内置的Object类，所以自然有了Object类中的所有方法
 * Object类默认有12个方法，和一个静态代码类加载块
 */
public class Parents {
        public void  parentsMethod(){
            System.out.println("parents");
            {
                System.out.println("JuBuDaiMaKua");
            }
        }
}
