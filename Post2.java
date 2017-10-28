import static java.lang.System.out; 
import java.util.*; 

public class Post2
{

    private String userName; 
    private int postNumber; 
    private String content; 

    public Post2(String userName, String content, int postNumber)
    {
        this.userName=userName;
        this.content=content;
        this.postNumber=postNumber; 
        
    }

    public String getContent()
    {
        return  postNumber+ " "+ " "+ userName+ " "+ content;
    }

    public static void main(String[] args)
    {
        Post2[]allPost={new Post2("Jack2", "I have 3 tickets to improv show. Would you like to join me?", 1), new Post2("Packq", "I would like to go. Where is the location?", 2), 
                new Post2("eTop", "I will pass this time.", 3), new Post2("Jack2", "It is near Power Hall", 4), new Post2("Packq", "Thanks. I will see you there.", 5)};
        User2[]allUser={new User2("Jack", "Smith", "Jack.Smith@gmail.com","Jack2", "jack2Smith.com"), 
                new User2("Quincy", "Davidson", "Q2Davidson@yahoo.com", "Packq", "quincyE.com"),
                new User2("Ellen", "Tope", "etop21@msn.com", "eTop", "tween@etop.com")};
         
            
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

