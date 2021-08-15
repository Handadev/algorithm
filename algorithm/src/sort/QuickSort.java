package sort;

public class QuickSort {

	// start 정렬을 실행하는 부분집합의 시작부
		// end 부분집합의 끝부분
		static void quickSort(int[] data, int start, int end) { 
			if(start >= end) { // 원소가 한개다
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
		 * 퀵 정렬 - 특정한 값을 기준으로 튼 숫자와 작은 숫자로 나눈다면 어떨까
		 * 퀵 정렬은 기준값 = 피벗이라는 것이 존재. 이를 기준으로 왼쪽과 오른쪽을 나눈다
		 * 퀵 정렬은 가장 앞에 있는 값을 피벗값으로 선정한다. 그 후 왼쪽, 오른쪽으로 쭉 훑는다
		 * 왼쪽에서 피벗보다 큰 값, 오른쪽에서 피벗보다 작은 값을 찾아 두 자리를 바꾼다
		 * 이렇게 하다가 작은 값의 인덱스가 큰 값의 인덱스보다 작으면 작은 값과 피벗값의 위치를 바꿔준다.
		 * 이렇게되면 피벗값 기준으로 왼쪽으로는 작은 값, 오른 쪽으로는 큰 값이 오게되는데
		 * 작은 값과 큰 값은 각각 똑같은 방식으로 다시 정렬을 하기 시작한다 
		 * https://st-lab.tistory.com/250 참고
		 */
		
		int[] data = {1,10,5,8,7,6,4,3,2,9};
		quickSort(data, 0, data.length - 1);
		
		for (int i : data) {
			System.out.println(i);
		}
	}
}
