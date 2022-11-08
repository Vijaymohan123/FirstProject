package ProjectKanban.User.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registerlogin")
public class User
{
	@Id
	//String dasId;
	int dasId;
	@Column(name="candidateName")
	String candidateName;
	String password;
	int totalExperience;
	int age;
	int relevantExperience;
	LocalDate expectedLWD;
	String location;	
	String skills;
	String technology;
	String martialStatus;
	
	String cardStatus;
	
	
	public User()
	{
 
	}

	public User(int dasId,String candidateName,String password,int totalExperience,int age,int relevantExperience,LocalDate expectedLWD,String location,String skills,
	        String technology,String maritalStatus,String cardStatus)
	{
	    this.dasId=dasId;
	    this.candidateName=candidateName;
	    this.password=password;
	    this.totalExperience=totalExperience;
	    this.age=age;
	    this.relevantExperience=relevantExperience;
	    this.expectedLWD=expectedLWD;
	    this.location=location;
		this.skills=skills;
		this.technology=technology;
		this.martialStatus=maritalStatus;
		this.cardStatus=cardStatus;
	
		
	}
	@Override
	public String toString(){
		return "User [dasId=" + dasId + ", candidateName=" + candidateName
				+ ", totalExperience=" + totalExperience + ", age=" + age + ", relevantExperience=" + relevantExperience
				+ ", expectedLWD=" + expectedLWD + ", location=" + location + ", skills=" + skills + ", technology="
				+ technology + ", martialStatus=" + martialStatus + ",cardStatus=" +cardStatus+"]";
	}
	public int getDasId() {
		return dasId;
	}
	public void setDasId(int dasId) {
		this.dasId = dasId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRelevantExperience() {
		return relevantExperience;
	}
	public void setRelevantExperience(int relevantExperience) {
		this.relevantExperience = relevantExperience;
	}
	public LocalDate getExpectedLWD() {
		return expectedLWD;
	}
	public void setExpectedLWD(LocalDate expectedLWD) {
		this.expectedLWD = expectedLWD;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    
	
	
}
