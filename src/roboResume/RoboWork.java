package roboResume;

import java.util.ArrayList;

public class RoboWork {

	private String Job;

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		this.Job = job;
	}
	
	
	private String DutyOne;
	
	public String getDutyOne() {
		return DutyOne;
	}

	public void setDutyOne(String dutyOne) {
		this.DutyOne = dutyOne;
	}

	
	private String DutyTwo;
	
	public String getDutyTwo() {
		return DutyTwo;
	}

	public void setDutyTwo(String dutyTwo) {
		this.DutyTwo = dutyTwo;
	}
	
	public ArrayList<String> addJob(){
		
	ArrayList<String> jobList = new ArrayList<String>();
		jobList.add(getJob());
		jobList.add(getDutyOne());
		jobList.add(getDutyTwo());
		return jobList;
	
	}
}
