package br.com.luizcsilva.telegrambot;

import br.com.luizcsilva.telegrambot.models.ApiBotModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest class TelegramBotApplicationTests {

    @Test void contextLoads() {
        RestTemplate template = new RestTemplate();

        // https://api.telegram.org/bot1172104673:AAETdYoHImubGaS44hVe8sIMbRqSIsyPcFo/getUpdates

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("api.telegram.org/")
                .path("bot1172104673:AAETdYoHImubGaS44hVe8sIMbRqSIsyPcFo/getUpdates")
                .build();

        ResponseEntity<ApiBotModel> entity = template.getForEntity(uri.toUriString(), ApiBotModel.class);
        System.out.println(entity.getBody().getResult().get(0).getMessage().getText());
    }

}
