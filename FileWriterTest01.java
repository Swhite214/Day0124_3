package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {

	public static void main(String[] args) {
		//File file = new File("test05.txt") 이렇게 문자열을 파일타입 객체로 안바꿔도 문자열로 넣어도 됩니다.
		//즉 파일객체를 꼭 만들어야하는거아닙니다.
		//FileWriter fw=null;
		/*try {
			fw= new FileWriter("test05.txt");
		//fw는 이블록끝나면 사라집니다
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// 무조건 실행하는 구간
			try {if(fw != null)
				fw.close();//그래서 fw를 try안에서 만들어버리면 인식못합니다.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}*/
		//try with resources finally를 굳이 번거롭게 만들지 않아도 됩니다.
		try(FileWriter fw = new FileWriter("test05.txt",true)){//당연히 없으면 만들어주는기능이지 있으면 중복해서 만들어주지는 않습니다.
			//try가 끝나면 auto close가 됩니다.
			/*fw.write('가');
			fw.write('\n');
			char[] arr = {'나','다','\n'};
			fw.write(arr);
			fw.write("문자열로 저장하는게 더 편하죠?");
			fw.flush();//문제는 기존에있던 ㄴ내용은 사라지고 덮어써집니다.
			*/
			fw.append('A'); //append쓸때 boolean형으로 넣어줘야 덮어써지지않습니다. 쓰는곳은 저기 FilewWriter(String s, boolean append) 이부분에
			fw.append('\n');
			fw.append("가능한가요");
			fw.append('\n'); //write도 append가 true라면 기존에있던게 사라지지않습니다.
			fw.flush();
			System.out.println("성공적으로 파일만들고 문자열 넣습니다.");
		}catch(Exception e) {
			System.out.println("파일 저장시 문제발생");
		}//AutoClose처리됨
		
		
	}

}
