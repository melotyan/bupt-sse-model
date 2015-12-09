package cn.sse.bupt.enums;

/**
 * Created by hao.yan on 2015/12/9.
 */
public enum AccountStatusEnum {
    UNACTIVATED(0, "未激活"), ACTIVITATED(1, "激活"), FORBIDDEN(2, "被封号");

    private int value;
    private String description;

    private AccountStatusEnum(int value, String description) {
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
