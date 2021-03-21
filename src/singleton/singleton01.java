package singleton;



public class singleton01 {
	
	  public static void main(String[] args) {
		  
    	   Singleton instance = Singleton.getInstance();
    	   Singleton instance2 = Singleton.getInstance();
    	   System.out.println(instance == instance2); //true
    	   System.out.println("instance.hashCode =" + instance.hashCode());
    	   System.out.println("instance2.hashCode =" + instance2.hashCode());
    	   
}
}

//饿汉式
class Singleton{
	public Singleton() {
		
	}
	
	private final static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
}