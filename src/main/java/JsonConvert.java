import java.util.Arrays;

public class JsonConvert {

    private CatFacts[] jsonArray;

    public JsonConvert(CatFacts[] jsonArray) {
        this.jsonArray = jsonArray;
    }

    public CatFacts[] getJsonArray() {
        return jsonArray;
    }

    public void setJsonArray(CatFacts[] jsonArray) {
        this.jsonArray = jsonArray;
    }

    @Override
    public String toString() {
        return "JsonConvert{" +
                "jsonArray=" + Arrays.toString(jsonArray) +
                '}';
    }
}
