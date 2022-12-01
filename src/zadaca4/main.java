package zadaca4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Integer> broevi = new ArrayList<Integer>();
		broevi.add(8);
		broevi.add(21);
		broevi.add(22);
		broevi.add(13);
		broevi.add(11);
				
		Collections.sort(broevi);	
		
		System.out.println(broevi);
	}
}
