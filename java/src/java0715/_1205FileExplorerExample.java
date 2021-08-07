package java0715;

import java.io.File;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class _1205FileExplorerExample {

	public static void main(String[] args) {
		
		File myDir = new File("C:/");
		
		File[] listing = myDir.listFiles();
		
		for (int i = 0; i<listing.length; ++i) {
			File file = listing[i];
		
			System.out.println(file.getName() + "\t");
			
			if(file.isFile()) {
				NumberFormat nf = NumberFormat.getInstance();
				DateFormat df = DateFormat.getDateInstance();
				
				
				System.out.println(nf.format(file.length()/1024) + "Kbyte\t");
				System.out.println(df.format(new Date(file.lastModified())));
			} else {
				System.out.println("Æú´õ");
			}
			System.out.println();
		}

	}
}