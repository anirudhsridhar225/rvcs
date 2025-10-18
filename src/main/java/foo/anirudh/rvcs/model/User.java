package foo.anirudh.rvcs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import foo.anirudh.rvcs.model.Version;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String username;
	private String email;

	public User(String uname, String email) {
		this.email = email;
		this.username = uname;
	}

	// getters
	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	// setters
	public void setUsername(String uname) {
		this.username = uname;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
