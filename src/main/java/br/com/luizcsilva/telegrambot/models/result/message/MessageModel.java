package br.com.luizcsilva.telegrambot.models.result.message;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class MessageModel {
    int message_id;
    FromModel from;
    ChatModel chat;
    long date;
    String text;

    public MessageModel(){}

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public FromModel getFrom() {
        return from;
    }

    public void setFrom(FromModel from) {
        this.from = from;
    }

    public ChatModel getChat() {
        return chat;
    }

    public void setChat(ChatModel chat) {
        this.chat = chat;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("message_id", message_id).append("from", from).append("chat", chat).append("date", date).append("text", text).toString();
    }
}
