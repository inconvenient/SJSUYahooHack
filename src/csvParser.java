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
		ArrayList<error> mailDB = new ArrayList<error>();
		ArrayList<error> msgDB = new ArrayList<error>();
		ArrayList<error> flickrDB = new ArrayList<error>();
		ArrayList<error> mediaDB = new ArrayList<error>();
		ArrayList<error> searchDB = new ArrayList<error>();
		ArrayList<error> revDB = new ArrayList<error>();
		ArrayList<error> fpDB = new ArrayList<error>();

		// Severity|Count|Node|Property|First Occurrence|Summary

		try {
			br = new BufferedReader(new FileReader(csvFile));

			while ((line = br.readLine()) != null) {

				String[] tempError = line.split(cvsSplitBy); // Split by |

				if (tempError[3].equals("Frontpage")) {
					fpDB.add(new error(Integer.parseInt(tempError[0]), Integer
							.parseInt(tempError[1]), tempError[2],
							tempError[3], tempError[4], tempError[5]));
				} else if (tempError[3].equals("Mail")) {
					mailDB.add(new error(Integer.parseInt(tempError[0]),
							Integer.parseInt(tempError[1]), tempError[2],
							tempError[3], tempError[4], tempError[5]));
				} else if (tempError[3].equals("Messenger")) {
					msgDB.add(new error(Integer.parseInt(tempError[0]), Integer
							.parseInt(tempError[1]), tempError[2],
							tempError[3], tempError[4], tempError[5]));
				} else if (tempError[3].equals("Search")) {
					searchDB.add(new error(Integer.parseInt(tempError[0]),
							Integer.parseInt(tempError[1]), tempError[2],
							tempError[3], tempError[4], tempError[5]));
				} else if (tempError[3].equals("Media")) {
					mediaDB.add(new error(Integer.parseInt(tempError[0]),
							Integer.parseInt(tempError[1]), tempError[2],
							tempError[3], tempError[4], tempError[5]));
				} else if (tempError[3].equals("Revenue")) {
					revDB.add(new error(Integer.parseInt(tempError[0]), Integer
							.parseInt(tempError[1]), tempError[2],
							tempError[3], tempError[4], tempError[5]));
				} else if (tempError[3].equals("Flickr")) {
					flickrDB.add(new error(Integer.parseInt(tempError[0]),
							Integer.parseInt(tempError[1]), tempError[2],
							tempError[3], tempError[4], tempError[5]));
				}

			}

			for (error e : msgDB) { // Change DB Name depending on what you want

				System.out.println("Severity: " + e.getSeverity()
						+ " | Count: " + e.getCount() + " | Node: "
						+ e.getNode() + " | Media: " + e.getMedia()
						+ " | First Occured: " + e.getFirstOccur()
						+ " | Summary: " + e.getSummary());
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