import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFacts {

    private String id;
    private String text;
    private String type;
    private int upvotes;
    private String userUpvotes;

    public CatFacts(@JsonProperty("_id") String id,
                    @JsonProperty("text") String text,
                    @JsonProperty("type") String type,
                    @JsonProperty("upvotes") int upvotes,
                    @JsonProperty("userUpvoted") String userUpvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.upvotes = upvotes;
        this.userUpvotes = userUpvotes;
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

    public int getUpvotes() {
        return upvotes;
    }

    public String getUserUpvotes() {
        return userUpvotes;
    }

    @Override
    public String toString() {
        return "CatFacts{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", upvotes='" + upvotes + '\'' +
                ", userUpvotes='" + userUpvotes + '\'' +
                '}';
    }
}
