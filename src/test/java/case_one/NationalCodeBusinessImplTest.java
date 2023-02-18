package case_one;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

//because of junit new version dependency ,can't use some annotations like @BeforeEach
public class NationalCodeBusinessImplTest {


    @Before
    public void init() {
        NationalCode nationalCode = NationalCode.builder().nationalCode("7731689951").build();
        NationalCode nationalCode2 = NationalCode.builder().nationalCode("0831689951").build();
        NationalCodeBusinessImpl business = new NationalCodeBusinessImpl();
    }

    @Test
    public void testConvertToNationalCode() {
        assertTrue("0831689951", business.convertToNationalCode("0831689951"));
        assertTrue("7731689951", business.convertToNationalCode("7731689951"));
        assertThrows(NationalCodeValidationException.class, () -> business.convertToNationalCode("55555555"));

    }

    @Test
    public void testValidateNationalCode() {
        business.validateNationalCode(nationalCode);
        assertFalse(nationalCode.getIsValid());
        assertTrue(nationalCode2.getIsValid());
    }

    @Test
    public void testGetStateCode() {
        assertEquals("773", business.getStateCode());
    }

    @Test
    public void testGetPersonUniqueCode() {
        assertEquals("1689951", business.getPersonUniqueCode());
    }
}