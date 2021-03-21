package sing3;


public class singleton03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("懒汉式，线程不安全");
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
//起到了懒加载的效果，但是只能在单线程下使用，实际开发中是不会使用的
class Singleton{
	private static Singleton instance;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		//用的时候才去检查有没有实例，如果有则返回，没有则新建。
		if(instance == null) {
			instance = new Singleton();	
			}
		return instance;
	}

	
}