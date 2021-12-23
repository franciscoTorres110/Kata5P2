package main;

import java.util.*;
import model.*;
import view.*;

public class Kata4 {
    
    Histogram histogram;
    List<Mail> mailList;

    public static void main(String[] args) {
        Kata4 kata4 = new Kata4();
        kata4.execute();
    }
    
    private void execute(){
        input();
        process();
        output();
    }
    
    private void input(){
        String fileName = "email.txt";
        MailListReader m = new MailListReader();
        mailList = m.read(fileName);
    }
    
    private void process(){
        MailHistogramBuilder m2 = new MailHistogramBuilder();
        histogram = m2.build(mailList);
    }
    
    private void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
