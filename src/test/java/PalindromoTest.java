import com.impacta.palindromo.Palindromo;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

public class PalindromoTest {

    @Test
    public void PalindromoOK(){

        assertTrue (new Palindromo().isPalindromo("Rotator"));
        assertTrue (new Palindromo().isPalindromo("bob"));
        assertTrue (new Palindromo().isPalindromo("madam"));
        assertTrue (new Palindromo().isPalindromo("mAlAyAlam"));
        assertTrue (new Palindromo().isPalindromo("1"));
        assertTrue (new Palindromo().isPalindromo("Able was I, ere I saw Elba"));
        assertTrue (new Palindromo().isPalindromo("Madam I'm Adam"));
        assertTrue (new Palindromo().isPalindromo("Step on no pets"));
        assertTrue (new Palindromo().isPalindromo("Top spot"));
        assertTrue (new Palindromo().isPalindromo("02/02/2020"));

    }
    
    @Test
    public void PalindromoNOK(){

        assertFalse (new Palindromo().isPalindromo("xyz"));
        assertFalse (new Palindromo().isPalindromo("elephant"));
        assertFalse (new Palindromo().isPalindromo("Country"));
        assertFalse (new Palindromo().isPalindromo("Top . post!"));
        assertFalse (new Palindromo().isPalindromo("Wonderful-fool"));
        assertFalse (new Palindromo().isPalindromo("Wild imagination!"));

    }

}
