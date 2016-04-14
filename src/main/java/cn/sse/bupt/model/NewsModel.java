package cn.sse.bupt.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by melot on 2016/4/14.
 */
@Data
public class NewsModel implements Serializable{
    private int id;
    private int uid;
    private int updateUid;
    private String title;
    private String content;
    private String firstPic;
    private String fileUrls;
    private Date createTime;
    private Date updateTime;
}
