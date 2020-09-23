package br.com.luizcsilva.telegrambot.controllers;

import br.com.luizcsilva.telegrambot.models.GetUpdatesBotModel;
import br.com.luizcsilva.telegrambot.models.SendMessagesBotModel;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/")
public class ApiBotController {
    RestTemplate template = new RestTemplate();
    String token = "YOUR_TOKEN_HERE";

    @RequestMapping(value = "", method = RequestMethod.GET)
    public GetUpdatesBotModel getMessages(){
        UriComponents getUpdates = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("api.telegram.org/")
                .path("bot" + token + "/getUpdates")
                .build();
        return template.getForEntity(getUpdates.toUriString(), GetUpdatesBotModel.class).getBody();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public GetUpdatesBotModel getMessagesbyUpdateId(@PathVariable Long id){
        UriComponents getUpdates = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("api.telegram.org/")
                .path("bot" + token + "/getUpdates" + "?timeout=100&offset=" + id)
                .build();
        return template.getForEntity(getUpdates.toUriString(), GetUpdatesBotModel.class).getBody();
    }

    @RequestMapping(value = "/answer/{chat_id}/{text}", method = RequestMethod.GET)
    public SendMessagesBotModel SendMessage(@PathVariable long chat_id, @PathVariable String text){
        UriComponents answer = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("api.telegram.org/")
                .path("bot" + token + "/sendMessage?" + "chat_id=" + chat_id + "&" + "text=" + text)
                .build();

        return template.getForEntity(answer.toUriString(), SendMessagesBotModel.class).getBody();
    }
}
