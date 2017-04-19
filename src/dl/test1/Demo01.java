package dl.test1;

/**
 * Created by GSN on 2017/4/18.
 * 饿汉式：线程安全 调用率高 不能延时加载
 */
public class Demo01 {

    private static Demo01 demo01 = new Demo01();

    private Demo01() {
    }

    public static Demo01 getDemo01() {
        return demo01;
    }

    public void print() {
        System.out.println("Demo01");
    }

}
