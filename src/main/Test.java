package main;

import service.TeamService;

public class Test {

	public static void main(String[]args) {
		TeamService service = new TeamService();
		System.out.println("MI Team Details:-");
		service.printTeamDetails();
		System.out.println("CSK Team Details:-");
		service.printDetails();
		System.out.println("RCB Team Details:-");
		service.printTDetails();
		System.out.println("DC team Details:-");
		service.printTeDetails();
		System.out.println("GJ team Details:-");
		service.printTeaDetails();
		System.out.println("KKR team Details:-");
		service.printTteamDetails();
		System.out.println("LSG team Details:-");
		service.printIPtDetails();
		System.out.println("PK team Details:-");
		service.printILPtTeDetails();
		System.out.println("RR team Details:-");
		service.printITeDetails();
		System.out.println("SR team Details:-");
		service.printIPTeDetails();
		}
}
