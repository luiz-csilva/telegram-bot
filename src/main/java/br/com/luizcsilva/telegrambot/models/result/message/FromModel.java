package br.com.luizcsilva.telegrambot.models.result.message;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class FromModel {
    Long id;
    boolean is_bot;
    String first_name;
    String username;
    String language_code;

    public FromModel() {
    }

    public FromModel(Long id, boolean is_bot, String first_name, String username, String language_code) {
        this.id = id;
        this.is_bot = is_bot;
        this.first_name = first_name;
        this.username = username;
        this.language_code = language_code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isIs_bot() {
        return is_bot;
    }

    public void setIs_bot(boolean is_bot) {
        this.is_bot = is_bot;
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

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("is_bot", is_bot).append("first_name", first_name).append("username", username).append("language_code", language_code).toString();
    }
}
