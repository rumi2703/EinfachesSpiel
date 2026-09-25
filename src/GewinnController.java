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
}