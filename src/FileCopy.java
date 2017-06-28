
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
//here we are creating the class
public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//here we are creating the source file and the destination file
		File sourcefile = new File("E:/File/abc.txt");
		File destfile = new File("E:/File/new/bcd.txt");
		//here we are applying the try  catch to handle the exception
		//here we are using the file.copy method to copy the file 
		//from one file to another file

		try {
			Files.copy(sourcefile.toPath(), destfile.toPath(),StandardCopyOption.REPLACE_EXISTING);}
			catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File Copied Succesfully");
	}
	

}
