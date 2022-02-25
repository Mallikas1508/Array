import java.util.Scanner;
class ReadArray{

	public static void main(String args[]){

		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of ReadArray elements");

		n = sc.nextInt();

		System.out.println("Enter Array elements");

		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Array Elements are");

		for (int i=0; i<n ;i++ ) {
			System.out.println(arr[i]);
			
		}

		System.out.println("Reverse Array");

		for(int i=n-1; i>=0; i--){
			System.out.println(arr[i]);
		}
	}
}