/*
package roboResume;

import java.util.ArrayList;
import java.util.Scanner;
import resume.Education;
import resume.SkillsRating;
import resume.Work;

public class TestClass {

	//public static void main(String[] args) {
		
		String userChoice = "";
		int count = 0;
		
		SkillsRating skillRate = new SkillsRating();
		RoboSkill rskill = new RoboSkill();
		RoboRating rrating = new RoboRating();
		
		do{
		print("Enter your Skills.");
		Scanner skillscan = new Scanner(System.in);
		String userSkill = skillscan.nextLine();
		rskill.setSkill(userSkill);
		//print(rskill.getSkill());
		
		print("Enter your level with that skill.");
		Scanner ratingscan = new Scanner(System.in);
		String userRating = ratingscan.nextLine();
		rrating.setRating(userRating);
		
		//print(rrating.getRating());
		print("Would you like to add more?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
		} while (userChoice.equals("Y") && count <= 20 && count >= 1);
		
		
	
	
}
private static void print(String p){
	System.out.println(p);
}
}
*/