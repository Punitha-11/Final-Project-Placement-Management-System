package com.cg.placementmanagement.Placement.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class College {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String collegename;
    private String collegelocation;
    private  String collegeadmin ;
    private String collegeemail;
	public College() {

}
	public College(Long id, String collegename, String collegelocation, String collegeadmin, String collegeemail ) {
		
		this.id = id;
		this.collegename = collegename;
		this.collegelocation = collegelocation;
		this.collegeadmin =collegeadmin ;
		this.collegeemail=collegeemail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCollegelocation() {
		return collegelocation;
	}
	public void setCollegelocation(String collegelocation) {
		this.collegelocation = collegelocation;
	}
	public String getCollegeadmin() {
		return collegeadmin;
	}
	public void setCollegeadmin(String collegeadmin) {
		this.collegeadmin = collegeadmin;
	}
	public String getCollegeemail() {
		return collegeemail;
	}
	public void setCollegeemail(String collegeemail) {
		this.collegeemail = collegeemail;
	}

	
	
}
