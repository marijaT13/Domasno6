package zadaca2;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<String> drzavi = new ArrayList<String>();
		drzavi.add("Makedonija");
		drzavi.add("Italija");
		drzavi.add("Bosna i Herzegovina");
		drzavi.add("Germanija");
		drzavi.add("Srbija");

		System.out.println("Listata sodrzhi "+ drzavi.size()+" elementi.");

		if(drzavi.size() == 3) {    
			drzavi.add("Francija");
			drzavi.add("Slovenija");

			System.out.println(drzavi);
		}
		else {
			System.out.println(drzavi);
		}
	}
}
