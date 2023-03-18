package com.student.reporting.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "students_records")
public class Student {
	@Id
	String id;
	Integer studentRollNumber;
	String name;
	Float englishMarks;
	Float mathsMark;
	Float scienceMarks;
	Integer sem;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(Integer studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(Float englishMarks) {
		this.englishMarks = englishMarks;
	}
	public Float getMathsMark() {
		return mathsMark;
	}
	public void setMathsMark(Float mathsMark) {
		this.mathsMark = mathsMark;
	}
	public Float getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(Float scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public Integer getSem() {
		return sem;
	}
	public void setSem(Integer sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentRollNumber=" + studentRollNumber + ", name=" + name + ", englishMarks="
				+ englishMarks + ", mathsMark=" + mathsMark + ", scienceMarks=" + scienceMarks + ", sem=" + sem + "]";
	}


		
}
