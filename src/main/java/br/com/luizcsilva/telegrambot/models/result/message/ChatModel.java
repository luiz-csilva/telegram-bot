package br.com.luizcsilva.telegrambot.models.result.message;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ChatModel {
    Long id;
    String first_name;
    String username;
    String type;

    public ChatModel() {
    }

    public ChatModel(Long id, String first_name, String username, String type) {
        this.id = id;
        this.first_name = first_name;
        this.username = username;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("first_name", first_name).append("username", username).append("type", type).toString();
    }
}
