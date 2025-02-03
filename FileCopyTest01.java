package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("image.png");
		System.out.println(file.length()+" byte");
		File refl = new File("img_reflect.png");
		
		try (FileInputStream fls = new FileInputStream(file);
			FileOutputStream fos =	new FileOutputStream(refl);)
		{int data;
		int i=0;
			while((data=fls.read()) != -1) {
				//1byte씩읽습니다. 정확히는 읽어서 인트형반환
				fos.write(data);
				i++;
			}
			System.out.println(i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않아요");
		} catch (IOException e1) { //IOE가 부모기때문에 이렇게 순서 지켜주셔야합니다.
			// TODO Auto-generated catch block
			System.out.println("파일 복사 실패 다시 코드 짜셈");
		}
	}

}
