import java.util.Random;

/*
 * Speichert die Daten des Spiels und enthält die Spiellogik.
 * Hier werden die Punkte und die Zahlen berechnet.
 */
public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {
        this.gesamtPunkte = 30;
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berechneComputerZahl() {
        Random random = new Random();
        this.computerZahl = random.nextInt(9) + 1;
    }

    public void berechneRunde (int spielerZahl) {
        this.spielerZahl = spielerZahl;

        if (spielerZahl == computerZahl) {
            this.rundenErgebnis = 20;
        } else if (spielerZahl == (computerZahl + 1) || spielerZahl == (computerZahl - 1)) {
            this.rundenErgebnis = 5;
        } else {
            this.rundenErgebnis = -10;
        }

        this.gesamtPunkte += this.rundenErgebnis;
    }

    public boolean hatGewonnen() {
        if (gesamtPunkte >= 100) {
            return true;
        }
        return false;
    }

    public boolean hatVerloren() {
        if (gesamtPunkte <= 0 ){
            return true;
        }
        return false;
    }
}