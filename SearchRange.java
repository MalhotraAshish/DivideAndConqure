package testing;

import java.util.ArrayList;
import java.util.List;

public class SearchRange {
	public static ArrayList<Integer> searchRange(final List<Integer> A, int B) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		resultList.add(FindFirstIndex(A,B));
		resultList.add(FindLastIndex(A,B));
		return resultList;
	}
	
	private static int FindLastIndex(List<Integer> a, int b) {
		int low = 0;
		int high = a.size()-1;
		int mid = 0, index = -1;
		while(low <= high){
			mid = (low + high)/2;
			if(a.get(mid) == b){
				index = mid;
				low = mid +1;
			}else if(a.get(mid) > b){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}
		return index;
	}

	private static int FindFirstIndex(List<Integer> a, int b) {
		int low = 0;
		int high = a.size()-1;
		int mid = 0, index = -1;
		while(low <= high){
			mid = (low + high)/2;
			if(a.get(mid) == b){
				index = mid;
				high = mid-1;
			}else if(a.get(mid) > b){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}
		return index;
	}

	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(8);
		list.add(8);
		list.add(10);
		list.add(17);
		list.add(100);
		
		
		System.out.println(searchRange(list,120));
		
		
	}
}
