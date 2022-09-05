package com.org.backendbackend.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.org.backendbackend.enums.AccountStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class BankAccount {
	@Id
	private String id;
	private double balance;
	private Date createdAt;
	private AccountStatus status;
	@ManyToOne
	private Customer customer;
	@OneToMany(mappedBy = "bankAccount")
	private List<AccountOperation> accountOperations;
	

}
