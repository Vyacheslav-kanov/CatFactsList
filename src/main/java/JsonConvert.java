import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

public class JsonConvert {

    private List<CatFacts> jsonArray;

    public JsonConvert(@JsonProperty("all") List<CatFacts> jsonArray) {
        this.jsonArray = jsonArray;
    }

    public List<CatFacts> getJsonArray() {
        return jsonArray;
    }

    public void setJsonArray(List<CatFacts> jsonArray) {
        this.jsonArray = jsonArray;
    }

    @Override
    public String toString() {
        return "JsonConvert{" +
                "jsonArray=" + jsonArray +
                '}';
    }
}
