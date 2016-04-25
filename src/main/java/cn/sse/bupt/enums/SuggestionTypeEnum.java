package cn.sse.bupt.enums;

/**
 * Created by melot on 2016/4/25.
 */
public enum SuggestionTypeEnum {
    SUGGESTION(0, "建议"), COMPLAINT(1, "投诉举报"), SEEK_HELP(2, "求助");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    private SuggestionTypeEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }
}
