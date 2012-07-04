
public class practice_1_96414 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, oddSum=0, evenSum=0, diff=0;
		for(i=0; i<=100;i++){
			if (i%2==0){
				evenSum += i; 
			}else{
				oddSum += i;
			}
		}
		diff = evenSum - oddSum;
		System.out.println(evenSum);
		System.out.println(oddSum);
		System.out.println(diff);
	}

}
