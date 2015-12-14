package cn.sse.bupt.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hao.yan on 2015/12/11.
 */
@Data
public class NoticeModel implements Serializable {
    private static final long serialVersionUID = 5361096012428227563L;

    private int id;
    private int uid;
    private int updateUid;
    private String title;
    private String content;
    private int noticeStatus;
    private Date createTime;
    private Date updateTime;
}
