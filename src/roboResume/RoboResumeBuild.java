package roboResume;

import java.util.ArrayList;
import java.util.Scanner;

public class RoboResumeBuild {

private static void print(String p){
		System.out.println(p);
	}
		

	
	public void ResumeSkills(){
		
		String userChoice = "";
		int count = 0;
		
		//RoboSkill skill = new RoboSkill();
		//RoboSkill rskill = new RoboSkill();
		RoboRating rrate = new RoboRating();
		RoboResumeApp rrApp = new RoboResumeApp();
		
		do{
		print("Enter your Skills.");
		Scanner scan = new Scanner(System.in);
		String test = scan.nextLine();
		//skill.setSkill(userSkill);
		
		//rrating.setRating()
		
		print("Enter your Rating for this Skill.");
		Scanner rate = new Scanner(System.in);
		String userRating = rate.next();
		rrate.setRating(userRating);
		
		print("Would you like to add more?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
		} while (userChoice.equals("Y") && count <= 20 && count >= 1);
	}
	
	public void ResumeEducation(){
		
		String userChoice = "";
		int count = 0;
		
		//Education e = new Education();
		RoboEducation rSchool = new RoboEducation();
		
		do{
		print("Enter your Educational Achievements.");
		Scanner school = new Scanner(System.in);
		String userSchool = school.nextLine();
		rSchool.setSchool(userSchool);
		
		print("Would you like to add more?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
		} while (userChoice.equals("Y") && count <= 10 && count >= 1);
	}
	
	public void ResumeWork(){	
		
		String userChoice = "";
		int count = 0;
		
		RoboWork w = new RoboWork();
		
		do{
		print("Enter your Job.");
		Scanner job = new Scanner(System.in);
		String userJob = job.nextLine();
		w.setJob(userJob);
		
		print("Enter your First Duty.");
		Scanner d1 = new Scanner(System.in);
		String firstDuty = d1.nextLine();
		w.setDutyOne(firstDuty);
		
		print("Enter your Second Duty.");
		Scanner d2 = new Scanner(System.in);
		String secondDuty = d2.nextLine();
		w.setDutyTwo(secondDuty);
		
		print("Would you like to add more");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
		} while (userChoice.equals("Y") && count <= 10);
   }
}

	/*	//Prints resume
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
		SkillsList.forEach(System.out::println);
		
		*/
	
	
	
	/*private static void printArray(ArrayList a){
		System.out.println(a);*/

	


