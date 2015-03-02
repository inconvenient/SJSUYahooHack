import java.util.ArrayList;
import java.util.Collections;

public class RunProgram {

	public static void main(String args[]) {
		csvParser csvP = new csvParser();
		csvP.run();

		for (ArrayList list : csvP.MainList) {
			Collections.sort(list, new compareProperty());
		}

		for (error e : csvP.msgDB) { // Change DB based on Query
			System.out.println("Severity: " + e.getSeverity() + " | Count: "
					+ e.getCount() + " | Node: " + e.getNode() + " | Media: "
					+ e.getMedia() + " | First Occured: " + e.getFirstOccur()
					+ " | Summary: " + e.getSummary());
		}
	}
}
