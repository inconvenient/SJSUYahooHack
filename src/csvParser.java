import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class csvParser {

	public static void main(String args[]) {
		csvParser csvP = new csvParser();
		csvP.run();
	}

	public void run() {

		String csvFile = "/Users/Benton/Downloads/final_alert_file.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "\\|"; // Escape the |

		// Severity|Count|Node|Property|First Occurrence|Summary

		try {
			br = new BufferedReader(new FileReader(csvFile));

			while ((line = br.readLine()) != null) {
				String[] Error = line.split(cvsSplitBy); // Split by |

				System.out.println("Error [Severity= " + Error[0] + " , Count="
						+ Error[1] + " , Node=" + Error[2] + " , Property="
						+ Error[3] + " , First Occur=" + Error[4]
						+ " , Summary=" + Error[5] + "]");

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