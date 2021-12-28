package main;

import java.util.*;
import model.*;
import view.*;

public class Kata5P2 {
    
    Histogram histogram;
    List<Mail> mailList;

    public static void main(String[] args) {
        Kata5P2 kata4 = new Kata5P2();
        kata4.execute();
    }
    
    private void execute(){
        input();
        process();
        output();
    }
    
    private void input(){
        MailListReaderBD m = new MailListReaderBD();
        mailList = m.selectAll();
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
