package cn.sse.bupt.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by melot on 2016/5/1.
 */
@Data
public class MailboxModel implements Serializable {
    private int id;
    private int uid;
    private String senderName;
    private String receiverName;
    private int senderStatus;
    private int receiverStatus;
    private String title;
    private String content;
    private Date sendTime;
    private Date updateTime;
}
