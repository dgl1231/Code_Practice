package singleton;

public class SomgletonMain {

	public static void main(String[] args) {
		//[1]
		//Singleton singleton =new Singleton();
		//����, �����ڰ� private
		
		//[2]
		//Singleton singleton1=Singleton.getInstance();
		//Singleton singleton2=Singleton.getInstance();
		//System.out.println(singleton1==singleton2);
		
		
		//[3]
		//ù��° �����Ҷ� one�� null�̱� ������  one= new Singleton()�ڵ����
		Singleton singleton1=Singleton.getInstance(); 
		//�ι�° �����Ҷ� one��  null�� �ƴϱ� ������ return one�̶� true�� ����
		Singleton singleton2=Singleton.getInstance();
		System.out.println(singleton1==singleton2);
	}

}
