package Week2.IcecreamRush;

public class Main {
	
	static void bubblesort(int[] arr,String[] flavors){
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swapped=false;
			for(int j=i+1;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					String t= flavors[j];
					flavors[j]=flavors[j+1];
					flavors[j+1]=t;
					
					swapped=true;
				}
			}
			if(!swapped) break;
		}	
	}
	static void display(int[] arr, String[] flavor) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(flavor[i]+" -> "+ arr[i]);
		}
		
	}
    
	public static void main(String args[]){
		String[] flavors = {
	            "Vanilla", "Chocolate", "Mango", "Strawberry",
	            "Butterscotch", "Pista", "Coffee", "Black Currant"
	        };
        int[] sales = {20, 200, 290, 150, 100, 130, 70, 190};
       
        System.out.println("Before Sorting:");
        display(sales, flavors);
		
		bubblesort(sales,flavors);
		
		System.out.println("\nAfter Sorting (Least → Most Popular):");
        display(sales, flavors);
	}
}
