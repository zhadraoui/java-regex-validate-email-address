import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simplest {
    private List  <String>  emails = new ArrayList();
    private String regex = "^(.+)@(.+)$";


    public static void main(String[] args) {
        Simplest simplest = new Simplest();

    }
    public Simplest() {
        test();

    }


    private void test(){
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

        //Invalid emails
        emails.add("user#domain.com");
        emails.add("@yahoo.com");

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}





