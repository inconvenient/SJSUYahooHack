import java.sql.Timestamp;

public class error {

	int severity = 0, count = 0;
	String nodeName, mediaType, summary;
	Timestamp firstOccur;

	public error(int sev, int ct, String node, String media, String firstOcc,
			String smry) {

		severity = sev;
		count = ct;
		nodeName = node;
		mediaType = media;
		setFirstOccur(firstOcc);
		summary = smry;

	}

	public void setFirstOccur(String i) {
		int year, month, date, hour, minute, second;
		year = Integer.parseInt(i.substring(0, 4));
		month = Integer.parseInt(i.substring(5, 7));
		date = Integer.parseInt(i.substring(8, 10));
		hour = Integer.parseInt(i.substring(11, 13));
		minute = Integer.parseInt(i.substring(14, 16));
		second = Integer.parseInt(i.substring(17, 19));
		firstOccur = new Timestamp(year, month, date, hour, minute, second, 0);
	}

	public void setSeverity(int i) {
		severity = i;
	}

	public void setCount(int i) {
		count = i;
	}

	public void setNodeName(String i) {
		nodeName = i;
	}

	public void setMediaType(String i) {
		mediaType = i;
	}

	public void setFirstOccur(Timestamp i) {
		firstOccur = i;
	}

	public void setSummary(String i) {
		summary = i;
	}

	public int getSeverity() {
		return severity;
	}

	public int getCount() {
		return count;
	}

	public String getNode() {
		return nodeName;
	}

	public String getMedia() {
		return mediaType;
	}

	public String getFirstOccur() {
		return firstOccur.toString();
	}

	public String getSummary() {
		return summary;
	}
}
