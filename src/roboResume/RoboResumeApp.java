package roboResume;

import java.util.ArrayList;
import java.util.Scanner;

import resume.Education;
import resume.SkillsRating;
import resume.Work;

public class RoboResumeApp {

	public static void main(String[] args) {
		
		
		//Prompt and Record name.
		print("Enter your name.");
		Scanner name = new Scanner(System.in);
		String userName = name.nextLine();
		
		//Prompt and Record email.
		print("Enter your email.");
		Scanner email = new Scanner(System.in);
		String userEmail = email.nextLine();
		
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
		SkillsList.forEach(System.out::println);
		

	}
	
	private static void print(String p){
		System.out.println(p);
	}

}
