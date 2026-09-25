import java.awt.*;
import java.awt.event.*;

public class GewinnController implements ActionListener {

    private GewinnModel model;
    private GewinnView view;

    public GewinnController(GewinnModel model, GewinnView view) {
        this.model = model;
        this.view = view;
    }

    public void starte() {
        view.getDeineZahlFeld().addActionListener(this);
        view.getNochEinmalButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getDeineZahlFeld()) {
            try {
                int spielerZahl = Integer.parseInt(view.getDeineZahlFeld().getText());

                if (spielerZahl >= 1 && spielerZahl <= 9) {
                    model.berechneComputerZahl();
                    model.berechneRunde(spielerZahl);
                    view.getComputerFeld().setText(Integer.toString(model.getComputerZahl()));
                    view.getRundenErgebnisFeld().setText(Integer.toString(model.getRundenErgebnis()));
                    view.getGesamtPunkteFeld().setText(Integer.toString(model.getGesamtPunkte()));

                    if (model.getRundenErgebnis() > 0 || model.hatGewonnen()) {
                        view.getRundenErgebnisLabel().setBackground(Color.GREEN);
                        view.getGesamtPunkteLabel().setBackground(Color.GREEN);
                    }
                    else if (model.getRundenErgebnis() < 0 || model.hatVerloren()) {
                        view.getRundenErgebnisLabel().setBackground(Color.RED);
                        view.getGesamtPunkteLabel().setBackground(Color.RED);
                    }
                    else {
                        view.getRundenErgebnisLabel().setBackground(Color.WHITE);
                        view.getGesamtPunkteLabel().setBackground(Color.WHITE);
                    }
                } else {
                    view.getDeineZahlFeld().setText("");
                }
            } catch (NumberFormatException ex) {
                view.getDeineZahlFeld().setText("");
            }
        }
        if (e.getSource() == view.getNochEinmalButton()) {
            view.getRundenErgebnisFeld().setText("");
            view.getDeineZahlFeld().setText("");
            view.getComputerFeld().setText("");
        }
    }
}