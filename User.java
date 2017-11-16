/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microblog_1;

/**
 *
 * @author Katrina
 */
import java.util.*; 

public class User {
    private String firstName;
    private String lastName; 
    private String email;
    private String userName; 
    private String url; 

    public User(String firstName, String lastName, String email, String userName, String url)
    {
        this.firstName=firstName;
        this.lastName= lastName; 
        this.email=email;
        this.userName=userName;
        this.url=url; 
    }

    public String getFirstName()
    {
        return firstName; 
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getUsername()
    {
        return userName;
    }

    public String getUrl()
    {
        return url;
    }

    public String getDescription()
    {
        return firstName+ " "+ lastName + " "+ userName + " " + email+ " " + url; 
    }
    
}
