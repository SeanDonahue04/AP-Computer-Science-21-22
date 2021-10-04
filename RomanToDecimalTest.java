import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XI"), 11) ;
        assertEquals(RomanToDecimal.romanToDecimal("IXIX"), 20) ;
        assertEquals(RomanToDecimal.romanToDecimal("VI"), 6);
        assertEquals(RomanToDecimal.romanToDecimal("LVII"), 57) ;
        assertEquals(RomanToDecimal.romanToDecimal("XXI"), 21) ;
        assertEquals(RomanToDecimal.romanToDecimal("CCL"), 250) ;
        assertEquals(RomanToDecimal.romanToDecimal("MIX"), 1009) ;
        assertEquals(RomanToDecimal.romanToDecimal("IV"), 4) ;
        assertEquals(RomanToDecimal.romanToDecimal("CM"), 900) ;
        assertEquals(RomanToDecimal.romanToDecimal("CMII"), 902) ;
        assertEquals(RomanToDecimal.romanToDecimal("828"), -1) ;
        assertEquals(RomanToDecimal.romanToDecimal("Beast"), -1) ;
        assertEquals(RomanToDecimal.romanToDecimal("IVIVIV"), 16) ;
        assertEquals(RomanToDecimal.romanToDecimal("MMVM"), 3005) ;
        assertEquals(RomanToDecimal.romanToDecimal("VD"), 505) ;
        assertEquals(RomanToDecimal.romanToDecimal("IDID"), 1002) ;
        assertEquals(RomanToDecimal.romanToDecimal("yo momma"), -1);
        assertNotEquals(RomanToDecimal.romanToDecimal("Joe"), 28);
        assertNotEquals(RomanToDecimal.romanToDecimal("XXV"), -1);
    }
}
