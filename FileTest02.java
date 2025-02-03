package fileIO;

import java.io.File;
import java.io.IOException;

public class FileTest02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//경로 + 파일이름 : 상대경로, 절대경로
		// . :현재 디렉토리 즉 지금현재 폴더를 의미합니다.
		// ..: 부모폴더 상위디렉토리
		File file = new File("../test01.txt");
		File file1 = new File("FileTest02.java");
		//존재하지않더라도 파일객체 생성가능 먼저 선언하고 만든다는점에서 탑 다운과 비슷하긴하네요
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("파일 생성완료");
			
		}
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(file1.getAbsolutePath());
	}

}
