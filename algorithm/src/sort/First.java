package sort;


public class First {
	
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
		 * 선택정렬 - 전체를 선택하고 앞에서부터 한 칸씩 줄어듦
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
		 * 버블정렬 - 옆에 있는 값과 비교해서 더 작은 값을 앞으로 보냄
		 * 정렬 중 가장 효율이 떨어지는 알고리즘
		 * 전체를 선택하고 뒤에서부터 한 칸씩 줄어듦
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
		 * 삽입정렬 - 선택정렬, 버블정렬과 같은 시간 복잡도를 가지고있다
		 * 선택과 버블은 무조건 위치를 바꾸는 방식이나, 삽입은 필요할 때만 위치를 바꾸게 된다
		 * 동일한 시간 복잡도를 가지고 있으나, 위의 특징 때문에 빠른 처리방식을 보여준다
		 * 순서를 돌리면서, 숫자가 앞의 원소들의 어느칸에 삽입되어야할지 로직을 짠다
		 * 하나의 원소의 위치를 잡아준다고 할 때, 그 앞에 있는 원소들은 이미 정렬이 되어있기 때문에 비교적 효율적이다
		 * 만약 자료가 거의다 정렬된 상태에서는 삽입 정렬이 가장 빠른 속도를 보인다
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
