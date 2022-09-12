import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationFC5322 {

    private List<String> emails = new ArrayList();



    public static void main(String[] args) {
        ValidationFC5322 validationFC5322 = new ValidationFC5322();

    }
    public ValidationFC5322() {
        test();

    }


    private void test(){
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user.name@domain.com");
        emails.add("user?name@domain.co.in");
        emails.add("user'name@domain.co.in");

//Invalid emails
        emails.add("@yahoo.com");
        /***
         * Please note that similar restriction you can apply to domain name part as well. T
         * hen regular expression will become like this.
         *
         * ^[A-Z0-9+_.-]+@[A-Z0-9.-]+$
         */

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
