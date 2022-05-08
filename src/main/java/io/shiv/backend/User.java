package io.shiv.backend;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    public Long id;
    public String Name;
    public String Email;
    public String Password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + "]";
	}
	public User(Long id, String name, String email, String password) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Password = password;
	}
	public User() {
		super();
	}
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}