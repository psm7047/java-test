package ch02;

public class Exam04_1 {

	public static void main(String[] args) {
		
		//���ڿ� => ����(����, �Ǽ�)
		
		//���ڿ��� String Ÿ�� ������ �����Ѵ�.
		String var1 = "10";	
		
		//���ڿ��� ���ڰ� + �Ǹ� ���ڿ��� ����
		String var2 = var1 + 5;		//105
		
		//���ڿ��� ������ �����ؼ� ����
		int var3 = Integer.parseInt(var2) + 10;	//115
		
		//���ڿ��� �Ǽ��� �����ؼ� ����
		double var4 = Double.parseDouble(var2);	//105.0
		double var5 = Double.parseDouble(var2) + 1.2;	//106.2
		
		//���� => ���ڿ�
		int var6 = 10;
		//���1
		String var7 = ""+var6;
		
		//���2
		String var8 = String.valueOf(var6);

	}

}
