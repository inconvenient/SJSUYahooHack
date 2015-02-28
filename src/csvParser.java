import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class csvParser {

	public void run() {

		String csvFile = "/Users/Benton/Downloads/final_alert_file.csv"; // Change location if necessary
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "\\|"; // Escape the |

		// Severity|Count|Node|Property|First Occurrence|Summary

		try {
			br = new BufferedReader(new FileReader(csvFile));

			while ((line = br.readLine()) != null) {
				String[] tempError = line.split(cvsSplitBy); // Split by |

				ArrayList<error> errorDB = new ArrayList<error>();
				errorDB.add(new error(Integer.parseInt(tempError[0]), Integer
						.parseInt(tempError[1]), tempError[2], tempError[3],
						tempError[4], tempError[5]));

				System.out.println("Error [Severity= " + tempError[0]
						+ " , Count=" + tempError[1] + " , Node="
						+ tempError[2] + " , Property=" + tempError[3]
						+ " , First Occur=" + tempError[4] + " , Summary="
						+ tempError[5] + "]");

			}

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