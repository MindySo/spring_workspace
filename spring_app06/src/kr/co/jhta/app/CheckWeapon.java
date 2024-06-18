package kr.co.jhta.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckWeapon {
	public void check() {
		// 1. 현재 시간을 가져오기 : 15시 40분
		Date now = new Date();
		SimpleDateFormat sdfTitle = new SimpleDateFormat("YYYYMMDDHHmm");
		SimpleDateFormat sdfContent = new SimpleDateFormat("YYYY년 MM월 DD일 HH시 mm분 ss초");
		
		String title = sdfTitle.format(now);
		String content = sdfContent.format(now);
		
		// 2. d:\dev\log\현재시간명.log 파일 생성
		//	  d:\dev\log\time202406111540.log 파일 생성

		// 내용
		// 무기사용함 : 2024년 06월 11일 15시 40분
		
		
		File f = new File("d:\\dev\\log\\time" + title + ".log");
		
		// 파일이 존재하지 않으면 파일을 생성
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			
			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("무기 사용함 : " + content);
//			fw.write("무기 사용함 : " + content);

			fw.flush();
			
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
