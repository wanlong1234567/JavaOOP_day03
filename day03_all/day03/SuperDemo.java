package oo.day03;
//super����ʾ
public class SuperDemo {
	public static void main(String[] args) {
		Boo o = new Boo();
	}
}

class Coo{
	Coo(int n){
	}
}
class Doo extends Coo{
	Doo(){
		super(5);
	}
	
	/*
	//����Ĵ��룬����Ĭ�ϵ�
	Doo(){
		super();
	}
	*/
}














class Aoo{
	Aoo(){
		System.out.println("���๹�췽��");
	}
}
class Boo extends Aoo{
	Boo(){
		super(); //д��д������----Ĭ�ϵ�
		System.out.println("���๹�췽��");
	}
}














