package br.com.luizcsilva.telegrambot.models;

import br.com.luizcsilva.telegrambot.models.result.ResultModel;
import br.com.luizcsilva.telegrambot.models.result.message.MessageModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ApiBotModel {
    private Boolean ok;
    List<ResultModel> result;

    public ApiBotModel(){};

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public List<ResultModel> getResult() {
        return result;
    }

    public void setResult(List<ResultModel> result) {
        this.result = result;
    }
}
