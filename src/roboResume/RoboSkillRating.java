package roboResume;

import java.util.ArrayList;
import java.util.Scanner;

import resume.SkillsRating;

public class RoboSkillRating {

	//private SkillsRating skill;
	
	
	public ArrayList<String> addskill(){
		
		//Prompt and Record Skills and Ratings
				RoboSkill rskill = new RoboSkill();
				
				ArrayList<String> SkillsList = new ArrayList<String>();
				SkillsList.add(rskill.getSkill());
			
		//return "Enter your Skills and Rating. (Skill, Rating)";
				 return SkillsList;
	}
	
	public ArrayList<String> addrate(){
		
		RoboRating rrating = new RoboRating();
		
		ArrayList<String> RatingsList = new ArrayList<String>();
		RatingsList.add(rrating.getRating());
		return RatingsList;
	}
	
}
