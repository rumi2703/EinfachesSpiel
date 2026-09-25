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
            int spielerZahl = Integer.parseInt(view.getDeineZahlFeld().getText());

            if (spielerZahl >= 1 && spielerZahl <= 9) {
                model.berechneComputerZahl();
                model.berechneRunde(spielerZahl);
                view.getComputerFeld().setText(Integer.toString(model.getComputerZahl()));
                view.getRundenErgebnisFeld().setText(Integer.toString(model.getRundenErgebnis()));
                view.getGesamtPunkteFeld().setText(Integer.toString(model.getGesamtPunkte()));
            }
        }
    }
}