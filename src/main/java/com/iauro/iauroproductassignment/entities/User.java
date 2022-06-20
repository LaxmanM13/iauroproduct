package com.iauro.iauroproductassignment.entities;

import java.util.Collection;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@EntityScan

@Document(collection = "user1")
public class User implements UserDetails {
	
	
	@Id
	private int _id;
	private String email;
	private String password;
	
	
	
	public User(int _id, String email, String password) {
		super();
		this._id = _id;
		this.email = email;
		this.password = password;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
 		return null;
	}

	@Override
	public String getUsername() {
 		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
 		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		 
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
 		return false;
	}

	@Override
	public boolean isEnabled() {
 		return false;
	}
	
	
	

}
