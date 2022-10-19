package FBconnector;

public class FBConnector {
    private static FBConnector fbConnector;

    private FBConnector() {

    }

    public static FBConnector getInstance() {
        if (fbConnector == null) {
            fbConnector = new FBConnector();
        }
        return fbConnector;
    }
}
