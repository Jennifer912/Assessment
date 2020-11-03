import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class getAllTextNotes {

	 public static void main(String args[])throws Exception{
		    getAllTextNotes ob = new getAllTextNotes();
	        BufferedReader in = new BufferedReader(new FileReader("read.txt"));
	        String str;
	        List<String> list = new ArrayList<String>();
	        while((str =in.readLine()) != null ){
	            list.add(str);
	        }
	        String[] stringArr = list.toArray(new String[0]);
	        System.out.println(" "+Arrays.toString(stringArr)); 
	    }
}
