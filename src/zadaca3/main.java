package zadaca3;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<String> smer = new ArrayList<String>();
		smer.add("KNI");
		smer.add("INKI");
		smer.add("MIS");
		System.out.println("Pred dodavanje na element na tretata pozicija, listata izgleda vaka:");
		System.out.println(smer);

		smer.add(2, "IMSA");
		System.out.println("Po dodavanje na element na tretata pozicija, listata izgleda vaka:");
		System.out.println(smer);
	}
}
