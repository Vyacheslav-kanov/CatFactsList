import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static List<CatFacts> list;
    private static List<CatFacts> result;
    private static JsonConvert arr;
    private static ObjectMapper  mapper = new ObjectMapper();
    public static void main(String[] args) {
        try {
            CloseableHttpClient httpClient = HttpClientBuilder.create()
                    .setDefaultRequestConfig(RequestConfig.custom()
                            .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
                            .setSocketTimeout(30000)    // максимальное время ожидания получения данных
                            .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
                            .build())
                    .build();

            HttpGet request = new HttpGet("https://cat-fact.herokuapp.com/facts");
            request.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
            CloseableHttpResponse response = httpClient.execute(request);

            Arrays.stream(request.getAllHeaders()).forEach(System.out::println);
            System.out.println(response);

            arr = mapper.readValue(response.getEntity().getContent(), new TypeReference<JsonConvert>() {});
            list = arr.getJsonArray();
            Stream<CatFacts> stream = list.stream();
            result = stream
                    .filter(x -> !x.getUpvotes().equals(null))
                    .collect(Collectors.toList());

            result.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


