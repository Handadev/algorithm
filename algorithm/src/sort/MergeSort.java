package sort;

public class MergeSort {
	
	private static int[] sorted;
	
	//일단 반으로 나누고 나중에 합치면 어떨까라는 발상에서 시작
	private static void merge_sort(int[] array) {
		sorted = new int[array.length];
		top_down_merge(array, 0, array.length-1);
		sorted = null;
	}
	
	//top down 방식
	private static void top_down_merge(int[] array, int left, int right) {
		if(left == right) return;
		
		int mid = (left + right) / 2;
		
		top_down_merge(array, left, mid);
		top_down_merge(array, mid+1, right);
		
		merge(array, left, mid, right);
	}
	
	//bottom up 방식 작동이 잘 안됨
	private static void bottom_up_merge(int[] array, int left, int right) {
		// 리스트를 나누는 기준을 2배씩 늘림
		for (int size = 0; size <= right; size += size) {
			
			for (int l = 0; l <= right - size; l += (2 * size)) {
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(1 + (2 * size), right);
				merge(array, low, mid, high);
			}
		}
	}

	private static void merge(int[] array, int left, int mid, int right) {
		int l = left;
		int r = mid + 1;
		int idx = left;
		
		while(l <= mid && r <= right) {
			if(array[l] <= array[r]) {
				sorted[idx] = array[l];
				idx++;
				l++;
			} else {
				sorted[idx] = array[r];
				idx++;
				r++;
			}
		}
		
		if(l > mid) {
			while(r <= right) {
				sorted[idx] = array[r];
				idx++;
				r++;
			}
		} else {
			while(l <= mid) {
				sorted[idx] = array[l];
				idx++;
				l++;
			}
		}
		
		for (int i = left; i <= right; i++) {
			array[i] = sorted[i];
		}
		
	}
	
	public static void main(String[] args) {
		int[] array = {2,6,4,8,5,7,1,10,3,9};
		merge_sort(array);
		
		for (int i : array) {
			System.out.println(i);
		}
	}
}
