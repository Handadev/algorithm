package sort;


public class First {
	
	public static void main(String[] args) {
		/**
		 * �������� - ��ü�� �����ϰ� �տ������� �� ĭ�� �پ��
		 * 
		 */
		int min, index = 0, temp;
		int[] num = {1,10,5,8,7,6,4,3,2,9};
		for (int i = 0; i < num.length; i++) {
			min = 999;
			for (int j = i; j < num.length; j++) {
				if(min > num[j]) {
					min = num[j];
					index = j;
				}
			}
			temp = num[i];
			num[i] = num[index];
			num[index] = temp;
		}
//		for (int i : num) {
//			System.out.println(i);
//		}
		/**
		 * �������� - ���� �ִ� ���� ���ؼ� �� ���� ���� ������ ����
		 * ���� �� ���� ȿ���� �������� �˰���
		 * ��ü�� �����ϰ� �ڿ������� �� ĭ�� �پ��
		 */
		int[] num2 = {1,10,5,8,7,6,4,3,2,9};
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < 9-i; j++) {
				if(num2[j] > num2[j+1]) {
					temp = num2[j];
					num2[j] = num2[j+1];
					num2[j+1] = temp;
				}
			}
		}
//		for (int i : num2) {
//			System.out.println(i);
//		}
		
		/**
		 * �������� - ��������, �������İ� ���� �ð� ���⵵�� �������ִ�
		 * ���ð� ������ ������ ��ġ�� �ٲٴ� ����̳�, ������ �ʿ��� ���� ��ġ�� �ٲٰ� �ȴ�
		 * ������ �ð� ���⵵�� ������ ������, ���� Ư¡ ������ ���� ó������� �����ش�
		 * ������ �����鼭, ���ڰ� ���� ���ҵ��� ���ĭ�� ���ԵǾ������ ������ §��
		 * �ϳ��� ������ ��ġ�� ����شٰ� �� ��, �� �տ� �ִ� ���ҵ��� �̹� ������ �Ǿ��ֱ� ������ ���� ȿ�����̴�
		 * ���� �ڷᰡ ���Ǵ� ���ĵ� ���¿����� ���� ������ ���� ���� �ӵ��� ���δ�
		 */
		int[] num3 = {1,10,5,8,7,6,4,3,2,9};
		for (int i = 0; i < 9; i++) {
			int j = i;
			while(num3[j] > num3[j+1]) {
				temp = num3[j];
				num3[j] = num3[j+1];
				num3[j+1] = temp;
				j--;
			}
		}
//		for (int i : num3) {
//			System.out.println(i);
//		}
		
		
	}
}
