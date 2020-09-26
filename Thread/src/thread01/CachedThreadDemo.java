package thread01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadDemo {

    public static void main(String[] args){
        ExecutorService es3 = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            es3.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行任务");
                }
            });
        }
    }

}
