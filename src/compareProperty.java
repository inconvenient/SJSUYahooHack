import java.util.Comparator;

public class compareProperty implements Comparator<error> {
	@Override
	public int compare(error o1, error o2) {
	// TODO Auto-generated method stub
	if(o1.mediaType.compareTo(o2.mediaType) == 0) {
		int cn = new compareNode().compare(o1, o2);
			if(cn == 0) {
				return new compareTime().compare(o1, o2);					
			}
			return cn;
		}
		else
			return o1.getMedia().compareTo(o2.getMedia());
	}		
}
