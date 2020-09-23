package br.com.luizcsilva.telegrambot.models;

import br.com.luizcsilva.telegrambot.models.result.ResultModel;
import br.com.luizcsilva.telegrambot.models.result.ResultSendMessagesBotModel;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class SendMessagesBotModel {
    private Boolean ok;
    ResultSendMessagesBotModel result;

    public SendMessagesBotModel() {
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public ResultSendMessagesBotModel getResult() {
        return result;
    }

    public void setResult(ResultSendMessagesBotModel result) {
        this.result = result;
    }

    @Override public String toString() {
        return new ToStringBuilder(this).append("ok", ok).append("result", result).toString();
    }
}
