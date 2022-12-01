package zadaca10;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Bela");
		list1.add("Crvena");
		list1.add("Zelena");
		List<String> list2 = new ArrayList<String>();
		list2.add("Zholta");
		list2.add("Portokalova");
		list2.add("Crna");

		list1.addAll(list2);

		System.out.println(list1);
	}
	

}
