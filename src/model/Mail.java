package model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    
    private String mail;
    public Mail(String mail){
        this.mail=mail;
    }
    
    public String getDomains(){
        Pattern pattern1 = Pattern.compile("@([a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)");
        Matcher matcher1 = pattern1.matcher(this.mail);
  
        matcher1.find();
        return matcher1.group(1);
    }
}
