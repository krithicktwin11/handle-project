package task.org;

public class  sample {
	public static void main(String[] args) {
		
		int[] n ={10,50,70,20,30};
		int[]a=n;
		
		int temp;
		
		for (int i = 0; i < a.length; i++) { //10 //5
			
			for (int j=i+1; j < a.length; j++) {//5720//723//23//3
				
				if (a[i]>a[j]) {
					
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
					
				}
				
			}
			
		}
		System.out.println("asc");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+"value"+");
		}
		
	}
	

}
