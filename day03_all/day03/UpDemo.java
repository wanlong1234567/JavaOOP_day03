package oo.day03;
//�������͵���ʾ
public class UpDemo {
	public static void main(String[] args) {
		Eoo o1 = new Eoo();
		o1.e = 1;
		o1.show();
		//o1.f = 2; //������󣬸����ܷ����ӵ�
		
		Foo o2 = new Foo();
		o2.f = 1;
		o2.say();
		o2.e = 2; //��ȷ���ӿ��Է��ʸ���
		o2.show();
		
		Eoo o3 = new Foo(); //��������
		o3.e = 1;
		o3.show();
		//o3.f = 2; //��������ܵ����ʲô�������õ�����
	}
}

class Eoo{
	int e;
	void show(){}
}
class Foo extends Eoo{
	int f;
	void say(){}
}
















