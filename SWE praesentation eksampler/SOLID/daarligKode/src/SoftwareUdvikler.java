public class SoftwareUdvikler implements Medarbejder {

    @Override
    public void arbejd() {
        System.out.println("Skriv kode");

    }

    @Override
    public void holdPause() {
        System.out.println("Tag en kaffepause");

    }

    @Override
    public void gåPåToilet() {
        System.out.println("Gå på toilettet");

    }

    @Override
    public void skrivRapport() {
        // Softwareudvikleren har ingen opgave her, men vi er nødt til at implementere denne metode

    }

    @Override
    public void sælgProdukt() {

    }
}
