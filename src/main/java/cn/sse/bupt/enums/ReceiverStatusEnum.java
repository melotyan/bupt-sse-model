package cn.sse.bupt.enums;

/**
 * Created by melot on 2016/5/1.
 */
public enum ReceiverStatusEnum {
    NOT_READ(0, "未读"), READED(1, "已读"), DELETED(2, "已删除");

    private int value;
    private String description;

    private ReceiverStatusEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
