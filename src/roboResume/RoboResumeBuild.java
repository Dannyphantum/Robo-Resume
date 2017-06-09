package roboResume;

import java.util.ArrayList;
import java.util.Scanner;
import resume.Education;
import resume.SkillsRating;
import resume.Work;

public class RoboResumeBuild {

private static void print(String p){
		System.out.println(p);
	}
		
	
		
	
	public void ResumeSkills(){
		
		String userChoice = "";
		int count = 0;
		
		SkillsRating skill = new SkillsRating();
		RoboSkill rskill = new RoboSkill();
		
		do{
		print("Enter your Skills.");
		Scanner scan = new Scanner(System.in);
		String userSkill = scan.nextLine();
		rskill.setSkill(userSkill);
		//rrating.setRating()
		
		print("Would you like to add more?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
		} while (userChoice.equals("Y") && count <= 20 && count >= 1);
	}
	
	public void ResumeEducation(){
		
		String userChoice = "";
		int count = 0;
		
		Education e = new Education();
		
		
		do{
		print(e.school());
		Scanner school = new Scanner(System.in);
		String userSchool = school.nextLine();
		userAchievements.add(userSchool);
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
		jobList.add(userJob);
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

	


