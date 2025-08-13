package entity;

public class Team {
	
	private int id;
	
	private String teamName;
	
	private String CaptainName;
	
	private String coachName;
	
	private float nRR;
	
	private boolean isQualified;
	
	//setter-getter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return CaptainName;
	}

	public void setCaptainName(String captainName) {
		CaptainName = captainName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public float getnRR() {
		return nRR;
	}

	public void setnRR(float nRR) {
		this.nRR = nRR;
	}

	public boolean isQualified() {
		return isQualified;
	}

	public void setQualified(boolean isQualified) {
		this.isQualified = isQualified;
	}
	
	
	
		
	

}
