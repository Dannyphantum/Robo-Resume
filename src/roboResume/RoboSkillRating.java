package roboResume;

import java.util.ArrayList;
import java.util.Scanner;

import resume.SkillsRating;

public class RoboSkillRating {

	//private SkillsRating skill;
	
	
	public ArrayList<String> addskill(){
		
		//Prompt and Record Skills and Ratings
				RoboSkill rskill = new RoboSkill();
				RoboRating rrating = new RoboRating();
				ArrayList<String> SkillsList = new ArrayList<String>();
				SkillsList.add(rskill.getSkill());
				SkillsList.add(rrating.getRating());
				
				 

		//return "Enter your Skills and Rating. (Skill, Rating)";
				 return SkillsList;
	}
	
	
}
