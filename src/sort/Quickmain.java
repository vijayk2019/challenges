package sort;

public class Quickmain {
	

	public static void main(String[] args){
		
		
		Integer[] list = {8,2,6,66,1,56,6,10};
		for(int j=0; j<list.length; j++)
		{
			System.out.print(" "+list[j]);
		}
		System.out.println(" ");
		QuickSort.sort(list);
		for(int j=0; j<list.length; j++)
		{
			System.out.print(" "+list[j]);
		}
	}
	

}
