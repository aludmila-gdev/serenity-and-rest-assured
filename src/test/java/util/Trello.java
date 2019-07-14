package util;

public  class Trello {
    private  static String path;
    private  static String key;
    private  static String token;


    public static String getPath() {
        path = "https://api.trello.com/1";
        return path;
    }

    public static String getKey() {
        key = System.getenv("TRELLO_API_KEY");
        return key;
    }

    public static String getToken() {
        token = System.getenv("TRELLO_TOKEN");

        return token;
    }
}
