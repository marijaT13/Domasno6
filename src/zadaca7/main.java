package zadaca7;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<String> mails = new ArrayList<String>();
		
		for(int i=0;i<20;i++){
			if(i<9)
				mails.add("mail0"+(i+1)+"@yahoo.com");
			else
				mails.add("mail"+(i+1)+"@yahoo.com");

			System.out.println(mails.get(i));

		}
	}
}
