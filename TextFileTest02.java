package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./test03.txt");
		File file2 = new File("./test042.txt");
		//출력스트림 사용
		FileOutputStream os = null; //마찬가지로 file전용 아웃스트림이있습니다. //byte기반
		FileWriter fw = null; //char 단위 입니다 만약 outputstream을 사용하신다면 getbytes 등을 해줘야합니다.
		try {
			fw = new FileWriter(file2);
		} catch (IOException e) {//filenotfound예외가아님 알고보니 FileNotFoundException이 IOExceptiondml 자식클래스임;;
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않거나 다른 출력에 관련된 예외발생");
			
		}
		System.out.println(fw);// null이 나오지않습니다.
		try {
			os = new FileOutputStream(file);
			//파일출력스트림은 파일이 존재하지않으면 자동으로생성됩니다. 홀리;;
		} catch (FileNotFoundException e) {//왜 만들어논거야
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않으면 예외가 발생합니다.");
		}
		System.out.println("프로그램 종료"); //예외가안나오네?
	
		
	}

}
