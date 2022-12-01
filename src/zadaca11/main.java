package zadaca11;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("Bela");
		list1.add("Crna");
		list1.add("Crvena");
		List<String> list2=new ArrayList<String>();
		list2.add("Lilava");
		list2.add("Maslinesta");
		list2.add("Crvena");
		list1.retainAll(list2);
		System.out.println(list1);
	}

}
