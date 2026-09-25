import javax.swing.*;
import java.awt.*;

public class GewinnView extends JFrame {

    private JLabel rundenErgebnisLabel;
    private JLabel gesamtPunkteLabel;

    private JTextField rundenErgebnisFeld;
    private JTextField gesamtPunkteFeld;
    private JTextField deineZahlFeld;
    private JTextField computerFeld;

    private JButton nochEinmalButton;

    public GewinnView() {
        this.setTitle("Zahlen-Gewinnspiel (v1.0)");
        this.setSize(600,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel hauptPanel = new JPanel(new BorderLayout());

        JPanel spielPanel = new JPanel(new GridLayout(1, 2, 10, 0));

        JPanel links = new JPanel();
        links.setLayout(new BoxLayout(links, BoxLayout.Y_AXIS));

        rundenErgebnisLabel = new JLabel("Rundenergebnis:");
        rundenErgebnisLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        rundenErgebnisFeld = new JTextField("Tippe eine Zahl von 1 bis 9");
        rundenErgebnisFeld.setEditable(false);
        rundenErgebnisFeld.setHorizontalAlignment(JTextField.CENTER);
        rundenErgebnisFeld.setBackground(Color.WHITE);
        rundenErgebnisFeld.setMaximumSize(new Dimension(400, 15));
        rundenErgebnisLabel.setOpaque(true);

        JLabel deineZahlLabel = new JLabel("Deine Zahl:");
        deineZahlLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        deineZahlFeld = new JTextField();
        deineZahlFeld.setHorizontalAlignment(JTextField.CENTER);

        links.add(rundenErgebnisLabel);
        links.add(rundenErgebnisFeld);
        links.add(deineZahlLabel);
        links.add(deineZahlFeld);

        JPanel rechts = new JPanel();
        rechts.setLayout(new BoxLayout(rechts, BoxLayout.Y_AXIS));

        gesamtPunkteLabel = new JLabel("Gesamtpunkte:");
        gesamtPunkteLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        gesamtPunkteLabel.setOpaque(true);

        gesamtPunkteFeld = new JTextField("Gesamtpunkte: 30");
        gesamtPunkteFeld.setEditable(false);
        gesamtPunkteFeld.setHorizontalAlignment(JTextField.CENTER);
        gesamtPunkteFeld.setBackground(Color.WHITE);
        gesamtPunkteFeld.setMaximumSize(new Dimension(400, 15));

        JLabel computerLabel = new JLabel("Computer:");
        computerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        computerFeld = new JTextField();
        computerFeld.setEditable(false);
        computerFeld.setHorizontalAlignment(JTextField.CENTER);
        computerFeld.setBackground(Color.WHITE);

        rechts.add(gesamtPunkteLabel);
        rechts.add(gesamtPunkteFeld);
        rechts.add(computerLabel);
        rechts.add(computerFeld);

        spielPanel.add(links);
        spielPanel.add(rechts);

        JPanel buttonPanel = new JPanel();
        nochEinmalButton = new JButton("Noch einmal!");
        buttonPanel.add(nochEinmalButton);

        hauptPanel.add(spielPanel, BorderLayout.CENTER);
        hauptPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(hauptPanel);
    }

    public JTextField getDeineZahlFeld() {
        return deineZahlFeld;
    }

    public JTextField getRundenErgebnisFeld() {
        return rundenErgebnisFeld;
    }

    public JTextField getGesamtPunkteFeld() {
        return gesamtPunkteFeld;
    }

    public JTextField getComputerFeld() {
        return computerFeld;
    }

    public JButton getNochEinmalButton() {
        return nochEinmalButton;
    }

    public JLabel getGesamtPunkteLabel() {
        return gesamtPunkteLabel;
    }

    public JLabel getRundenErgebnisLabel() {
        return rundenErgebnisLabel;
    }
}