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
import static java.lang.System.out;
        
public class Main {
    public static void main(String[] args)
    {
        Post[]allPost={
            new Post("Jack2", "I have 3 tickets to improv show. Would you like to join me?", 
                1, "jack2Smith.com" ),
            new Post("Packq", "I would like to go. Where is the location?", 2, "quincyE.com" ), 
            new Post("eTop", "I will pass this time.", 3, "tween@etop.com"), 
            new Post("Jack2", "It is near Power Hall", 4, "jack2Smith.co"), 
            new Post("Packq", "Thanks. I will see you there.", 5, "quincyE.com")
        };
        
        User[]allUser={new User("Jack", "Smith", "Jack.Smith@gmail.com","Jack2", "jack2Smith.com"), 
            new User("Quincy", "Davidson", "Q2Davidson@yahoo.com", "Packq", "quincyE.com"),
            new User("Ellen", "Tope", "etop21@msn.com", "eTop", "tween@etop.com")
        };
         
            
        for(int i=0; i<allPost.length; i++)
            
        {
             out.println(allPost[i].getContent());
                                             
        }
         for(int j=0; j<allUser.length; j++)
         {
            out.println(allUser[j].getDescription());
        }
    }
    
}
