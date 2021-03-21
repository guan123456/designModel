package sing2;

public class singleton02 {
	
	  public static void main(String[] args) {
		  
/*    	   Singleton02_1 instance = Singleton02_1.getInstance();
    	   Singleton02_1 instance2 = Singleton02_1.getInstance();
    	   System.out.println(instance == instance2); //true
    	   System.out.println("instance.hashCode =" + instance.hashCode());
    	   System.out.println("instance2.hashCode =" + instance2.hashCode());*/
    	   
}
	//饿汉式(静态变量)
	//饿汉式，从名字上也很好理解，就是“比较勤”
	//好处是没有线程安全的问题，坏处是浪费内存空间。
/*	class Singleton02_1{
		public Singleton02_1() {

		}
		
		private  static Singleton02_1 instance;
		//实例在初始化的时候就已经建好了，不管你有没有用到，都先建好了再说。
		//另一种写法，在静态代码块中，创建单例对象
		static {
			instance = new Singleton02_1();
		}
		
		public static Singleton02_1 getInstance() {
			return instance;
		}
	}
*/
}

