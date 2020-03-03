package testing;

import java.util.ArrayList;

public class SearchMatrix {
	public static int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
		for (int i = 0; i < A.size(); i++) {
			if (binarySearchForNumber(A.get(i), B)) {
				return 1;
			}
		}
		return 0;
	}

	private static boolean binarySearchForNumber(ArrayList<Integer> list, int target) {
		int low = 0;
		int high = list.size();
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			System.out.println("low = " + low + " high = " + high + " mid = "+ mid);
			if(list.get(mid) == target){
				return true;
			}else if(list.get(mid)>target){
				high = mid-1;
			}
			else{
				low = mid+1;
			}
		}

		return false;
	}
	
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		mainList.add(list);
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(16);
		list.add(20);
		mainList.add(list);
		list = new ArrayList<Integer>();
		list.add(23);
		list.add(30);
		list.add(34);
		list.add(50);
		list.add(1);
		System.out.println(searchMatrix(mainList,100));
		
		
	}
}
