package Singleton;

class demo{

    String email;
    private static demo instance=null;
//    private static demo instance=new demo();-> i can do like that also but it will create object while loading the class
//    rest of the code will excute later

    private demo(){

    }
    public static  demo connect() {
        if(instance==null) {
//            This is just a duble checking before enter for excute
            synchronized (demo.class) {
                if (instance == null) {
                    instance = new demo();
                }
            }
        }
        return instance;

    }
}
public class Main {
    public static void main(String[] args) {
        demo d=demo.connect();
        System.out.println(d);
        demo d1=demo.connect();
        System.out.println(d1);
        Runnable task = () -> { demo d2 = demo.connect();
            System.out.println(Thread.currentThread().getName() + " -> " + d2);
        };
        Thread thread = new Thread(task);
        thread.start();
        Thread thread1 = new Thread(task);
        thread1.start();
        Thread thread2 = new Thread(task);
        thread2.start();
        Thread thread3 = new Thread(task);
        thread3.start();


    }
}
