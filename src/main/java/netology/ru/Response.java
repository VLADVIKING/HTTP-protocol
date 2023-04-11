package netology.ru;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public Response(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\t id = " + id +
                "\n\t text = " + text +
                "\n\t type = " + type +
                "\n\t user = " + user +
                "\n\t upvotes = " + upvotes +
                "\n}";
    }
}
