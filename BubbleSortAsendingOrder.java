package TechnoElevateBasicsOfJavaProgram;

public class BubbleSortAsendingOrder {

	public static void main(String[] args) {
		
		int []arr= {23,54,45,6,55,99,96};
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				
				if (arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}

	}

}
