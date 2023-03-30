
/**
 * Password Verifier is used to test if the password has the right credientals to be accepted
 * Constructor for objects of class PasswordVerifier
 * the boolean method testPassword is used to test if the password meets the requirements
 *
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/15/22
 */
public class PasswordVerifier
{
    private String password;
    /**
     * Constructor for objects of class PasswordVerifier
     */
    public PasswordVerifier(String password)
    {
        this.password = password;
    }

    /**
     * the boolean method testPassword is used to test if the password meets the requirements
     * @return isValid tests if the criteria is met for the password
     */
    public boolean testPassword(String password)
    {
        boolean isValid, hasLength, hasDigit, hasLower, hasUpper;
        isValid=hasLength=hasDigit=hasLower=hasUpper=false;
        if(password.length()>=8){
            hasLength = true;
            for(int i = 0; hasLength && i<password.length(); i++){
                if(Character.isDigit(password.charAt(i)))
                    hasDigit = true;

                if(Character.isLowerCase(password.charAt(i)))
                    hasLower = true;

                if(Character.isUpperCase(password.charAt(i)))
                    hasUpper = true;
            }

        }

        isValid=hasLength&&hasDigit&&hasLower&&hasUpper;
        return isValid;
    }
}