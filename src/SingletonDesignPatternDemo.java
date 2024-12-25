public class SingletonDesignPatternDemo {

    /*Volatile Keyword:
    use of volatile keyword ensures that the instance variable is correctly handled in multithreaded environments,
     avoiding instruction reordering and ensuring visibility of changes to all threads.

    Private Constructor:
    The private constructor ensure that the Singleton class cannot be instantiated from outside,
     maintaining the Singleton property.*/

    private static volatile SingletonDesignPatternDemo instance;
    private SingletonDesignPatternDemo(){};

   /* public static SingletonDesignPatternDemo getInstance(){ // Simple Singleton Pattern which is not thread safe
        if(null == instance){
            instance = new SingletonDesignPatternDemo();
        }
        return instance;
    }*/

   /* public static synchronized SingletonDesignPatternDemo getInstance(){ // Thread safe using synchronized keyword
        if(null == instance){
            instance = new SingletonDesignPatternDemo();
        }
        return instance;
    }*/

    public static SingletonDesignPatternDemo getInstance(){  // Thread safe using double check safety
        if(null == instance){
            synchronized (SingletonDesignPatternDemo.class){
                if(null == instance){
                    instance = new SingletonDesignPatternDemo();
                }
            }
        }
        return instance;
    }
}
