package service;

import entity.Team;
import repository.TeamRepository;
public class TeamService {

public void printTeamDetails() {
Team team = TeamRepository.getMITeamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
	     
		}
public void printDetails() {
Team team = TeamRepository.getCSKTeamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
}
public void printTDetails() {
Team team = TeamRepository.getRCBTeamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
}
public void printTeDetails() {
Team team = TeamRepository.getDCTeamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
}
public void printTeaDetails() {
Team team = TeamRepository.getGJeamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
}
public void printTteamDetails() {
Team team = TeamRepository.getKKReamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
}
public void printIPtDetails() {
Team team = TeamRepository.getLSGeamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
}
public void printILPtTeDetails() {
Team team = TeamRepository.getPKeamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
}
public void printITeDetails() {
Team team = TeamRepository.getRReamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
}
public void printIPTeDetails() {
Team team = TeamRepository.getSReamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getnRR());
System.out.println(team.isQualified());
}
}