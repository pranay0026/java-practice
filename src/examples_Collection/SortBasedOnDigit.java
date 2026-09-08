package examples_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnDigit {
	public static void main(String[] args) {
		
		Comparator<Integer> com=new Comparator<Integer>() {
			public int compare(Integer i,Integer j) {
				if(i%10>j%10) return 1;
				else return -1;
			}
		};
		List<Integer> res=new ArrayList<>();
		res.add(13);
		res.add(45);
		res.add(18);
		res.add(56);
		Collections.sort(res,com);
		for(int i:res) {
			System.out.println(i);
		}
	}
}
