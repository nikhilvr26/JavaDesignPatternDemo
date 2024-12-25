//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Test simple approach

       /* SingletonDesignPatternDemo instance1 = SingletonDesignPatternDemo.getInstance();
        SingletonDesignPatternDemo instance2 = SingletonDesignPatternDemo.getInstance();

        if(instance1 == instance2){
            System.out.println("Singleton verified!!");
        }else{
            System.out.println("Its not Singleton");
        }
        System.out.println(instance1 +" "+ instance2);
    }*/

        // Testing multithreading approach
        Runnable task = ()->{
            SingletonDesignPatternDemo instance = SingletonDesignPatternDemo.getInstance();
            System.out.println("instance: "+ instance);
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.start();
        t2.start();
        t3.start();
    }
}