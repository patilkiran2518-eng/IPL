package service;

import java.util.Scanner;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal");
		System.out.println("Please select following options-");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get team details by short name");
		System.out.println("3. Get team details by id");
		
		int input = sc.nextInt();
		System.err.println("you have selected option:" + input);
		
		switch(input) {
		case 1:{
			System.out.println(TeamRepository.getMITeamDetails());
			System.out.println(TeamRepository.getCSKTeamDetails());
			System.out.println(TeamRepository.getRCBTeamDetails());
			System.out.println(TeamRepository.getDCTeamDetails());
			System.out.println(TeamRepository.getGJTeamDetails());
			System.out.println(TeamRepository.getKKRTeamDetails());
			System.out.println(TeamRepository.getLSGTeamDetails());
			System.out.println(TeamRepository.getPKTeamDetails());
			System.out.println(TeamRepository.getRRTeamDetails());
			System.out.println(TeamRepository.getSRHTeamDetails());
			
			break;
		}
		case 2:{
			System.out.println("Please enter your fav team's short name:");
			String teamShortName = sc.next();
			System.err.println("entered team short name is :"+ teamShortName);
			getTeamByShortName(teamShortName);
			break;
		}
		case 3:{
			System.out.println("Please enter your fav team's ID:");
			String teamId = sc.next();
			System.err.println("entered team Id is:"+ teamId);
			if(teamId.equals("101")) {
				System.out.println(TeamRepository.getMITeamDetails());
		}else if(teamId.equals("102")) {
				System.out.println(TeamRepository.getCSKTeamDetails());
		}else if(teamId.equals("103")) {
			System.out.println(TeamRepository.getRCBTeamDetails());
		}else if(teamId.equals("104")) {
			System.out.println(TeamRepository.getDCTeamDetails());
		}else if(teamId.equals("105")) {
			System.out.println(TeamRepository.getGJTeamDetails());
		}else if(teamId.equals("106")) {
			System.out.println(TeamRepository.getKKRTeamDetails());
		}else if(teamId.equals("107")) {
			System.out.println(TeamRepository.getLSGTeamDetails());
		}else if(teamId.equals("108")) {
			System.out.println(TeamRepository.getPKTeamDetails());
		}else if(teamId.equals("109")) {
			System.out.println(TeamRepository.getRRTeamDetails());
		}else if(teamId.equals("110")) {
			System.out.println(TeamRepository.getSRHTeamDetails());
		}else {
			System.out.println("Invalid team ID");
		}
		}
		}
		}
	private void getTeamByShortName(String shortName) {
		
		switch(shortName) {
		case"MI":{
			System.out.println(TeamRepository.getMITeamDetails());
			break;
		}
		case"CSK":{
			System.out.println(TeamRepository.getCSKTeamDetails());
			break;
		}
		case"RCB":{
			System.out.println(TeamRepository.getRCBTeamDetails());
			break;
		}
		case"DCT":{
			System.out.println(TeamRepository.getDCTeamDetails());
			break;
		}
		case"GJ":{
			System.out.println(TeamRepository.getGJTeamDetails());
			break;
		}
		case"KKR":{
			System.out.println(TeamRepository.getKKRTeamDetails());
			break;
		}
		case"LSG":{
			System.out.println(TeamRepository.getLSGTeamDetails());
			break;
		}
		case"PK":{
			System.out.println(TeamRepository.getPKTeamDetails());
			break;
		}
		case"RR":{
			System.out.println(TeamRepository.getRRTeamDetails());
			break;
		}
		case"SRH":{
		System.out.println(TeamRepository.getSRHTeamDetails());
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value:"+ shortName);
		}
	}
	}
