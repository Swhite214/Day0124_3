package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("img_reflect.png");
		
		try (FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream("img_reflect1.png"))
		{ byte[] buffer = new byte[1024*8];
		int readCount;
			while((readCount=fis.read(buffer)) != -1){//끝나는점까지만읽음 buffer없으면 끝까지읽고 -1)
				System.out.println(readCount);
				fos.write(buffer,0,readCount);//마지막에 8192에서 뺀5514 한 3000정도가 낭비됨
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일의 경로가 다르거나 존재하지 않아요");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("파일복사완료");
	}

}
