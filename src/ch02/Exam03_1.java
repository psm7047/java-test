package ch02;

public class Exam03_1 {

	public static void main(String[] args) {
		
		//int Ÿ�� ������ �ǿ������� ������ ����� int
		
		byte var1 = 10;
		byte var2 = 10;
		
		byte var3 = (byte)(var1 + var2);
		int var4 = var1 + var2;
		
		//int Ÿ�Ժ��� ū Ÿ���� ������ �Ǹ� ū Ÿ������ ����� �ȴ�.

		int var5 = 10;
		long var6 = 20;
		double var10 = 1.5;
		
		long var7 = var5 + var6;	//long > int
		int var8 = var5 + (int)var6;
		int var9 = (int)(var5 + var6);
		
		double var11 = var5 + var10;	//11.5 double > int
		int var12 = var5 + (int)var10;		//11
		int var13 = (int)(var5 + var10);	//11
		
		
		
	}

}
