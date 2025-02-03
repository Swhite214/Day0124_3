package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest02 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter fw = new FileWriter("data.dat",true)) {
			System.out.print("이름>");
			String name = in.nextLine();
			System.out.print("전화번호>");
			String phone = in.nextLine();
			String str = String.format("%s %s\n", name, phone);
			fw.write(str);//플러쉬 안써도 저장되긴하네요
			//fw.flush(); //autoClose처리할때 내부적으로 flush()가 자동으로 실행됨
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
