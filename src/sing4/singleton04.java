package sing4;


public class singleton04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("懒汉式，线程安全");
 	   Singleton instance = Singleton.getInstance();
 	   Singleton instance2 = Singleton.getInstance();
 	   System.out.println(instance == instance2); //true
 	   System.out.println("instance.hashCode =" + instance.hashCode());
 	   System.out.println("instance2.hashCode =" + instance2.hashCode());
	}

}

//懒汉式
//懒汉式，顾名思义就是实例在用到的时候才去创建，“比较懒”
//有线程安全和线程不安全两种写法，区别就是synchronized关键字。
//线程安全，但是效率太低了，但是每次要获得类的实例的时候，执行getInstance方法都要进行同步
class Singleton{
	private static Singleton instance;
	
	private Singleton() {
		
	}
	//加个synchronized 就可以解决线程安全问题
	public static  synchronized Singleton getInstance() {
		//用的时候才去检查有没有实例，如果有则返回，没有则新建。
		if(instance == null) {
			instance = new Singleton();	
			}
		return instance;
	}

	
}