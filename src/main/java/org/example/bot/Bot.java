package org.example.bot;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.Map;

public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "first_test_rebbecca_one_love_bot";
    }

    @Override
    public String getBotToken() {
        return "6082724738:AAH3sd-Uw5Ztg8NUluaLZWWwNLcbw3hlJXw";
    }

    @Override
    public void onUpdateReceived(Update update) {
        // do something     
    }

    public void sendText(Long who, String what){
        SendMessage sm = SendMessage.builder()
                .chatId(who.toString())
                .text(what).build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}