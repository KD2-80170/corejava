package ok;
import java.util.Comparator;

public class AS {
	
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		}
	public static void main(String args)
	{
		AS s=new AS();
		Double array[]= {1.2,34.5,45.4,5.4,4.5};
		
		for(Double e:array)
			System.out.println(e);
     
		class Dc implements Comparator<Double>
	    { 
		public int compare(Double d1,Double d2)
		{
			return Double.compare(d1, d2);
		}
		
	    }
		Dc cmp =new Dc();
		selectionSort(array,cmp);
		System.out.println(array);
	}
}
