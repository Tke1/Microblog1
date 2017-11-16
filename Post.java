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
public class Post {
    private String userName; 
    private int postNumber; 
    private String content; 
    private String webLink; 

    public Post(String userName, String content, int postNumber, String webLink)
    {
        this.userName=userName;
        this.content=content;
        this.postNumber=postNumber; 
        this.webLink= webLink;  
        
    }

    public String getContent()
    {
        return  postNumber+ " "+ webLink+ " "+ userName+ " "+ content;
    }
    
}
