package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextFileTest01 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		File file = new File("test03.txt");
		//파일의 내용을 읽고싶어요
		//자바프로그램이 - 지정된파일과 연결해서 데이터를 읽어야합니다.
		// 파일에서 이 쪽으로 들어오는 형식이기때문에 입력스트림이 필요합니다.
		// 출력스트림 또한 필요합니다.(인풋 아웃풋 둘다 단방향이라 참 힘듭니다.)
		FileInputStream fls = null; //file전용 인풋 스트림 단위가 바이트 입력스트림 //바이너리 파일이 용이함
		FileReader fr = null; //단위: char단위 입력스트림 종류 ->Reader : 텍스트파일을 사용하기 편하게
		try {
			fr = new FileReader(file);
			// fls = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("파일이 존재하지않습니다.");
		}//file없으면 안되므로 예외처리까지 해주셔야합니다
		
		System.out.println(fr);
		
	}

}
