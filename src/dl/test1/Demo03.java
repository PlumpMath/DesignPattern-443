package dl.test1;

/**
 * Created by GSN on 2017/4/19.
 * 静态内部类：线程安全 调用率高 可以延时加载
 */
public class Demo03 {

    private Demo03() {
    }

    private static class DemoInner {
        private static Demo03 demo03 = new Demo03();
    }

    public static Demo03 getDemo03() {
        return DemoInner.demo03;
    }

    public void print() {
        System.out.println("Demo03");
    }

}
