package api.steps;

public class Board {

    private String trelloApiLink;
    private String TRELLO_API_KEY;
    private String TRELLO_TOKEN;


    public  String getTrelloApiLink() {
        trelloApiLink = "https://api.trello.com/1";
        return trelloApiLink;
    }

    public String getTRELLO_API_KEY() {
        this.TRELLO_API_KEY = System.getenv("TRELLO_API_KEY");
        return TRELLO_API_KEY;
    }

    public String getTRELLO_TOKEN() {
        this.TRELLO_TOKEN = System.getenv("TRELLO_TOKEN");

        return TRELLO_TOKEN;
    }
}

