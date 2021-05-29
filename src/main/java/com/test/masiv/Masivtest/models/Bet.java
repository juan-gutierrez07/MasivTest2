package com.test.masiv.Masivtest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.test.masiv.Masivtest.models.enums.Status;


@Entity
@Table(name="bets")
public class Bet
{
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="number", nullable = true)
	private String number;
	@Column(name="color",nullable = true)
	private String password;
	@Column(name = "status", nullable = false)
	@Enumerated(value = EnumType.STRING)
	private Status status;
	
}
