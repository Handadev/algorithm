package sort;


public class First {
	
	// start ������ �����ϴ� �κ������� ���ۺ�
	// end �κ������� ���κ�
	static void quickSort(int[] data, int start, int end) { 
		if(start >= end) { // ���Ұ� �Ѱ���
			return;
		}
		
		int pivot = partition(data, start, end);
		
		quickSort(data, start, pivot-1);
		quickSort(data, pivot+1, end);
	}
	
	private static int partition(int[] data, int left, int right) {
		int lo = left;
		int hi = right;
		int pivot = data[left];
		
		while(lo < hi) {
			while(data[hi] > pivot && lo < hi) {
				hi--;
			}
			while(data[lo] <= pivot && lo < hi) {
				lo++;
			}
			swap(data, lo, hi);
		}
		
		swap(data, left, lo);
		return lo;
	}

	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

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
		
		/**
		 * �� ���� - Ư���� ���� �������� ư ���ڿ� ���� ���ڷ� �����ٸ� ���
		 * �� ������ ���ذ� = �ǹ��̶�� ���� ����. �̸� �������� ���ʰ� �������� ������
		 * �� ������ ���� �տ� �ִ� ���� �ǹ������� �����Ѵ�. �� �� ����, ���������� �� �ȴ´�
		 * ���ʿ��� �ǹ����� ū ��, �����ʿ��� �ǹ����� ���� ���� ã�� �� �ڸ��� �ٲ۴�
		 * �̷��� �ϴٰ� ���� ���� �ε����� ū ���� �ε������� ������ ���� ���� �ǹ����� ��ġ�� �ٲ��ش�.
		 * �̷��ԵǸ� �ǹ��� �������� �������δ� ���� ��, ���� �����δ� ū ���� ���ԵǴµ�
		 * ���� ���� ū ���� ���� �Ȱ��� ������� �ٽ� ������ �ϱ� �����Ѵ� 
		 * https://st-lab.tistory.com/250 ����
		 */
		
		int[] data = {1,10,5,8,7,6,4,3,2,9};
		quickSort(data, 0, data.length - 1);
		
		for (int i : data) {
			System.out.println(i);
		}
	}
}
