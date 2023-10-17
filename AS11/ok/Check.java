package ok;

 class Check<T> {
	
	
	
		public static <T extends Number> T findMin(T arr[]) {
			
			T min = arr[0];
			
			for(int i=1; i<arr.length; i++)
			{
				if(arr[i].doubleValue()<min.doubleValue())
					min = arr[i];
				
			}
		      return min;
			
		}


		public static void main(String[] args) {
		
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		System.out.println(min1);
		Check c=new Check();
		//System.out.println("Min Integer:"+Check.findMin(arr1));
	    Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
	    Double min2 = findMin(arr2);
		System.out.println(min2);
		}
		
		
}



		
		
		
		// TODO Auto-generated constructor stub
	


