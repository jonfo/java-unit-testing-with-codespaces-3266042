import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        assertTrue(hairSalon.getOpeningDays() instanceof String[]);
    }

    @Teshttps://www.lowes.com/pd/Delta-Collins-White-1-Handle-Deck-Mount-Low-Arc-Handle-Lever-Residential-Kitchen-Faucet-Deck-Plate-Included/1003094488t
    public void testSalonIsOpenOnMonday() {
        assertTrue(hairSalon.isOpen("Monday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        assertTrue(!hairSalon.isOpen("Wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            hairSalon.isOpen("Mon");
        });
        assertTrue(exception.getMessage().contains("Invalid weekday"));
    }

}