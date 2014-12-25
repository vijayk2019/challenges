import java.io.BufferedReader;
import java.io.FileReader;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//file logic goes here
		String path = args[0];
		String line = null;
		try{
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while((line = bufferedReader.readLine()) != null){
		String b = line ;
		char S[] = b.toCharArray();
		//System.out.println("\nGiven String of words: ");
		//System.out.print(S);
		//System.out.println();
		Main obj = new Main();
		 S = obj.ReverseArray(S);
		 int lastspace = 0;
		 int currentspace;
		 int end = (S.length-1);
		for(int j=0; j<S.length; j++){
		 if((S[j] == ' ')||(j==end)){

		 int k=0;
		 char temp1[] = new char[j-lastspace];
		 currentspace = j-1;
		 if(j==end){
		 	 currentspace = j;
		 	 while(currentspace > (lastspace) ){
				 temp1[k] = S[currentspace]; 
			     currentspace--;
			     k++;
		 	 	}
			 }
		 else if(lastspace == 0){
		 	 while(currentspace >=(lastspace) ){
				 temp1[k] = S[currentspace]; 
				 currentspace--;
				 k++; 
		 		}
		 	 }
		 else{
			 while(currentspace > lastspace ){
				 temp1[k] = S[currentspace]; 
			     currentspace--;
			     k++;
			 	}
		 	 }
		   	 char new1[] = temp1;
		     currentspace++;
		     int length=0;
		 if(j==end){
		   	 while((currentspace<=j)&&(length<k)){
		   		S[currentspace] = new1[length];
		   		currentspace++; 
		   		length++;
		   		}
		   	}	
		 else{
			   while((currentspace<j)&&(length<k)){
			   		S[currentspace] = new1[length];
			   		currentspace++; length++;
			   	}
		   	 S[currentspace] = ' ';
		   	 currentspace++;
		   	 lastspace = j;
		   }
      	} 	
	   }
		//System.out.println("Reverses Words");
	    for(int i=0; i<S.length; i++){
		  System.out.print(S[i]);
	    }
	    System.out.println();
	   }//while loop ends here 
		 bufferedReader.close();	
	 }//try ends here
		catch(Exception ex){
			System.out.println("Unable to open file '" + path + "'");
		}
	}//main function ends here
	
	//reverse array function
	
	public char[] ReverseArray(char S1[]){
		int mid;
		char tempz;
		mid = S1.length/2;
		int end = S1.length-1;
		for(int j=0; j<mid && end>mid ; j++, end--){
			tempz = S1[j];
			S1[j] = S1[end];
			S1[end] = tempz;
		}
		
		return S1;
	}
}
