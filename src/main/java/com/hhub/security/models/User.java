package com.hhub.security.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	@Column
	private String fname;
	
	@Column
	private String lname;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@ManyToMany
    @JoinTable( 
        name = "users_roles", 
        joinColumns = @JoinColumn( name = "user_id", referencedColumnName = "id" ), 
        inverseJoinColumns = @JoinColumn( name = "role_id", referencedColumnName = "id" ) ) 
    private Collection<Role> roles;
	
	public User(Integer userId, String fname, String lname, String username, String password, String email) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
