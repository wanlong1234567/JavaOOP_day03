package oo.day03;
//������Ĳ�����
public class CellTest {
	public static void main(String[] args) {
		Cell[] cells = new Cell[4]; //����Cell�������
		cells[0] = new Cell(2,5); //����Cell����
		cells[1] = new Cell(2,6);
		cells[2] = new Cell(2,7);
		cells[3] = new Cell(3,6);
		
		Cell[] cs = new Cell[]{
			new Cell(2,5),
			new Cell(2,6),
			new Cell(2,7),
			new Cell(3,6)
		};
		
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];
		arr[1][0] = 100;
		
		int[][] as = new int[3][4];
		for(int i=0;i<as.length;i++){
			for(int j=0;j<as[i].length;j++){
				as[i][j] = 100;
			}
		}
		
	}
	
	//��ǽ+���
	public static void printWall(Cell cc){
		for(int i=0;i<20;i++){ //��
			for(int j=0;j<10;j++){ //��
				if(i==cc.row && j==cc.col){ //����ƥ��
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}



























