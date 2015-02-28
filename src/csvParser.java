import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class csvParser {

	public void run() {

		String csvFile = "/Users/Benton/Downloads/final_alert_file.csv"; // Change
																			// location
																			// if
																			// necessary
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "\\|"; // Escape the |
		ArrayList<error> errorDB = new ArrayList<error>();
		int count = 0;

		// Severity|Count|Node|Property|First Occurrence|Summary

		try {
			br = new BufferedReader(new FileReader(csvFile));

			while ((line = br.readLine()) != null) {

				String[] tempError = line.split(cvsSplitBy); // Split by |

				errorDB.add(new error(Integer.parseInt(tempError[0]), Integer
						.parseInt(tempError[1]), tempError[2], tempError[3],
						tempError[4], tempError[5]));

				count++;
			}

			for (error e : errorDB) {
				System.out.println("Severity: " + e.getSeverity()
						+ " | Count: " + e.getCount() + " | Node: "
						+ e.getNode() + " | Media: " + e.getMedia()
						+ " | First Occured: " + e.getFirstOccur()
						+ " | Summary: " + e.getSummary());

			}

			System.out.println("Count: " + count);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Done");
	}
}