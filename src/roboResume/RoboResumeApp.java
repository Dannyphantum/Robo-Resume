package roboResume;

import java.util.ArrayList;
import java.util.Scanner;


public class RoboResumeApp {

	public static void main(String[] args) {
		
		//Creates instances of each called class.
		//RoboSkillRating rSkillRating = new RoboSkillRating();
		RoboSkill rSkill = new RoboSkill();
		RoboEducation rSchool = new RoboEducation();
		RoboWork work = new RoboWork();
		RoboRating rRate = new RoboRating();
	
		//Initializes ArrayLists for user input.
		ArrayList<String> jobList = new ArrayList<String>();
		ArrayList<String> userAchievements = new ArrayList<String>();
		ArrayList<String> userSkills = new ArrayList<String>(); 
		ArrayList<String> userRates = new ArrayList<String>();
		//Prompt and Record name.
		print("Enter your name.");
		Scanner name = new Scanner(System.in);
		String userName = name.nextLine();
		
		//Prompt and Record email.
		print("Enter your email.");
		Scanner email = new Scanner(System.in);
		String userEmail = email.nextLine();
		
		//Set user prompt to continue input to blank.
		String userChoice = "";
		int count = 0;
		
		//Loop intaking user Educational input.
	do{
		print("Enter your Educational Achievements.");
		Scanner school = new Scanner(System.in);
		String userSchool = school.nextLine();
		rSchool.setSchool(userSchool);
		userAchievements.add(userSchool);
		
		print("Would you like to add more?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
	} while (userChoice.equals("Y") && count <= 10 && count >= 1);	
		
		//String userChoice = "";
		 count = 0;
		
		//Loop for taking user Work input.
	do{
		print("Enter your Job.");
		Scanner job = new Scanner(System.in);
		String userJob = job.nextLine();
		work.setJob(userJob);
		jobList.add(userJob);
		
		print("Enter your First Duty.");
		Scanner d1 = new Scanner(System.in);
		String firstDuty = d1.nextLine();
		work.setDutyOne(firstDuty);
		jobList.add(firstDuty);
		
		print("Enter your Second Duty.");
		Scanner d2 = new Scanner(System.in);
		String secondDuty = d2.nextLine();
		work.setDutyTwo(secondDuty);
		jobList.add(secondDuty);
		
		print("Would you like to add more");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
	} while (userChoice.equals("Y") && count <= 10);
   
		//Loop for User Skill input
	do{
		print("Enter your Skills.");
		Scanner scan = new Scanner(System.in);
		String userSkill = scan.nextLine();
		rSkill.setSkill(userSkill);
		userSkills.add(userSkill);
		
		print("Enter your Rating for this Skill.");
		Scanner rate = new Scanner(System.in);
		String userRating = rate.next();
		rRate.setRating(userRating);
		userSkills.add(userRating);
		
		print("Would you like to add more?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
	} while (userChoice.equals("Y") && count <= 20 && count >= 1);

	//userSkills.addAll(userRates);
	
		//Prints resume
		print("NAME:");
		print(userName);
		print("");
				
		print("EMAIL:");
		print(userEmail);
		print("");
		
		print("ACHIEVEMENTS:");
		userAchievements.forEach(System.out::println);
		print("");
		
	
		print("JOBS:");
		jobList.forEach(System.out::println);
		print("");
			
		print("SKILLS:");
		userSkills.forEach(System.out::println);
		
		
		

	}
	
private static void print(String p){
	System.out.println(p);
	}
}
