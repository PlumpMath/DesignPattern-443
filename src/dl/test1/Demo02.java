package dl.test1;

/**
 * Created by GSN on 2017/4/19.
 * 懒汉式：线程安全 调用率不高 可以延时加载
 */
public class Demo02 {

    private static Demo02 demo02;

    private Demo02() {
    }

    public static synchronized Demo02 getDemo02() {

        if (demo02 == null) {
            demo02 = new Demo02();
        }

        return demo02;

    }

    public void print() {
        System.out.println("Demo02");
    }

}
