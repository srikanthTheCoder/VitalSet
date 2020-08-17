package com.ideas2it.redisservice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vital_set")
public class VitalSet implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	@Column(name = "USER_NAME")
	private String username;
	@Column(name = "PATIENT_FIRST_NAME")
	private String patientFirstName;
	@Column(name = "PATIENT_LAST_NAME")
	private String patientLastName;
	@Column(name = "SYSTOLIC")
	private long systolic;
	@Column(name = "DIASTOLIC")
	private long diastolic;
	@Column(name = "PULSE")
	private long pulse;
	@Column(name = "RESPITATIONS")
	private long respirations;
	@Column(name = "SPO2")
	private long spo2;
	@Column(name = "TEMPERATURE")
	private double temperature;
	@Column(name = "DATE")
	private String date;
	@Column(name = "TIME")
	private String time;
	
	public VitalSet() {
		super();
	}

	public VitalSet(long id, String username, String patientFirstName, String patientLastName, long systolic,
			long diastolic, long pulse, long respirations, long spo2, double temperature, String date, String time) {
		super();
		this.id = id;
		this.username = username;
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.pulse = pulse;
		this.respirations = respirations;
		this.spo2 = spo2;
		this.temperature = temperature;
		this.date = date;
		this.time = time;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public long getSystolic() {
		return systolic;
	}

	public void setSystolic(long systolic) {
		this.systolic = systolic;
	}

	public long getDiastolic() {
		return diastolic;
	}

	public void setDiastolic(long diastolic) {
		this.diastolic = diastolic;
	}

	public long getPulse() {
		return pulse;
	}

	public void setPulse(long pulse) {
		this.pulse = pulse;
	}

	public long getRespirations() {
		return respirations;
	}

	public void setRespirations(long respirations) {
		this.respirations = respirations;
	}

	public long getSpo2() {
		return spo2;
	}

	public void setSpo2(long spo2) {
		this.spo2 = spo2;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VitalSet other = (VitalSet) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VitalSet [id=" + id + ", username=" + username + ", patientFirstName=" + patientFirstName
				+ ", patientLastName=" + patientLastName + ", systolic=" + systolic + ", diastolic=" + diastolic
				+ ", pulse=" + pulse + ", respirations=" + respirations + ", spo2=" + spo2 + ", temperature="
				+ temperature + ", date=" + date + ", time=" + time + "]";
	}
	
	
	
}