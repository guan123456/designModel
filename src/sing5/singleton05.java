package sing5;


public class singleton05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("双重检查，线程安全");
 	   Singleton instance = Singleton.getInstance();
 	   Singleton instance2 = Singleton.getInstance();
 	   System.out.println(instance == instance2); //true
 	   System.out.println("instance.hashCode =" + instance.hashCode());
 	   System.out.println("instance2.hashCode =" + instance2.hashCode());
	}

}

//双重检查，推荐使用
//volatile是轻量级synchronized，防止指令重排
//指令重排是指在程序执行过程中, 为了性能考虑, 编译器和CPU可能会对指令重新排序
//延迟加载，效率较高
class Singleton{
	private static volatile Singleton instance;
	
	private Singleton() {
		
	}
	public static  synchronized Singleton getInstance() {
		if(instance == null) {
			//可以保证只有一个线程在这里执行
			synchronized (Singleton.class) {
				if(instance==null) {
					instance = new Singleton();	
				}
				
			}

			}
		return instance;
	}

	
}