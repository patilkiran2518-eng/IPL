package repository;

import entity.Team;

public class TeamRepository {

	
	public static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		team.setShortName("MI");
		return team;
	}
	
public static Team getCSKTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("MS Dhoni");
		team.setCoachName("Stephen Fleming");
		team.setQualified(false);
		team.setnRR(2.4f);
		team.setShortName("CSK");
		return team;
}
public static Team getRCBTeamDetails(){
	Team team = new Team();
	team.setId(103);
	team.setTeamName("Royal Challengers Bengaluru");
	team.setCaptainName("Rajat Patidar");
	team.setCoachName("Andy Flower");
	team.setQualified(true);
	team.setnRR(2.5f);
	team.setShortName("RCB");
	return team;
}
public static Team getDCTeamDetails(){
	Team team = new Team();
	team.setId(104);
	team.setTeamName("Delhi Capitals");
	team.setCaptainName("Axar Patel");
	team.setCoachName("Hemang Badani");
	team.setQualified(false);
	team.setnRR(1.5f);
	team.setShortName("DCT");
	return team;
}
public static Team getGJTeamDetails(){
	Team team = new Team();
	team.setId(105);
	team.setTeamName("Gujarat Titans");
	team.setCaptainName("Shubman Gill");
	team.setCoachName("Ashish Nehara");
	team.setQualified(false);
	team.setnRR(2.7f);
	team.setShortName("GJ");
	return team;
}
public static Team getKKRTeamDetails(){
	Team team = new Team();
	team.setId(106);
	team.setTeamName("Kolkata Knight Riders");
	team.setCaptainName("Ajinkya Rahane");
	team.setCoachName("Chandrakant Pandit");
	team.setQualified(false);
	team.setnRR(1.3f);
	team.setShortName("KKR");
	return team;
}
public static Team getLSGTeamDetails(){
	Team team = new Team();
	team.setId(107);
	team.setTeamName("Lucknow Super Giants");
	team.setCaptainName("Rishabh Pant");
	team.setCoachName("Justin Langer");
	team.setQualified(false);
	team.setnRR(1.2f);
	team.setShortName("LSG");
	return team;
}
public static Team getPKTeamDetails(){
	Team team = new Team();
	team.setId(108);
	team.setTeamName("Punjab Kings");
	team.setCaptainName("Shreyas Iyer");
	team.setCoachName("Ricky Ponting");
	team.setQualified(false);
	team.setnRR(1.8f);
	team.setShortName("PK");
	return team;
}
public static Team getRRTeamDetails(){
	Team team = new Team();
	team.setId(109);
	team.setTeamName("Rajasthan Royals");
	team.setCaptainName("Sanju Samson");
	team.setCoachName("Rahul Dravid");
	team.setQualified(false);
	team.setnRR(1.f);
	team.setShortName("RR");
	return team;
}
public static Team getSRHTeamDetails(){
	Team team = new Team();
	team.setId(110);
	team.setTeamName("Sunrisers Hyderabad");
	team.setCaptainName("Pat Cummins");
	team.setCoachName("Daniel Vettori");
	team.setQualified(false);
	team.setnRR(1.7f);
	team.setShortName("SRH");
	return team;
}
}