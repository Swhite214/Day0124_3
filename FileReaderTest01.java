package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileReaderTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("data.dat");
		//try()이형태로하면 자동으로 클로즈됩니다.
		try (FileReader fr = new FileReader(file)){
			char[] buffer = new char[1024];
			int data =fr.read(buffer);
			System.out.println(data);
			String str = new String(buffer,0,data);
			System.out.println(str);
			//CharBuffer buffer = CharBuffer.allocate(1024);//양방향통신할때 쓰입니다.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("파일 읽기 오류 예외");
		}
	}

}
