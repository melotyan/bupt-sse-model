package cn.sse.bupt.enums;

/**
 * Created by hao.yan on 2015/12/11.
 */
public enum NoticeStatusEnum {
    NORMAL(0, "正常"), DELETED(1, "已删除");

    private int value;
    private String description;

    private NoticeStatusEnum(int value, String description) {
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
