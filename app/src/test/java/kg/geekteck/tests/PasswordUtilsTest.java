package kg.geekteck.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PasswordUtilsTest {

    PasswordUtils passwordUtils;

    @Before
    public void setup(){
        passwordUtils=new PasswordUtils();
    }

    @Test
    public void moreSixSymbols(){
        assertFalse(passwordUtils.isPasswordStrong("A1"));
    }
    @Test
    public void onlyLettersSymbols(){
        assertFalse(passwordUtils.isPasswordStrong("ABGTJFGHJJKKUHH"));
    }
    @Test
    public void onlyNumberSymbols(){
        assertFalse(passwordUtils.isPasswordStrong("8476947695695985"));
    }
    @Test
    public void goodSymbols(){
        assertTrue(passwordUtils.isPasswordStrong("A1hfjgjTRF"));
    }

}
