import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TranslatorYandex {
    public static void main(String[] args) throws JsonProcessingException {

        System.out.println("Введите слова на русском языке:");
        Scanner scanner = new Scanner(System.in);
        String textForTranslate = scanner.nextLine();

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer" + "токен полученный от яндекса");
        Map<String, String> jsonData = new HashMap<>();
        jsonData.put("folderId", "Id папки полученный от яндекса");
        jsonData.put("targetLanguageCode", "en");
        jsonData.put("texts", "[" + "textForTranslate" + "]");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonData, headers);

        YandexResponse response = restTemplate
                .postForObject("https://translate.api.cloud.yandex.net/translate/v2/translate",
                        request, YandexResponse.class);
        System.out.println(response);

        System.out.println("Перевод: " + response.getTranslations().get(0).getText());

//        //выделяем (парсим) нужную строку перевода из Json с помощью Jackson
//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode node = mapper.readTree(response);
//        System.out.println("Перевод: " + node.get("translations").get(0).get("text"));

    }
}
