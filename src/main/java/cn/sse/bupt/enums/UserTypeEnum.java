package cn.sse.bupt.enums;

/**
 * Created by hao.yan on 2015/12/1.
 */
public enum UserTypeEnum {
    ADMIN(0, "管理员"),
    EXAMINER(1, "审批员"),
    CLERK(2, "业务员"),
    CUSTOMER(3, "一般用户");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    private UserTypeEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }
}
