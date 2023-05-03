package org.example;

import org.example.entity.MessagesEntity;
import org.hibernate.Session;

public class Main {
//    public static void main(String[] args) throws TelegramApiException {
    public static void main(String[] args) {

        // bot example
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(new Bot());
        
        

        // Hibernate function example for add data in DB

        Session session = HibernateUtil.getSessionFactory().openSession();
        MessagesEntity messagesEntity = new MessagesEntity();
        session.beginTransaction();
        MessagesEntity messagesEntity = new MessagesEntity();
        messagesEntity.setChatId(1);
        messagesEntity.setUserId(1);
        messagesEntity.setUserName("ivan");
        messagesEntity.setMsgId(1);
        messagesEntity.setId((long)1);
        session.persist(messagesEntity);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();

    }
}