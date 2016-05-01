package cn.sse.bupt.enums;

/**
 * Created by melot on 2016/5/1.
 */
public enum SenderStatusEnum {
    SENDED(0, "已发送"), DRAFT(1, "存草稿神气活现"), DELETED(2, "已删除");

    private int value;
    private String description;

    private SenderStatusEnum(int value, String description) {
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
