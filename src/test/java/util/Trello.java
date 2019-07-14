package util;

public  class Trello {
    private  static String TRELLO_API_LINK;
    private  static String TRELLO_API_KEY;
    private  static String TRELLO_TOKEN;


    public static String getTRELLO_API_LINK() {
        TRELLO_API_LINK = "https://api.trello.com/1";
        return TRELLO_API_LINK;
    }

    public static String getTRELLO_API_KEY() {
        TRELLO_API_KEY = System.getenv("TRELLO_API_KEY");
        return TRELLO_API_KEY;
    }

    public static String getTRELLO_TOKEN() {
        TRELLO_TOKEN = System.getenv("TRELLO_TOKEN");

        return TRELLO_TOKEN;
    }
}
