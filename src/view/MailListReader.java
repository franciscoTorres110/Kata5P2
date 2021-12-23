package view;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import model.Mail;

public class MailListReader {

    public List<Mail> read(String fileName){
        List<Mail> mails = new ArrayList<Mail>();
        File f = new File(fileName);
        Scanner s;
        String emailRegexp = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
        try {
                s = new Scanner(f);
                while (s.hasNextLine()) {
                        String linea = s.nextLine();
                        if (Pattern.matches(emailRegexp, linea)) {
                            //System.out.println(linea);
                            Mail m = new Mail(linea);
                            mails.add(m);
                        }
                        
                }
                s.close();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        }
        return mails;
    }
    
}
