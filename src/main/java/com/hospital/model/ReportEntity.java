package com.hospital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="REPORT")
public class ReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="name_surname")
    private String nameSurname;
    
    @Column(name="social_security_number ")
    private String socialSecurityNumber;
    
    @Column(name="diagnosis")
    private String diagnosis;
    
    @Column(name="diagnosis_detail")
    private String diagnosisDetail;
    
    @Column(name="date_of_report")
    private String dateOfReport;
    
    @Column(name="laborant")
    private String laborant;        

	@Lob    
    private byte[] data;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getDiagnosis() {
		return diagnosis;
	}
	
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDiagnosisDetail() {
		return diagnosisDetail;
	}

	public void setDiagnosisDetail(String diagnosisDetail) {
		this.diagnosisDetail = diagnosisDetail;
	}

	public String getDateOfReport() {
		return dateOfReport;
	}

	public void setDateOfReport(String dateOfReport) {
		this.dateOfReport = dateOfReport;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	public String getLaborant() {
		return laborant;
	}

	public void setLaborant(String laborant) {
		this.laborant = laborant;
	}

	@Override
    public String toString() {
        return "ReportEntity [id=" + id + ", nameSurname=" + nameSurname + ", socialSecurityNumber=" + socialSecurityNumber + 
        		", diagnosis=" + diagnosis  + ", diagnosisDetail=" + diagnosisDetail + ", dateOfReport=" + dateOfReport + ",]";
    }
}