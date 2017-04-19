package dl.test1;

/**
 * Created by GSN on 2017/4/19.
 * 枚举：线程安全 调用率高 不能延时加载
 */
public enum Demo04 {

    INSTANCE;

    public void print() {
        System.out.println("Demo04");
    }

}
