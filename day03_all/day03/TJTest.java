package oo.day03;
//T����J�͵Ĳ�����
public class TJTest {
	public static void main(String[] args) {
		Tetromino o1 = new T(2,5); //��������
		printWall(o1); //�����ͺ�ֵ
		
		J o2 = new J(1,6);
		printWall(o2); //��ֵ��ͬʱ����
	}
		
	//��ǽ+��T��
	public static void printWall(Tetromino t){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				//Ч�ʵ͡���չ�Ժ�
				boolean flag = true; //1.�����-
				for(int k=0;k<t.cells.length;k++){
					if(i==t.cells[k].row && j==t.cells[k].col){
						flag = false; //2.�޸�Ϊ��*
						break; //ʣ����Ӳ��ٲ���Ƚ���
					}
				}
				if(flag==true){ //3.�жϵý���
					System.out.print("- ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
}
















