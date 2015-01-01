package StringPerm;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = args[0];
		String line = null;
		try{
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while((line = bufferedReader.readLine()) != null){
			
			List<Character> listc = new ArrayList<Character>(line.length());
			
            for(int i = 0; i < line.length(); i++)
            	{
            		listc.add(line.charAt(i));
            	}

            List<String> res = new Searcher(new StringBuilder(), listc).execute();
            StringBuilder resbuild = new StringBuilder();
            Collections.sort(res);
            for(String str : res) 
            	{
            	resbuild.append(",").append(str);
            	}

            System.out.println(resbuild.toString().substring(1));
            
			}//while loop ends here 
		 	bufferedReader.close();	
		}//try ends here
		catch(Exception ex){
			System.out.println("Unable to open file '" + path + "'");
		}
		
		
	}
	
	private static class Searcher {

        private final StringBuilder bdr;
        private final List<Character> listc;
        private final List<String> res;

        public Searcher(StringBuilder bdr, List<Character> listc) {
                this.bdr = new StringBuilder(bdr);
                this.listc = new ArrayList<Character>(listc);
                this.res = new ArrayList<String>();
        }

        public List<String> execute() {
                if(listc.size() == 0) {
                        res.add(bdr.toString());
                        return res;
                }
                int buildIndex = bdr.length();
                for(int i = 0; i < listc.size(); i++) {
                        Character current = listc.get(i);
                        bdr.append(current);
                        listc.remove(i);
                        res.addAll(new Searcher(bdr, listc).execute());
                        listc.add(i, current);
                        bdr.deleteCharAt(buildIndex);
                }
                return res;
        }

}

}
