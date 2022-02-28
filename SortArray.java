import java.util.Scanner;

public class SortArray{

	public static void main(String args[]){

		int n,temp=0; //Read No of array elements 
		//use scanner to read elements
		System.out.println("Enter no of elements to read");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter Array elements");

		for(int i=0; i<n;i++){
			arr[i] = sc.nextInt();
		}

		
		for(int i=0;i<n-1;i++){
			if(arr[i]>=arr[i+1]){
				temp = arr[i+1];
				arr[i+1]=arr[i];
				arr[i] = temp;

				i = -1;
		
		
			}

		
		}

		System.out.println("Sorted Array is");

		for(int j=0;j<n;j++){
			System.out.println(arr[j]);
		}





	}
	
}