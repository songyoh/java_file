package api.lang.util;

public class Example {
	public static int binarySearch(int[] arr, int target) {
	int left = 0;
	int right = arr.length - 1;

	while (left <= right) {
	int mid = (left + right) / 2;
	if (arr[mid] == target) {
	   return mid;
	   } else if (arr[mid] > target) {
	    right = mid - 1;
	   } else {
	   left = mid + 1;
	   }
	}
	    return -1;
}

	public static void main(String[] args) {
	    int[] arr = {1, 3, 5, 7, 9};
	    int target = 5;

	    int result = binarySearch(arr, target);

	    if (result == -1) {
	      System.out.println("찾는 값이 배열에 없습니다.");
	    } else {
	     System.out.println("찾는 값의 인덱스는 " + result + " 입니다.");
	    }
	}
}


