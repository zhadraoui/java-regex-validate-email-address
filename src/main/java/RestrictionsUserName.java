import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RestrictionsUserName {

    private List<String> emails = new ArrayList();



    public static void main(String[] args) {
        RestrictionsUserName restrictionsUserName = new RestrictionsUserName();

    }
    public RestrictionsUserName() {
        test();

    }


    private void test(){
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user_name@domain.co.in");
        emails.add("user-name@domain.co.in");
        emails.add("user@domaincom");

//Invalid emails
        emails.add("@yahoo.com");
        /***
         * Please note that similar restriction you can apply to domain name part as well. T
         * hen regular expression will become like this.
         *
         * ^[A-Z0-9+_.-]+@[A-Z0-9.-]+$
         */

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
