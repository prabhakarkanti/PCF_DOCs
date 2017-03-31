

import java.util.concurrent.TimeUnit;

public class Prg3 {


	public static void main(String args[]){
	
		long startTime = System.nanoTime(); 
	//	System.out.println("==STARTTIME===" + startTime);
		int [] prices ={5,4,3,2,4};
		int discount =0;
		int totalSum = 0;
		String indexes = null;
		for(int i=0;i<prices.length;i++){
			if(i != prices.length -1 && prices[i]>prices[i+1]){
				discount = prices[i]-prices[i+1];
				totalSum += discount;
			}else{
				totalSum += prices[i];
				indexes =  (indexes != null ? indexes : "") + i + ",";
				System.out.println("==" + i);
			}
		}
		long endTime = System.nanoTime();
		//System.out.println("===TIMNE===" + TimeUnit.NANOSECONDS.toNanos(endTime - startTime));
		System.out.println("total SUM "+ totalSum +"\t Indexes " + indexes);
		
	}
} 