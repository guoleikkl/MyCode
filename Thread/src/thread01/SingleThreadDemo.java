package thread01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadDemo {

    public static void main(String[] args){
        ExecutorService pool = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 10; i++){
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行任务");
                }
            });
        }
        pool.shutdown();
    }


}
