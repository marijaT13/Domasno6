package zadaca9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<fakultet> faxin=new ArrayList<fakultet>();
		
		fakultet fax=new fakultet("TFB",10,1300);
		faxin.add(fax);
		faxin.add(new fakultet("FIKT",8,1200));
		faxin.add(new fakultet("PMF",12,2000));
		faxin.add(new fakultet("Visa Medicina",20,800));
		faxin.add(new fakultet("TTF",5,400));
		for(int i=0; i<faxin.size();i++) {
		System.out.println(faxin.get(i).getIme());
		System.out.println(faxin.get(i).getSmer());
		System.out.println(faxin.get(i).getStudenti());
		}
			}
}
