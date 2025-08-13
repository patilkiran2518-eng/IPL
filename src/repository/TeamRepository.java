package repository;

import entity.Team;

public class TeamRepository {

	//should return MI team details
	public static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
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
	return team;
}
public static Team getGJeamDetails(){
	Team team = new Team();
	team.setId(105);
	team.setTeamName("Gujarat Titans");
	team.setCaptainName("Shubman Gill");
	team.setCoachName("Ashish Nehara");
	team.setQualified(false);
	team.setnRR(2.7f);
	return team;
}
public static Team getKKReamDetails(){
	Team team = new Team();
	team.setId(106);
	team.setTeamName("Kolkata Knight Riders");
	team.setCaptainName("Ajinkya Rahane");
	team.setCoachName("Chandrakant Pandit");
	team.setQualified(false);
	team.setnRR(1.3f);
	return team;
}
public static Team getLSGeamDetails(){
	Team team = new Team();
	team.setId(107);
	team.setTeamName("Lucknow Super Giants");
	team.setCaptainName("Rishabh Pant");
	team.setCoachName("Justin Langer");
	team.setQualified(false);
	team.setnRR(1.2f);
	return team;
}
public static Team getPKeamDetails(){
	Team team = new Team();
	team.setId(108);
	team.setTeamName("Punjab Kings");
	team.setCaptainName("Shreyas Iyer");
	team.setCoachName("Ricky Ponting");
	team.setQualified(false);
	team.setnRR(1.8f);
	return team;
}
public static Team getRReamDetails(){
	Team team = new Team();
	team.setId(109);
	team.setTeamName("Rajasthan Royals");
	team.setCaptainName("Sanju Samson");
	team.setCoachName("Rahul Dravid");
	team.setQualified(false);
	team.setnRR(1.f);
	return team;
}
public static Team getSReamDetails(){
	Team team = new Team();
	team.setId(110);
	team.setTeamName("Sunrisers Hyderabad");
	team.setCaptainName("Pat Cummins");
	team.setCoachName("Daniel Vettori");
	team.setQualified(false);
	team.setnRR(1.7f);
	return team;
}
}