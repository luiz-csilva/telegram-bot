package br.com.luizcsilva.telegrambot.controllers;

import br.com.luizcsilva.telegrambot.models.ApiBotModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/")
public class ApiBotController {
    RestTemplate template = new RestTemplate();
    String token = "YOUR_TOKEN_HERE";

    UriComponents uri = UriComponentsBuilder.newInstance()
            .scheme("https")
            .host("api.telegram.org/")
            .path("bot" + token + "/getUpdates")
            .build();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ApiBotModel getMessages(){
        return template.getForEntity(uri.toUriString(), ApiBotModel.class).getBody();
    }
}
