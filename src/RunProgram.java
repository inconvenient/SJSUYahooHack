import java.util.Collections;

public class RunProgram {

	public static void main(String args[]) {
		csvParser csvP = new csvParser();
		csvP.run();

		Collections.sort(csvP.flickrDB, new compareProperty());

		for (error e : csvP.flickrDB) {
			System.out.println("Severity: " + e.getSeverity() + " | Count: "
					+ e.getCount() + " | Node: " + e.getNode() + " | Media: "
					+ e.getMedia() + " | First Occured: " + e.getFirstOccur()
					+ " | Summary: " + e.getSummary());
		}
	}
}
