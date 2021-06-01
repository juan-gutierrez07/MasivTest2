package com.test.masiv.Masivtest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.test.masiv.Masivtest.models.enums.Status;

@Entity
@Table(name="roulettes")
public class Roulette {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "status", nullable = false)
	@Enumerated(value = EnumType.STRING)
	private Status status;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Roulette [id=" + id + ", status=" + status + "]";
	}

	public Roulette() {
		
	}

}
