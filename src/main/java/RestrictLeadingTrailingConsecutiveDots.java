import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RestrictLeadingTrailingConsecutiveDots {

    private List<String> emails = new ArrayList();



    public static void main(String[] args) {
        RestrictLeadingTrailingConsecutiveDots restrictLeadingTrailingConsecutiveDots = new RestrictLeadingTrailingConsecutiveDots();

    }
    public RestrictLeadingTrailingConsecutiveDots() {
        test();

    }


    private void test(){
        //valid emails
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user.name@domain.com");
        emails.add("user'name@domain.co.in");

        //Invalid emails
        emails.add(".username@yahoo.com");
        emails.add("username@yahoo.com.");
        emails.add("username@yahoo..com");

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
