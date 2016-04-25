package cn.sse.bupt.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by hao.yan on 2016/1/12.
 */
@Data
public class SuggestionModel implements Serializable {
    private static final long serialVersionUID = 4716000391797476616L;

    private int id;
    private int uid;
    private int type;
    private String content;
    private String title;
    private Date createDate;
    private Date updateDate;
}
