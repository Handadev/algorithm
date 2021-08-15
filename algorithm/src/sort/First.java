package sort;


public class First {
	
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
		
		
	}
}
