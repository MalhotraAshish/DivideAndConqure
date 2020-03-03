package testing;

import java.util.ArrayList;

public class SortedInsertPosition {
	public static int searchInsert(ArrayList<Integer> a, int b) {
		int resultIndex = -1;
		resultIndex = findElementInList(a, b);
		if (resultIndex != -1) {
			return resultIndex;
		} else {
			return findPositionOfElement(a, b) + 1;
		}
	}

	private static int findPositionOfElement(ArrayList<Integer> list, int target) {
		int low = 0, high = list.size() - 1, mid = 0;
		while (target >= 0) {
			low = 0;
			high = list.size() - 1;
			mid = 0;
			while (low <= high) {
				mid = (low + high) / 2;
				if (list.get(mid) == target) {
					return mid;
				} else if (list.get(mid) > target) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}

			}
			target = target - 1;
		}
		return -1;
	}

	private static int findElementInList(ArrayList<Integer> list, int target) {
		int low = 0, high = list.size() - 1, mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (list.get(mid) == target) {
				return mid;
			} else if (list.get(mid) > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(9);

		System.out.println(searchInsert(list, 0));
	}
}
