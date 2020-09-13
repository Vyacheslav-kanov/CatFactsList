import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String id;
    private UserName name;

    public User(@JsonProperty("_id")String id,
                @JsonProperty("name")UserName name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public UserName getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }
}
