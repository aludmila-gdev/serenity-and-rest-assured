package api.resources;

public class Board {

    private static String fields;
    private static String path;



    public static String getFields() {
        fields = "name,url";
        return fields;
    }

    public static String getPath() {
        path = "/boards/";
        return path;
    }

}

