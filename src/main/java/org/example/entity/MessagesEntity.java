package org.example.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "messages", schema = "public", catalog = "postgres")
public class MessagesEntity {
    @Id
    @Basic
    @Column(name = "id", nullable = true)
    private Long id;
    @Basic
    @Column(name = "msg_id", nullable = false)
    private long msgId;
    @Basic
    @Column(name = "user_name", nullable = false, length = -1)
    private String userName;
//    @Basic
    @Column(name = "user_id", nullable = false)
    private long userId;
    @Basic
    @Column(name = "chat_id", nullable = false)
    private long chatId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessagesEntity that = (MessagesEntity) o;
        return msgId == that.msgId && userId == that.userId && chatId == that.chatId && Objects.equals(id, that.id) && Objects.equals(userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, msgId, userName, userId, chatId);
    }

}
