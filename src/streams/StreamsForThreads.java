package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamsForThreads {
	public static void main(String[] args) {
		int size=10_000;
		List<Integer> nums=new ArrayList<>(size);
		Random ran=new Random();
		for(int i=1;i<=size;i++) {
			nums.add(ran.nextInt(100));
		}
		//System.out.println(nums);
		/**int sum1=nums.stream()
				.map(n->n*2)
				.reduce(0, (a,b)->a+b);
		System.out.println(sum1);**/
		long startSeq=System.currentTimeMillis();
		int sum2=nums.stream()
				.map(i->{
					try {
						Thread.sleep(1);
					}
					catch(Exception e) {
						
					}
					return i*2;
				})
				.mapToInt(i->i)
				.sum();
		long endSeq=System.currentTimeMillis();
		System.out.println("Seq "+(endSeq-startSeq));
		System.out.println(sum2);
		long startPara=System.currentTimeMillis();
		int sum3=nums.parallelStream()
				.map(i->{
					try {
						Thread.sleep(1);
					}
					catch(Exception e) {
						
					}
					return i*2;
				})
				.mapToInt(i->i)
				.sum();
		long endPara=System.currentTimeMillis();
		System.out.println("Para "+(endPara-startPara));
		System.out.println(sum3);
		
	}
}
