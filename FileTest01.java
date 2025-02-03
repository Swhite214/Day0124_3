package fileIO;

import java.io.File;
import java.io.IOException;

public class FileTest01 {

	public static void main(String[] args) throws IOException {
		// 텍스트파일 , 바이너리 파일 : 영상 소리 이미지 등
		
		//경로안쓰면 프로젝트 폴더(기본 폴더)에서 찾습니다.
		File file= new File("test.txt");//상대경로나 절대경로방식으로 입력 보통 오류나면 절대 경로방식으로 쓰고 아니면 상대씁니다.
		System.out.println("파일존재? " + file.exists());//boolean형
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("파일이 생성되었답니다.");//어디에? ?????????진짜로 Day0124_3에 생성되었습니다.
		}
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());//boolean형
		System.out.println("파일이름: " +file.getName());
		System.out.println("파일사이즈: " + file.length()); //long형입니다. 근데 뭘 기준으로? 안에있는 내용물이라는데....
		System.out.println("파일경로: " + file.getPath()); //상대경로에요 내위치부터시작
		System.out.println("파일절대경로: " + file.getAbsolutePath()); //D드라이브 기준으로 찾아줍니다. 시작부터 끝까지의 경로가나옵니다.
		System.out.println("파일부모: "+ file.getParent());
		//겟어쩌구만 해도 출력문장을 만들어주는 알고리즘 어때
		System.out.println("pathSeparator:" + file.separator); //윈도우는 기본자로 \ 물론/도가능함 리눅스는 /
		//문자열안에서 \사용시 "\\" 두번을 표기해야함.
	}

}
