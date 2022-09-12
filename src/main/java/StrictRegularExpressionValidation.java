import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//tp5
public class StrictRegularExpressionValidation {

    private List<String> emails = new ArrayList();



    public static void main(String[] args) {
        StrictRegularExpressionValidation strictRegularExpressionValidation = new StrictRegularExpressionValidation();

    }
    public StrictRegularExpressionValidation() {
        test();

    }


    private void test(){
        //valid emails
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user.name@domain.com");
        emails.add("user_name@domain.com");
        emails.add("username@yahoo.corporate.in");

    //Invalid emails
        emails.add(".username@yahoo.com");
        emails.add("username@yahoo.com.");
        emails.add("username@yahoo..com");
        emails.add("username@yahoo.c");
        emails.add("username@yahoo.corporate");


        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
