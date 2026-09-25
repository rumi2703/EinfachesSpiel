public class SpielTest {

    public static void main(String[] args) {
        GewinnModel model = new GewinnModel();
        GewinnView view = new GewinnView();
        GewinnController controller = new GewinnController(model, view);

        controller.starte();
        view.setVisible(true);
    }
}