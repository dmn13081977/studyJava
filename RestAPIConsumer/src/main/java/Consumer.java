import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        //Get запрос получение данных
        String response = restTemplate.getForObject("https://reqres.in/api/users/2", String.class);
        System.out.println(response);

        //Post запрос создание пользователя
        Map<String, String> jsonToSend = new HashMap<>();
        jsonToSend.put("name", "Test name");
        jsonToSend.put("job", "Test job");
        HttpEntity<Map<String, String>> request  = new HttpEntity<>(jsonToSend);
        String response1 = restTemplate.postForObject("https://reqres.in/api/users", request, String.class);
        System.out.println(response1);
    }
}
