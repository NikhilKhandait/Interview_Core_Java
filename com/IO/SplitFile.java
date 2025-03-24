
package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * @author Nikhil
 *
 */
public class SplitFile {
	public static void main(String[] args) throws IOException {
		
		//split means convert file into custom lines like 2-2 lines for each file............
		 
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\split.txt"));
		int nol = 2; //we convert this file in 2 2 line per file
		int countLine = 0; //total line count 
		String s = br.readLine();
		
		
		while (s != null) {
			countLine++; //line ko read krke use badate jayega jaise 5 line he to 5 count hoga
			s = br.readLine();
		}
		br.close();
		//ab yaha total file ko caluclte krege 
		int temp = countLine / 2; //yaha total line 5 hai to 5/2 = 2 file hogi
		if (countLine % 2 != 0) { // yaha per 2 file banne ke bat 1 line bachegi qki result odd hai na ki 0
			temp++;// lekin yaha total line 5 hai to 1 bachega to 1++ hoga or 3 file banegi
		}
		
		//dubara file open ki
		br = new BufferedReader(new FileReader("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\split.txt"));
		String str;
		for (int i = 1; i <= temp; i++) {// jo 3 file he temp = 3 bani, 
			PrintWriter pw = new PrintWriter(
					new FileWriter("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\split" + i + ".txt"));
			for (int j = 1; j <= nol; j++) { //usme se 2 2 line ko niche printwrit se write krege
				str = br.readLine();
				if (str == null) {
					break;
				}
				pw.println(str);
			}
			pw.close();
		}
	}
}
