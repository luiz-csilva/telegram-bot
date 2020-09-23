package br.com.luizcsilva.telegrambot;

import br.com.luizcsilva.telegrambot.controllers.ApiBotController;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TelegramBotApplication {

    static ApiBotController botController = new ApiBotController();

    public static void taskUpdateMessages(long update_id){
        while (botController.getMessagesbyUpdateId(update_id + 1).getResult().size() != 0){
            if (update_id != 0){
                Long user_id = botController.getMessagesbyUpdateId(update_id + 1).getResult().get(0).getMessage().getFrom().getId();
                String text = botController.getMessagesbyUpdateId(update_id + 1).getResult().get(0).getMessage().getText();
                if (text != null){
                    System.out.println(text);
                    botController.SendMessage(user_id, text);
                }
                update_id++;
            }
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(TelegramBotApplication.class, args);

        DateTime dateTime = new DateTime();
        dateTime = dateTime.plusMillis(5000);
        Date date = dateTime.toDate();



        int resultSize = botController
                .getMessages()
                .getResult()
                .size();

        long update_id;

        if (resultSize > 0){
            update_id = botController
                    .getMessages()
                    .getResult()
                    .get(resultSize - 1)
                    .getUpdate_id();
        } else {
            update_id = 0;
        }

        TimerTask task = new TimerTask() {
            @Override public void run() {
                taskUpdateMessages(update_id);
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 0, 1000);

    }

}
