package roboResume;

import java.util.ArrayList;
import java.util.Scanner;

import resume.SkillsRating;

public class RoboSkillRating  {

	//private SkillsRating skill;
	private static RoboSkill rskill;
	private static RoboRating rrate;
	
	public RoboSkillRating(){
		 rskill = new RoboSkill();
		 rrate = new RoboRating();
	}
	
	
	
	public ArrayList<String> addskill(){
		
		//Prompt and Record Skills and Ratings
				
				ArrayList<String> SkillsList = new ArrayList<String>();
				SkillsList.add(rskill.getSkill());
				SkillsList.add(rrate.getRating());
		//return "Enter your Skills and Rating. (Skill, Rating)";
				 return SkillsList;
	}
	
}
	/*
	public ArrayList<String> addrate(){
		
		RoboRating rrating = new RoboRating();
		
		ArrayList<String> RatingsList = new ArrayList<String>();
		RatingsList.add(rrating.getRating());
		return RatingsList;
		
	}
	
	//public ArrayList<String> combine(){
	//}
	
	public ArrayList<String> addSkillRate (){
		
		ArrayList<String> SkillRateList = new ArrayList<String>();
		SkillRateList.add();
	}
	
}
*/