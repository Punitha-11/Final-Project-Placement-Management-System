package com.cg.placementmanagement.Placement.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Student {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String studentname;
    private String course;
    private int percentage;
    private String mailid;
    private String college;
    private Long roll;
    private String qualification;
    private int hallticketno;
    
	public Student() {
 
	}
	public Student(Long id, String studentname, String course, int percentage, String mailid, String college,Long roll, String qualification,  int hallticketno) {
	
		this.id = id;
		this.studentname = studentname;
		this.course = course;
		this.percentage= percentage;
		this.mailid = mailid;
		this.college= college;
		this.roll= roll;
		this.qualification= qualification;
		this.hallticketno= hallticketno;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	
	public Long getRoll() {
		return roll;
	}
	public void setRoll(Long roll) {
		this.roll = roll;
		
	}
	
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification( String qualification) {
		this.qualification = qualification;
	}
	
 
	public int getHallticketno() {
		return hallticketno;
	}
	public void sethallticketno( int hallticketno) {
		this.hallticketno = hallticketno;
	}
	
}