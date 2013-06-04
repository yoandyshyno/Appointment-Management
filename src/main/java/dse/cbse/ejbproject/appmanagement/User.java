package dse.cbse.ejbproject.appmanagement.login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String username;
    
    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    private String name;
    
    @NotNull
    @NotEmpty
    @Email
    private String email;
    
    @NotNull
    @Size(min = 6, max = 12)
    private String password;

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
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
    public String toString() {
      return "User (username = " + username + ", name = " + name + ")";
    }

}
