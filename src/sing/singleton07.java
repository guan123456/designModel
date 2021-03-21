package sing;

public class singleton07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 	   Singleton instance = Singleton.INSTANCE;
	 	   Singleton instance2 = Singleton.INSTANCE;
	 	   System.out.println(instance == instance2); //true
	 	   System.out.println("instance.hashCode =" + instance.hashCode());
	 	   System.out.println("instance2.hashCode =" + instance2.hashCode());
	}

}

//推荐使用
//借助JDK1.5中添加的美剧来实现单例模式。
//不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
//实际开发中，要么静态，要么枚举
enum Singleton{
	INSTANCE;
	public void sayOK() {
		System.out.println("ok!");
	}
}

//饿汉式(静态变量)
//在类装载的时候就完成了实例化，没有达到懒加载的效果。
//如果从始至终从未使用过这个实例，则会造成内存的浪费
class Singleton1{
	//构造器私有化，外部能new
	private Singleton1() {
		
	}
	//本类内部创建对象实例
	private final static Singleton1 instance = new Singleton1();
	
	//提供一个公有的静态方法，返回实例对象
	public static Singleton1 getInstance() {
		return instance;
	}
}