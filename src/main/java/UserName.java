import com.fasterxml.jackson.annotation.JsonProperty;

public class UserName {

    private String first;
    private String last;

    public UserName(@JsonProperty("first")String first,
                    @JsonProperty("last")String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return "UserName{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
