package ReverseString;
import java.io.*;
public class ReverseString {
	
	
	int mid;
	char temp;
	char S[];
	public char[] ReverseArray(char S1[]){
		S = S1;
		mid = S1.length/2;
		int end = S1.length-1;
		for(int j=0; j<mid; j++, end--){
			temp = S1[j];
			S1[j] = S1[end];
			S1[end] = temp;
		}
		
		/*for(int j=0; j<mid && end>mid ; j++, end--){
			temp = S1[j];
			S1[j] = S1[end];
			S1[end] = temp;
		}*/
		
		return S1;
	}
}
