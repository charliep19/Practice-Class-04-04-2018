
public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums= {6,18,21,1,22,13};
int largest= nums[0];
	for(int i=0; i<6;i++) {
if (nums[i]>largest) {
	largest=nums[i];
	
}

  }
	System.out.println(largest);
}
}