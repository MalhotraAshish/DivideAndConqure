package testing;

import java.util.ArrayList;
import java.util.Collections;

public class AllocateBook {
	public static int books(ArrayList<Integer> A, int B) {
		int ans = Integer.MAX_VALUE, result = Integer.MAX_VALUE;
		int low = 0, high = 0, mid = 0;
		if (A.size() == B) {
			Collections.sort(A);
			return A.get(A.size() - 1);
		} else if (A.size() < B) {
			return -1;
		} else {

			for (int i = 0; i < A.size(); i++) {
				
				low = Math.max(low, A.get(i));
			}
			for (int i = 0; i < A.size(); i++) {
				high = high + A.get(i);
			}

			while (low < high) {
				
				mid = (low + high) / 2;
				result = calSum(A, B, mid);
				if (ans >= result) {
					System.out.println("*low = " + low + " high = " + high + " mid = " + mid + " ans = " + ans + " result = " + result);
					ans = result;
					high = mid;
				} else {
					System.out.println("low = " + low + " high = " + high + " mid = " + mid + " ans = " + ans + " result = " + result);
					low = mid + 1;
				}
			}
		}
		return ans;
	}

	private static int calSum(ArrayList<Integer> a, int b, int result) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			if (count <= b && sum<result) {
				sum = sum + a.get(i);
				count++;
			}
		}
		return sum;
	}

	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		/*list.add(12);
		list.add(34);
		list.add(67);
		list.add(90);*/
		list.add(5);
		list.add(17);
		list.add(100);
		list.add(11);
		System.out.println(books(list, 2));
	}
}
