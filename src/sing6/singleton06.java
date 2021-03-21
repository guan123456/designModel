package sing6;


public class singleton06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("使用静态内部类实现单例模式");
 	   Singleton instance = Singleton.getInstance();
 	   Singleton instance2 = Singleton.getInstance();
 	   System.out.println(instance == instance2); //true
 	   System.out.println("instance.hashCode =" + instance.hashCode());
 	   System.out.println("instance2.hashCode =" + instance2.hashCode());
	}

}

//静态内部类
//当外部这个类被装载的时候，静态内部类并不会立即被装载
//当静态内部类调用getInstance方法的时候会导致静态内部类的装载
//而且只会装载一次 ，并且在装载的时候线程是安全的
//也就是可以达到懒加载，又保证了线程安全
//


class Singleton{
	private static volatile Singleton instance;
	
	private Singleton() {
		
	}
	
	//写一个静态内部类，该类中有一个静态属性Singleton
	private static class SingletonInstance{
		private static final Singleton INSTANCE = new Singleton();
	}
	public static  synchronized Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}

	
}