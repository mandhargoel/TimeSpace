package TimeSpace;

public class RecursionSorting {

	public static void main(String[] args) {
		
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {15,25,35,45,50};
		int[] ans=mergedArrays(arr1, arr2);
		
		for(int val:ans) {
			System.out.print(val+ " ");
		}
		
		System.out.println();
		System.out.println("*********************** ");
		
		int[]  arr= {20,50,60,59,52,5,5,0,52,85};
		//int[] res = mergesort(arr, 0, arr.length-1);
		quicksort(arr, 0, arr.length-1);
		for(int val:arr) {
			System.out.print(val+ " ");
		}
		
	

	}

	public static int[] mergedArrays(int[] arr1, int[] arr2) {
		
		int merge[]=new int[arr1.length + arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<=arr2[j]) {
				merge[k]=arr1[i];
				i++;k++;
			}else {
				merge[k]=arr2[j];
				j++;k++;
			}
		}
		if(i==arr1.length) {
			while(j<arr2.length) {
				merge[k]=arr2[j];
				j++;k++;
			}
		}else {
			merge[k]=arr1[i];
			i++;k++;
		}
		return merge;
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if(lo==hi) {
			int[] br= new int[1];
			br[0]=arr[lo];
			return br;
		}
		int mid=(lo+hi)/2;
		int[] fh = mergesort(arr, lo, mid);
		int[] sh = mergesort(arr, mid+1, hi);
		
		int[] merge = mergedArrays(fh, sh);
		
		return merge;
	}
	
	public static void quicksort(int[] arr, int lo, int hi) {
		
		if(lo>=hi) {
			return;
		}
		//partitioning
		int mid=(lo+hi)/2;
		int pivot=arr[mid];
		int left=lo;
		int right=hi;
		
		while(left <=right) {
			while(arr[left]<pivot) {
				left++;
			}
			while(arr[right]>pivot) {
				right--;
			}
			if(left<=right) {
				int temp = arr[left];
				arr[left]=arr[right];
				arr[left]=temp;
				left++;
				right--;
			}
		}
		quicksort(arr, lo, right);
		quicksort(arr, left, hi);
	}

}
