package com.fightticket.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "PESENGER_INFO")
public class PersengerInfo {
	@Id
	@GeneratedValue
	private Long pid;
	private String name;
	private String source;
	private String destination;
	private String email;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
	private Date travelDate;
	private String pickUpTIme;
	private String arraivalTIme;
	private double fare;
	

}
