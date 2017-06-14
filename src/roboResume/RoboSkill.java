package roboResume;

import java.util.ArrayList;
import java.util.Scanner;

public class RoboSkill {
	
	ArrayList<String> roboskill;

	private String Skill;

	public RoboSkill(){
	
	ArrayList<String> roboskill= new ArrayList();
	
	}
	//Retrieves value of variable skill
	public String getSkill() {
		return Skill;
	}

	//Sets the value of skill. Can accept logic
	public void setSkill(String userSkill) {
		this.Skill = userSkill;
		roboskill.add(userSkill);
	}
	
}
