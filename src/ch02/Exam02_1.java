package ch02;

public class Exam02_1 {
	
	public static void main(String[] args) {
		//�ڵ� Ÿ�� ��ȯ
		byte var1 = 10;
		int var2 = var1;		//int > byte
		
		//���� Ÿ�� ��ȯ
		int var3 = 10;
		byte var4 = (byte)var3;		//int -> byte
		
		//-----------------------------------
		
		//�ڵ� Ÿ�� ��ȯ (������ �Ǽ����� �׻� ���� ����)
		long var5 = 10;			
		double var6 = var5;		//double(�Ǽ�) > long(����)
		
		//���� Ÿ�� ��ȯ (�Ǽ��� �������� �׻� ū ����) 
		float var8 = 10.5f;
		long var9 = (long)var8;	//10 
		int var10 = (int)var8;	//10
		//-----------------------------------
		
		//�Ǽ��� ������ ��ȯ
		double var11 = 3.141592;
		int var12 = (int)var11;		//3
	}

}
