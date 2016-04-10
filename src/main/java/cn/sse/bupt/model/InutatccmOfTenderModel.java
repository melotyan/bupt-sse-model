package cn.sse.bupt.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by melot on 2016/4/4.
 */
@Data
public class InutatccmOfTenderModel implements Serializable {
    private int id;
    private int uid;
    private String title;
    private String content;
    private String fileUrl;
    private Date createDate;
}
