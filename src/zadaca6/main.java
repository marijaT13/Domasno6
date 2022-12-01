package zadaca6;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		List<String> mails = new ArrayList<String>();

		for(int i=0;i<20;i++){
			mails.add("mail"+(i+1)+"@yahoo.com");	

		}
		for(int i=0;i<20;i++){
			System.out.println(mails.get(i));
		}
	}
}
