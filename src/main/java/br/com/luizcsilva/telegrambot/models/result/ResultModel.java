package br.com.luizcsilva.telegrambot.models.result;

import br.com.luizcsilva.telegrambot.models.result.message.MessageModel;

import java.util.ArrayList;
import java.util.List;

public class ResultModel {
    Long update_id;
    MessageModel message;

    public ResultModel() {
    }

    public Long getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Long update_id) {
        this.update_id = update_id;
    }

    public MessageModel getMessage() {
        return message;
    }

    public void setMessage(MessageModel message) {
        this.message = message;
    }

    @Override public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this).append("update_id", update_id).append("message", message).toString();
    }
}
