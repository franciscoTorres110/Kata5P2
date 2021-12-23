package main;

import java.util.*;
import model.*;
import view.*;

public class Kata4 {

    public static void main(String[] args) {
        
        /* ========  INPUT ======== */
        String fileName = "email.txt";
        
        MailListReader m = new MailListReader();
        List<Mail> mailList = m.read(fileName);
        
        /* ========  PROCESS ======== */
        MailHistogramBuilder m2 = new MailHistogramBuilder();
        Histogram histogram = m2.build(mailList);
        
        /* ========  OUTPUT ======== */
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
        
    }
    
}
