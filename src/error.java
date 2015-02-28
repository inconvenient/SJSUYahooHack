
public class error {
	int severity=0, count=0;
	String nodeName, mediaType, firstOccur, summary;
	public error(){
		
	}
	public void setSeverity(int i){
		severity = i;
	}
	public void setCount(int i){
		count = i;
	}
	public void setNodeName(String i){
		nodeName=i;
	}
	public void setMediaType(String i){
		mediaType = i;
	}
	public void setFirstOccur(String i){
		firstOccur = i;
	}
	public void setSummary(String i){
		summary = i;
	}
	public int getSeverity(){
		return severity;
	}
	public int getCount(){
		return count;
	}
	public String getNode(){
		return nodeName;
	}
	public String getMedia(){
		return mediaType;
	}
	public String getFirstOccur(){
		return firstOccur;
	}
	public String getSummary(){
		return summary;
	}
}
