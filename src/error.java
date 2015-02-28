import java.sql.Timestamp;

public class error {

	int severity = 0, count = 0;
	String nodeName, mediaType, summary;
	Timestamp firstOccur;

	public error(int sev, int ct, String node, String media,
			Timestamp firstOcc, String smry) {

		severity = sev;
		count = ct;
		nodeName = node;
		mediaType = media;
		firstOccur = firstOcc;
		summary = smry;

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
