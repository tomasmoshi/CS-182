import java.util.*;

/**
 * containing all the abstract methods 
 *
 * @author (Tomas Moshi)
 * @version (version v1.0)
 * @since 12/3/22
 */
public interface RationalInterface
{

    /**
     * @exception InputMismatchException passes the buck
     * @exception DivideByZeroException test to see if theres a 0 in denom
     */
    void doRational() throws InputMismatchException, DivideByZeroException;

    /**
     * @exception InputMismatchException passes the buck
     */
    int setUserInput() throws InputMismatchException;

    /**
     * @exception DivideByZeroException test to see if theres a 0 in denom
     */
    double calcRational() throws DivideByZeroException;

}