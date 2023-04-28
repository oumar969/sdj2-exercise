import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TestVentesal {

    @Test
    public void tilfoejPatient() {
        Ventesal ventesal = new Ventesal();
        assertDoesNotThrow(() -> ventesal.tilfoejPatient(new Person("Ole", 30)));
    }

    @Test
    public void hentPatientVedTomVentesal() {
        Ventesal ventesal = new Ventesal();

            assertThrows(Exception.class, ()-> ventesal.hentPatient());
    }

    @Test
    public void personOver100(){
        Ventesal ventesal = new Ventesal();
        assertThrows(IllegalArgumentException.class, () -> ventesal.tilfoejPatient(new Person("Ole", 101)));
    }
    @Test
    public void personPaa100(){
        Ventesal ventesal = new Ventesal();
        assertDoesNotThrow(() -> ventesal.tilfoejPatient(new Person("Ole", 100)));
    }

    @Test
    public void over10Patienter(){
        Ventesal ventesal = new Ventesal();
        for (int i = 0; i < 10; i++) {
            ventesal.tilfoejPatient(new Person("Ole " + i, i));
        }
        try {
            ventesal.tilfoejPatient(new Person("Ole " + 10, 10));
            fail("IllegalStateException not thrown");
        } catch (IllegalStateException ex) {}
    }

    @Test
    public void under5PatienterOver65() {
        Ventesal ventesal = new Ventesal();
        ventesal.tilfoejPatient(new Person("Ib",20));
        for (int i = 0; i < 3; i++) {
            ventesal.tilfoejPatient(new Person("Ole", 70));
        }
        Person foerst = null;
        try {
            foerst = ventesal.hentPatient();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals(20, foerst.getAlder());
    }
    @Test
    public void praecist5PatienterOver65() {
        Ventesal ventesal = new Ventesal();
        ventesal.tilfoejPatient(new Person("Ib",20));
        for (int i = 0; i < 5; i++) {
            ventesal.tilfoejPatient(new Person("Ole", 70));
        }
        Person foerst = null;
        try {
            foerst = ventesal.hentPatient();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals(20, foerst.getAlder());
    }

    @Test
    public void praecist6PatienterOver65() {
        Ventesal ventesal = new Ventesal();
        ventesal.tilfoejPatient(new Person("Ib",20));
        for (int i = 0; i < 6; i++) {
            ventesal.tilfoejPatient(new Person("Ole", 70));
        }
        Person foerst = null;
        try {
            foerst = ventesal.hentPatient();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals(70, foerst.getAlder());
    }

}
