import org.apache.commons.validator.routines.EmailValidator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApachEmailValidator {
//tp6

    @Test
public void testUsingEmailValidator() {
    String emailAddress = "..username@domain.com";
    assertTrue(EmailValidator.getInstance().isValid(emailAddress));
}
}
