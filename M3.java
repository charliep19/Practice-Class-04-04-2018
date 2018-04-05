
public class M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {18,21,2,12,70,60};
		
		int smallest= nums[0];
		int secondsmallest=nums[1];	
		for(int i=0; i<6; i++) {
		
			if (nums[i]<smallest) {
			smallest=nums[i];
			
		}

		  }
			
		System.out.println(smallest);
		
		
		for ( int i=0; i<6;i++) {
		if (nums[i]<secondsmallest && nums[i]>smallest) {
			secondsmallest=nums[i];
		}
	}
		System.out.println(secondsmallest);
	}
}

