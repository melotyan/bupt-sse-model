package cn.sse.bupt.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by hao.yan on 2015/12/7.
 */
public class ResultModel {
    private Result result;
    private Map<String, Object> map = new HashMap<>();

    public ResultModel(Result result) {
        this.result = result;
    }

    public ResultModel() {
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void put(String key, Object object) {
        map.put(key, object);
    }

    public static ResultModel success() {
        return new ResultModel(Result.SUCCESS);
    }

    public static ResultModel failed() {
        return new ResultModel(Result.FAILED);
    }

    public static ResultModel success(String msg) {
        ResultModel resultModel = success();
        resultModel.put("msg", msg);
        return resultModel;
    }

    public static ResultModel failed(String msg) {
        ResultModel resultModel = failed();
        resultModel.put("msg", msg);
        return resultModel;
    }

    private static enum Result {
        SUCCESS(0), FAILED(1);
        private int value;

        private Result(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
