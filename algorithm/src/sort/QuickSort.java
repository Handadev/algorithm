package sort;

public class QuickSort {

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
