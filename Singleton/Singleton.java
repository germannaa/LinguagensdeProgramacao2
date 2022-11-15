
package Singleton;

public class Singleton {
    private static Singleton instance = null;
    
    private Singleton(){
    }
        
    public static synchronized Singleton getInstance(){
            if (instance == null){
                instance = new Singleton();
            }
            return instance;
        }
    
    protected static void testInstance(){
        System.out.println("Method by Singleton Instance");
    }
    }
    

