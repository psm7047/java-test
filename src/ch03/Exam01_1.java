package ch03;

public class Exam01_1 {

	public static void main(String[] args) {
		//��� (����, �E��, ������)������ �پ��� ����
		
		int var1 = 1;		//1
		var1 = var1 + 1;	//2
		var1 +=1;			//3
		var1++;				//4
		++var1;				//5
		
		int var2 = 10;
		var2 = var2 - 1;	//9
		var2 -= 1;			//8
		var2--;				//7
		--var2;				//6
		
		int var3 = 15;
		var3 = var3 / 2;	//7
		var3 /= 2;			//3

		// �ڹٴ� ���� / (������)�� ����� �����Դϴ�.
		int var4 = 11;
		int var5 = 4;
		int var6 = var4 / var5;	//2
		
		// �Ǽ��� ������ ���
		double var7 = 1.0 * var4 / var5;	//2.75
		double var8 = (double)(var4/var5);	//2.75
		
		//������ ���ϱ�
		int var9 = var4 % var5;		//3

	}

}
