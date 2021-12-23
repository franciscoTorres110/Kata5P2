package view;

import java.util.List;
import model.Histogram;
import model.Mail;

public class MailHistogramBuilder {
    
    public Histogram<String> build (List<Mail> mails){
        Histogram histogram = new Histogram();
        for (int i = 0; i <= mails.size() - 1; i++) {
            histogram.increment(mails.get(i).getDomains());
        }
        return histogram;
    }
}
